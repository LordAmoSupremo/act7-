public class Main {
    public static void main(String[] args) {
        Algoritmos algoritmos = new Algoritmos(20);

        int[] primos = algoritmos.calcularNumerosPrimos();
        int[] fibonacci = algoritmos.calcularFibonacci();

        System.out.println("Números primos:");
        for (int primo : primos) {
            System.out.print(primo + ", ");
        }

        System.out.println("\n\nSucesión de Fibonacci:");
        for (int num : fibonacci) {
            System.out.print(num + ", ");
        }
    }
}
