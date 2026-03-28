// public class findKthMissingelemnt {
    
//     static int missingElement(int arr[],int k){
//         int n=arr.length;
//         int low=0;
//         int high=n-1;
//         while(low<=high){

//             int mid=(low+high)/2;

//             int missing=arr[mid]-(mid+1);

//             if(missing<k){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }


//         }

//         return low+k;
//     }
//     public static void main(String[] args) {
     
//         int arr[]={4,7,11};
//         int k=2;
//         System.out.println(missingElement(arr, k));


//     }
// }
public class findKthMissingelemnt{

    static int missingValue(int arr[],int k){

       int missingCount=0;
       int num=1;
       int i=0;

       while(true){

        if(i<arr.length && arr[i]==num){
            i++;
        }
        else{

            missingCount++;

            if(missingCount==k){
                return num;
            }

        }
        num++;
       }

        }

       
    
    

    public static void main(String[] args) {
        
        int arr[]={2,3,5,7,11};
        int k=4;
        System.out.println(missingValue(arr, k));

    }
}