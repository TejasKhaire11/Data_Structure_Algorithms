import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class nextGreaterElement2 {
    
    //NOT OPTIMAL 

// static  int[] function(int arr[]){

//     int n=arr.length;
//     int nge[]=new int[n];
//     Arrays.fill(nge, -1);

//     for(int i=0 ; i<n;i++){


//         for(int j=i+1;j<i+n;j++){

//             int ind=j%n;
            
//             if(arr[ind]>arr[i]){
//                 nge[i]=arr[ind];
//                 break;
//             }

//         }

//     }

//         return nge;  
// }

    //OPTIMAL

    static int[] function(int arr[]){


        int n=arr.length;
        int nge[]=new int[n];
        Arrays.fill(nge, -1);
        Stack<Integer>st=new Stack<>();

        for(int i=2*n-1;i>0;i--){

            int idx=i%n;

            while(!st.isEmpty() && arr[st.peek()]<=arr[idx]){
                st.pop();
            }

            if(i<n){

            nge[idx]=st.empty()?-1:arr[st.peek()];

            }

            st.push(idx);

        }


        return nge;

    }





    public static void main(String[] args) {
        
        int arr[]={2,10,12,1,11};
        System.out.println(Arrays.toString(function(arr)));

    }

}

