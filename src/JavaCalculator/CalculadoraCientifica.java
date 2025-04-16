package JavaCalculator;

public class CalculadoraCientifica extends Calculadora {
    public double calcularRaiz() {
        double raiz = Math.sqrt(primeiroValor);
        System.out.println("Resultado: " + raiz);
        return raiz;
    }

    public double calcularPotencia() {
        double potencia = Math.pow (primeiroValor, segundoValor);
        System.out.println("Resultado: " + Math.pow(primeiroValor, segundoValor));
        return potencia;
    }

    @Override
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
            case "raiz":
                return calcularRaiz();
            case "potencia":
                return calcularPotencia();
            default:
                System.out.println("Operação inválida!");
        }
        return 0;
    }
}
