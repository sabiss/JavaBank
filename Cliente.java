public class Cliente{
    public String nome;
    private String cpf;
    protected Conta conta;

    public Cliente(String nome, String cpf, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }
    
    private boolean verificarValorMaiorQueZero(double valor){
        if(valor > 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean depositar(double valor){
        if(verificarValorMaiorQueZero(valor)){
            conta.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(verificarValorMaiorQueZero(valor)){
            conta.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean mandarPix(double valor, Conta contaDestino){
        if(verificarValorMaiorQueZero(valor)){
            this.conta.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public void getDados(){
        System.out.println("NOME: " + this.nome+"\nCPF: " + this.cpf+"\n-----------------------------------");
    }

    public void getSaldo(){
        this.conta.getExtrato();
    }
}