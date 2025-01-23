import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double primeiroValor;
        Double segundoValor;
        String operacao;
        boolean continuar;

        do {
            System.out.println("Digite o primeiro valor: ");
            primeiroValor = sc.nextDouble();

            System.out.println("Digite a operação: +, -, *, / ");
            operacao = sc.next();

            System.out.println("Digite o segundo valor: ");
            segundoValor = sc.nextDouble();

            System.out.println("Resultado: " + calcular(primeiroValor, segundoValor, operacao));

            continuar = (verificarNovaOperacao());

        } while (continuar);
    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.print("Deseja realizar outra operação? (sim/não): ");
        resposta = sc.nextLine().trim().toLowerCase();

        while (!resposta.equals("sim") && !resposta.equals("não")) {
            System.out.print("Entrada inválida. Digite 'sim' ou 'não': ");
            resposta = sc.nextLine().trim().toLowerCase();
        }
        return resposta.equals("sim");
    }

    public static Double calcular(Double primeiroValor, Double segundoValor, String operacao) {
        Double  respostaCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaCalculo = primeiroValor + segundoValor;
                break;
            case "-":
                respostaCalculo = primeiroValor - segundoValor;
                break;
            case "*":
                respostaCalculo = primeiroValor * segundoValor;
                break;
            case "/":
                respostaCalculo = primeiroValor / segundoValor;
                break;

            default:
                System.out.println("Operação inválida");
        }

        if (operacao.equals("/") && segundoValor == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        return respostaCalculo;
    }
}