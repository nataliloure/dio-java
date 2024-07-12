import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SimulacaoBancaria {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            // Lê a opção do usuário
            StringTokenizer st = new StringTokenizer(br.readLine());
            int opcao = Integer.parseInt(st.nextToken());

            switch (opcao) {
                case 1:
                    saldo = depositar(br, saldo);
                    break;
                case 2:
                    saldo = sacar(br, saldo);
                    break;
                case 3:
                    verSaldo(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Método para depositar
    public static double depositar(BufferedReader br, double saldo) throws IOException {
        double deposito = Double.parseDouble(br.readLine());
        saldo += deposito;
        System.out.println("Saldo atual: " + saldo);
        return saldo;
    }

    // Método para sacar
    public static double sacar(BufferedReader br, double saldo) throws IOException {
        double saque = Double.parseDouble(br.readLine());
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }

    // Método para ver saldo
    public static void verSaldo(double saldo) {
        System.out.println("Saldo atual: " + saldo);
    }
}
