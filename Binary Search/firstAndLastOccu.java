
// import java.util.List;
// import java.util.Arrays;


// public class firstAndLastOccu {
    
//  static int lowerBound(int arr[],int target,int n){

//     int low=0;
//     int high=n-1;
//     int ans=n;

//     while(low<=high){

// int mid=(low+high)/2;

// if(arr[mid]>=target){
//     ans=mid;
//     high=mid-1;
// }
// else{

//     low=mid+1;
// }
//     }
//     return ans;

//     }
//  static  int UpperBound(int arr[],int target,int n){

//         int low=0;
//         int high=n-1;
//         int ans=n;

//         while(low <= high){

//             int mid=(low+high)/2;

//             if(arr[mid]>target){
//                 ans=mid;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }

//         return ans;
//     }
//  static List<Integer>rootMethod(int arr[],int target,int n)
// {

//  int lb=lowerBound(arr, target, n);
//     if(lb==n || arr[lb]!=target){
//         return Arrays.asList(-1,-1);
//     }

//  return Arrays.asList(lb, UpperBound(arr,target,n)-1);

// }
    
//     public static void main(String[] args) {
      
//         int arr[]={1,3,8,8,8,12,13,15,18,21};  
//         int target=20;
//         int n=arr.length;
       
//         System.out.println(rootMethod(arr, target, n));
    
        

//     }
// }
 

    //SECOND APPROCH


import java.util.List;
import java.util.Arrays;
    class firstAndLastOccu{

        static int firstOcurrence(int arr[],int target,int n){

            int low=0,high=n-1;
            int first=-1;

            while(low<=high){

                int mid=(low+high)/2;

                if(arr[mid]==target){

                    first=mid;
                    high=mid-1;
                }else if(arr[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }

            }

            return first;

        }
        static int lastOccurence(int arr[],int target,int n){

             int low=0,high=n-1;
            int last=-1;
             while(low<=high){

                int mid=(low+high)/2;

                if(arr[mid]==target){
                    last=mid;
                    low=mid+1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
             }


             return last;

        }

        static List<Integer>output(int arr[],int target,int n){

            int first=firstOcurrence(arr,target,n);

            if(first==-1) return Arrays.asList(-1,-1);

            return Arrays.asList(first,lastOccurence(arr,target,n));
            
        }

public static void main(String[] args) {
    
 int arr[]={1,3,8,8,8,12,13,15,18,21};  
 int target=21;
 int n=arr.length;
System.out.println(output(arr, target, n));

}
    }