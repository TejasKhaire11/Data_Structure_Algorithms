import java.util.ArrayList;
import java.util.List;

public class printAllPrimeFactors {
    
    public static List<Integer>allPrimeFactorsOfNumber(int n){

        List<Integer>ans=new ArrayList<>();
    for(int i=2;i*i<=n;i++){

        if(n%i==0){
            ans.add(i);
        
        while(n%i==0){
            n=n/i;
        }
    }
}
    if(n!=1)ans.add(n);
          

  return ans;
    }


    public static void main(String[] args) {
        
        System.out.println(allPrimeFactorsOfNumber(15));



    }

}
