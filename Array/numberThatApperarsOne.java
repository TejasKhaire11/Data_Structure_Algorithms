
// import java.util.HashMap;
// public class numberThatApperarsOne {
    
//     public static void main(String[] args) {
        
//         HashMap<Integer,Integer>map=new HashMap<>();

//         int arr[]={1,1,2,3,3,4,4};

//         for(int i=0;i<arr.length ;i++){

//             map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

//         }
//         for(int key:map.keySet()){

//             if(map.get(key)==1){
//                 System.out.println(key);
//             }


//         }
        
//     }
// }

    //ONLY USEFUL WHEN THERE IS ONE NUMBER WHICH APPERRS ONE TIME IF TWO NUMBER APPEARS ONE TIME THEN NOT USEFUL
 public class numberThatApperarsOne {
    
    public static void main(String[] args) {
        
        int arr[]={1,2,2,3,3,4,4};

        int xor=0;

        for(int num:arr){
            xor^=num;

        }
        System.out.println(xor);

    }


 }