public class Primes {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Récupérer la limite supérieure
        boolean[] isPrime = new boolean[n + 1];

        // Initialiser tous les nombres comme étant potentiellement premiers
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Appliquer le crible d'Ératosthène
        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false; // Marquer les multiples comme non premiers
                }
            }
            p++;
        }

        // Afficher les nombres premiers
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        // Résumé
        System.out.println("There are " + count + " primes between 2 and " + n + 
                           " (" + (count * 100 / n) + "% are primes)");
    }
}
