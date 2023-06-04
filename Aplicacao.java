import java.util.Scanner;
public class Aplicacao{
    public static void main(String[] args){
        Banco sabisBank = new Banco("1234-8");
        Scanner leitura = new Scanner(System.in);

        System.out.println("=========================\nOlá! Bem Vindo ao Sabis's Bank\nVamos criar uma conta para você\n=========================\n");

        System.out.println("Informe seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Informe seu CPF: ");
        String cpf = leitura.nextLine();

        System.out.println("Com qual o saldo inicial da sua conta? Informe: ");
        double saldoInicial = leitura.nextDouble();

        Cliente cliente = sabisBank.addNewCliente(nome, cpf, saldoInicial);
        System.out.println("\n======= Esta é a sua conta =======\n");
        cliente.getDados();
        
        int acao;
        final int DEPOSITAR = 1; //FINAL quer dizer que a variável é constante
        final int SACAR = 2;
        final int EXTRATO = 3;
        final int SAIR = 4;

        do{
            System.out.println("O que deseja fazer?\n1..................Depositar\n2..................Sacar\n3..................Extrato\n4..................Sair");
            acao = leitura.nextInt();

            switch(acao){
                case DEPOSITAR:
                    double valorDoDeposito = 0;
                    System.out.println("Informe o valor:");
                    valorDoDeposito = leitura.nextDouble();

                    if(cliente.depositar(valorDoDeposito)){
                        System.out.println("Valor depositado com sucesso!");
                    }else{
                        System.out.println("Informe um valor válido!");
                    }
                    break;
                case SACAR:
                    double valorDoSaque = 0;
                    System.out.println("Seu saldo é de:R$ " + cliente.conta.getExtrato());
                    System.out.println("Informe um valor válido para o saque:");
                    valorDoSaque = leitura.nextDouble();

                    if(cliente.sacar(valorDoSaque)){
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Saldo atual: R$" + cliente.conta.getExtrato());
                    }else{
                        System.out.println("Valor inválido!");
                    }
                    break;
                case EXTRATO:
                    System.out.println("Saldo Atual: R$" + cliente.getSaldo());
                    break;
                case SAIR:
                    break;
            }

        }while(acao != 4);
        System.out.println("Obrigada por usar o Sabis's Bank ;)");
    }
}