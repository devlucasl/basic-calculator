package JavaCalculator;

import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraCientifica calc = new CalculadoraCientifica();

        do {
            calc.entradaDados(sc);
            calc.calcularOperacoes();
            calc.continuar = calc.verificarNovaOperacao(sc);
        } while (calc.continuar);
        System.out.println("Calculadora finalizada.");
        sc.close();
    }
}

