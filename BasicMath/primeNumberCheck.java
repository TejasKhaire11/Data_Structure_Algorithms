import java.util.ArrayList;
import  java.util.List;

public class primeNumberCheck {


    public static List<Integer> primeOrNot(int n){

      List<Integer>ans=new ArrayList<>();
        int count=0;
        for(int i=1;i*i<=n;i++){

            if(n%i==0){
                ans.add(i);
                count=count+1;
            
            if(n/i!=i){
                ans.add(n/i);
                count=count+1;
            }

        }

        }

        return ans;

    }

    public static void main(String[] args) {
       
        System.out.println(primeOrNot(13));



    }

}
