public class Conta{
    protected double saldo;
    private String numeroAgencia;
    private int numeroDaConta;

    public Conta(double saldo, String numeroAgencia, int numeroDaConta){
        this.saldo = saldo;
        this.numeroAgencia = numeroAgencia;
        this.numeroDaConta = numeroDaConta;
    }

    public double getExtrato(){
        return this.saldo;
    }

    public void getInformationOfAccount(){
        System.out.println("Saldo: R$"+ this.saldo + "\nNúmero da Agência: "+this.numeroAgencia+"\nNúmero da Conta: " + this.numeroDaConta);
    }
}