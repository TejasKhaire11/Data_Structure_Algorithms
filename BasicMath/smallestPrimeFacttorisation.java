    import java.util.*;

public class smallestPrimeFacttorisation {
    
    // STEP 1: Build Smallest Prime Factor array
    static int[] buildSPF(int N) {
        int spf[] = new int[N + 1];

        // Initially mark spf[i] = i for all i
        for (int i = 1; i <= N; i++) spf[i] = i;

        for (int i = 2; i * i <= N; i++) {

            if (spf[i] == i) { // i is prime

                for (int j = i * i; j <= N; j += i) {

                    if (spf[j] == j) { 
                        spf[j] = i;  // assign smallest prime factor
                    }
                }
            }
        }
        return spf;
    }

    // STEP 2: Factorize using spf[]
    static void factorize(int n, int spf[]) {

        System.out.print("Prime factors: ");

        while (n > 1) {
            System.out.print(spf[n] + " ");
            n = n / spf[n];
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int N = 1000000;   // limit
        
        int spf[] = buildSPF(N);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int n = sc.nextInt();

        factorize(n, spf);
        
        sc.close();
    }
}


