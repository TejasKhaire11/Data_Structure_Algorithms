// public class TwosumProblem {
    
//     public static void main(String[] args) {

//         TwosumProblem.findTwoSum();


//     }
//     static void findTwoSum(){

//     int  target=14;
//     int arr[]={2,6,5,8,11};
//     int i=0 ,j=i+1;

//     for( i=0;i<arr.length;i++){

//         while(j<arr.length){
//             if(target-arr[i]==arr[j]){
//                 System.out.println(i+" "+j);
//                 break;
//             }
//             j++;
//         }
//         j=i+1;
//       }
//     }
   
//     }



//OPTIMMAL APPROCH USING HASHMAP

import java.util.HashMap;


public class TwosumProblem{

    public static void main(String[] args) {
       
        int arr[]={2,5,6,8,11};
        int k=13;
        TwosumProblem.findTwoSum(arr,k);


    }


    static void findTwoSum(int arr[],int k){


    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++){

        int complement=k-arr[i];
        if(map.containsKey(complement)){
            System.out.println(arr[map.get(complement)]+" "+arr[i]+ "\nindex "+map.get(complement)+" "+i);
            return;
        }

        map.put(arr[i], i);

        

    }
    System.out.println("Tha value is not found");

    }

}