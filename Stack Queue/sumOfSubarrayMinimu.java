
import java.util.Stack;

public class sumOfSubarrayMinimu {
    
    private int[]  nextSmallerElment(int arr[]){

        int n=arr.length;

        Stack <Integer>st=new Stack<>();
        int nse[]=new int[n];

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);

        }

        return nse;
    }

    private int []  priviousSmallerElement(int arr[]){

        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int PSE[]=new int[n];

        for(int i=0;i<n;i++){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            PSE[i]=st.isEmpty()?-1:st.peek();
            st.push(i);

        }

        return PSE;


    }
    public  int finalOutput(int arr[]){

        int n=arr.length;
        int nse[]=nextSmallerElment(arr);
        int PSE[]=priviousSmallerElement(arr);

        long total=0;
        int mod=(int)(1e9+7);

        for(int i=0 ;i <n ;i++){

            long left=i-PSE[i];
            long right=nse[i]-1;

            long contribution=(left*right)%mod;
            contribution=(contribution*arr[i])%mod;
            total=(total+contribution)%mod;


        }   

        return (int)total;

    }

    public static void main(String[] args) {
        
        int arr[]={1,4,6,7,3,7,8,1};

        sumOfSubarrayMinimu obj=new sumOfSubarrayMinimu();
        int t=obj.finalOutput(arr);

        System.out.println(t);
    }

}
