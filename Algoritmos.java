public class Algoritmos {

    private int n;

    public Algoritmos(int n) {
        this.n = n;
    }
    public int[] calcularNumerosPrimos() {
        int[] primos = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }
        return primos;
    }
    public int[] calcularFibonacci() {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
    private boolean esPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
