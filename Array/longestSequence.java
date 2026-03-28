
import java.util.HashSet;

// import java.util.*;

// public class longestSequence {
    
//     static void longestArr(int arr[]){
        
//         int priviousno=Integer.MIN_VALUE;
//         int count =0;
//         int lenght=0;
//         int n=arr.length;
//         for(int i=0 ;i<n;i++){

//             if(arr[i]-1==priviousno){
//                 count+=1;
//                 priviousno=arr[i];
//             }else if(priviousno!=arr[i]){
//                 count=1;
//                 priviousno=arr[i];
//             }
//             lenght=Math.max(lenght, count);
//         }
//         System.out.print("The longest sequnce is :"+lenght);

//     }
//     public static void main(String[] args) {
        
//         int[] arr={102,4,100,1,101,3,2,1,1};
//         Arrays.sort(arr);
//         longestArr(arr);

//     }
// }


//optimal code 


public  class  longestSequence{

static int  longestConseqetive(int nums[]){

    int longest=1;

    HashSet<Integer>set=new HashSet<>();

    for(int num:nums){
            set.add(num);
    }

    for(int num:set){

        if(!set.contains(num-1)){
            int x=num;
            int count=1;

            while(set.contains(x+1)){
                count++;
                x++;
            }
            longest=Math.max(longest, count);

        }
        
    }



    return longest;
}


public static void main(String[] args) {
    
int[ ] nums={102,4,100,1,101,3,2,1,1};
System.out.println("The max count of sebsequence is : "+longestConseqetive(nums));

}



}