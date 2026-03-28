import java.util.*;


public class nearestSmallerelemt {
    
    static int[] findNSE(int arr[]){

        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int nse[]=new int[n];
        Arrays.fill(nse, -1);
    
        for(int i=0;i<n;i++){


            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?-1:st.peek();
             st.push(arr[i]);   

        }

        return nse;

    }
   
    public static void main(String[] args) {
        
        int arr[]={2,10,12,1,11};
        System.out.println(Arrays.toString(findNSE(arr)));


    }

}

