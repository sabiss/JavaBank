public class Aplicacao{
    public static void main(String[] args){
        Banco nubank = new Banco("1106-1");
        Cliente sabrina = nubank.addNewCliente("Sabrina", "000.000.000-00", 200);
        Cliente gabi = nubank.addNewCliente("Gabriela", "5464896214896", 300);
        nubank.showClients();//

        sabrina.depositar(300);
        sabrina.sacar(100);

        sabrina.mandarPix(5, gabi.conta);
        gabi.getSaldo();
        gabi.conta.getInformationOfAccount();

    }
}