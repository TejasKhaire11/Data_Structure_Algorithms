
import java.lang.reflect.Array;
import java.util.ArrayList;

// import java.util.ArrayList;

// public class leaderAnArray {
    
//     static void leaderOfArray(int arr[]){
//         ArrayList<Integer>ans=new ArrayList<>();
//         int n=arr.length;

//         for(int i=0;i<n ;i++){
//         boolean leader=true;

//             for(int j=i+1;j<n;j++){

//                 if(arr[j]>arr[i]){
//                     leader=false;
//                     break;
//                 }
                
//             }
//             if(leader){
//                 ans.add(arr[i]);
//             }
            
//         }
//         System.out.print(ans);

//     }
//     public static void main(String[] args) {
    
//         int [] arr={10,22,12,3,0,6};
//         leaderOfArray(arr);

//     }
// }


//optimal approch 

class leaderAnArray{

    static void leaderOfArray(int arr[]) {

ArrayList<Integer>ans=new ArrayList<>();

        int n=arr.length;
        int maxvalue=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){

            if(arr[i]>maxvalue){
                ans.add(arr[i]);
            }
            maxvalue=Math.max(maxvalue, arr[i]);

        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        
         int [] arr={10,22,12,3,0,6};
        leaderOfArray(arr);


    }
}