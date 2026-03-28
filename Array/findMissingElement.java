
// import java.util.HashSet;

// public class findMissingElement {
    

//     public static void main(String[] args) { 

//  int arr[]={5,2,4,3};
// System.out.println(function(arr));

//     }

// static  int function(int arr[]){
// int N=5;
//     HashSet<Integer>set=new HashSet<>();

//     for(int nums:arr){
//         set.add(nums);
//     }

//     for(int i=1;i<=N;i++){

//         if(!set.contains(i)){
//             return i;
//         }

//     }


// return 0;

// }

// }


//     static int function(int []arr){

//     int N=5;

//     for(int i=1;i<=N;i++){

//         int flag=0;

//         for(int j=0;j<arr.length;j++){

//             if(arr[j]==i){
//                 flag=1;
//                 break;
//             }
//         }
//           if(flag==0) return i;
       
//     }
    
  
// return 0;
//     }




    
// }

//mmost optimal solution

    public class findMissingElement {

public static void main(String[] args) {
    
    int arr[]={1,2,4,5};
    int N=5;

    int xor=0;
    for(int i=0;i<arr.length;i++){

        xor^=arr[i];
        xor^=(i+1);

    }
    xor^=N;
    System.out.println("Missing value is : "+xor);



}
    }