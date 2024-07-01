import java.util.Scanner;

public class meuProjetoContaBanco {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);

        // Exibir a mensagem da conta criada
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Detalhes da Conta:");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo Inicial: R$" + conta.getSaldoInicial());

        scanner.close();
    }
}

class ContaBancaria {
    private String nome;
    private String numeroConta;
    private double saldoInicial;

    public ContaBancaria(String nome, String numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }
}
