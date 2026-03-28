
import java.util.Scanner;

public class countPrimeInRange {
    
       static int[] buildSieve(int N) {
        int prime[] = new int[N + 1];

        // Mark all numbers >=2 as prime
        for (int i = 2; i <= N; i++) {
            prime[i] = 1;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= N; i++) {

            if (prime[i] == 1) {   // if i is prime

                for (int j = i * i; j <= N; j += i) {
                    prime[j] = 0;  // mark composite
                }

            }
        }
        return prime;
    }

    public static void main(String[] args) {
        
        
        int N = 100; 
        int prime[]=buildSieve(N);

        for(int i=2;i<=N;i++){

            prime[i]=prime[i]+prime[i-1];
        }
            Scanner sc=new Scanner(System.in);
            System.out.println("enter query's: ");
            int q=sc.nextInt();

            while(q-->0){

                System.out.println("Enter value L:");
                int l=sc.nextInt();
                System.out.println("Enter value R: ");
                int r=sc.nextInt();

                if(l<1)l=1;

                int result=prime[r]-prime[l-1];
                System.out.println("Answer is: "+result);

            }


        



    }
}
