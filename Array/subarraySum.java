// public class subarraySum {
    
//     static int  findSubaary(int arr[]){
//         int count=0;
//         int k=3;
//         int n=arr.length;

//         for(int i=0;i<n;i++){

//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];

//                 if(sum==k)count++;
//             }
          
//         }
//         return count;
//     }
//     public static void main(String[] args) {
        
//         int []arr={1,2,3,-3,1,1,1,4,2,-3};

//       System.out.println(findSubaary(arr));

//     }
// }

import java.util.HashMap;
import java.util.Map;

public class subarraySum {

    static int findSubaary(int arr[]){

        int prefixSum=0;
        int count=0;
        int k=3;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        map.put(0, 1);
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];

            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
        
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);

        }
        return count;

    }
    public static void main(String[] args) {
        

        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(findSubaary(arr));
    }
}