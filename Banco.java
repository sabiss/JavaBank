import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> listaClientes;
    public String numeroAgencia;

    public Banco(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
        listaClientes = new ArrayList<>();
    }

    public Cliente addNewCliente(String nome, String cpf, double saldoInicial){
        int numeroDaConta = new Random().nextInt(1000);
        Conta novaConta = new Conta(saldoInicial, this.numeroAgencia, numeroDaConta);
        Cliente novoCliente = new Cliente(nome, cpf, novaConta);

        listaClientes.add(novoCliente);
        return novoCliente;
    }
    
    public void showClients(){
        for(Cliente cliente : listaClientes){
            cliente.getDados();
        }
    }

}