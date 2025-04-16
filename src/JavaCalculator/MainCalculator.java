package JavaCalculator;

import java.util.Scanner;

public class MainCalculator {
    protected double primeiroValor;
    protected double segundoValor;
    protected String operacao;
    protected boolean continuar = true;

    public void entradaDados(Scanner sc) {
        System.out.println("Digite o primeiro valor: ");
        primeiroValor = sc.nextDouble();

        System.out.println("Digite a operacao: (+, -, *, / )");
        operacao = sc.next();

        System.out.println("Digite o segundo valor: ");
        segundoValor = sc.nextDouble();
    }

    public double calcularSoma() {
        double soma = primeiroValor + segundoValor;
        System.out.println("Resultado: " + soma);
        return soma;
    }

    public double calcularSubtracao() {
        double subtracao = primeiroValor - segundoValor;
        System.out.println("Resultado: " +  subtracao);
        return subtracao;
    }

    public double calcularMultiplicacao() {
        double multiplicacao = primeiroValor * segundoValor;
        System.out.println("Resultado: " + multiplicacao);
        return multiplicacao;
    }

    public double calcularDivisao() {
        if (segundoValor == 0) {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
        double divisao = primeiroValor / segundoValor;
        System.out.println("Resultado: " + divisao);
        return divisao;
    }

    public double calcularOperacoes() {
        switch (operacao) {
            case "+":
                return calcularSoma();
            case "-":
                return calcularSubtracao();
            case "*":
                return calcularMultiplicacao();
            case "/":
                return calcularDivisao();
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }

    public boolean verificarNovaOperacao(Scanner sc) {
        sc.nextLine(); // Limpar o buffer
        System.out.println("Deseja realizar outra operação? (sim/não) ");
        String resposta = sc.nextLine().trim().toLowerCase();

        while (!resposta.equals("sim") && !resposta.equals("não")) {
            System.out.println("Entrada inválida, digite 'sim' ou 'não': ");
            resposta = sc.nextLine().trim().toLowerCase();
        }

        return resposta.equals("sim");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainCalculator cal = new MainCalculator();

        do {
            cal.entradaDados(sc);
            cal.calcularOperacoes();
            cal.continuar = cal.verificarNovaOperacao(sc);
        } while (cal.continuar);

        System.out.println("Calculadora finalizada.");
        sc.close();
    }
}