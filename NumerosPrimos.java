public class NumerosPrimos {
    public static void main(String[] args) {
        // Pedimos un número al usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.close();

        // Verificamos si el número es primo
        if (esPrimo(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " no es un número primo");
        }

        // Imprimimos los números primos entre 1 y 100
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}    
