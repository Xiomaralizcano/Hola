public class Fibonacci {
    public static void main(String[] args) {
        int n = 50; // Número de términos a imprimir
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        // Calculamos los términos de la sucesión
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Imprimimos los términos
        for (int i = 0; i < n; i++) {
            System.out.println(fib[i]);
        }
    }
}
