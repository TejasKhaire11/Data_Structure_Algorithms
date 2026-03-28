import java.util.ArrayList;
import  java.util.List;

class printAllDivisor{

   public  static List<Integer> divisorOfNumber(int n){

    List<Integer>ans=new ArrayList<>();

        for(int i=1;i*i<=n;i++){

            if(n%i==0){

                ans.add(i);
            }
            if(n/i!=i){
                ans.add(n/i);
            }

        }
        return ans;

    }

    public static void main(String[]args){

        System.out.println(divisorOfNumber(36));



    }


}