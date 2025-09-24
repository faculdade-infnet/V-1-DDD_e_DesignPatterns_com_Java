package br.edu.infnet.infra;

import br.edu.infnet.domain.Funcionario;
import br.edu.infnet.domain.Horista;
import br.edu.infnet.domain.Mensalista;
import br.edu.infnet.domain.Vendedor;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FuncionarioDAO {

    private Firestore firestore;

    FuncionarioDAO() {
        this.firestore = Firebase.getFirestore();
    }

    List<Funcionario> findAll() {
        ArrayList<Funcionario> retorno = new ArrayList<>();
        try {
            firestore = Firebase.getFirestore();
            ApiFuture<QuerySnapshot> query = firestore.collection("funcionarios").get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (QueryDocumentSnapshot document : documents) {
                Funcionario funcionario = null;
                String tipo = document.getString("tipo");
                switch (tipo) {
                    case "mensalista" -> funcionario = new Mensalista(
                                document.getLong("matricula"),
                                document.getString("nome"),
                                document.getString("cargo"),
                                document.getDouble("salario")
                        );
                    case "vendedor" -> funcionario = new Vendedor(
                                document.getLong("matricula"),
                                document.getString("nome"),
                                document.getDouble("salario"),
                                document.getDouble("comissao"),
                                document.getDouble("totalVendas")
                        );
                    case "horista" -> funcionario = new Horista(
                                document.getLong("matricula"),
                                document.getString("nome"),
                                document.getString("cargo"),
                                document.getDouble("valorHora"),
                                document.getLong("totalHoras")
                        );
                }
                retorno.add(funcionario);
            }
            Firebase.close();
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Erro na consulta com o Firebase");
        }
        return retorno;
    }
}
