import java.util.List;
import java.util.Arrays;
    public class countOfOcuuurence {
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

        static int count(int arr[],int target,int n){

            List<Integer>ans=output(arr, target, n);

            if(ans.get(0)==-1)return 0;
            int first=ans.get(0);
            int last=ans.get(1);
            return (last-first+1);

        }




    public static void main(String[] args) {
        
 int arr[]={1,3,8,8,8,12,13,15,18,21};  
 int target=8;
 int n=arr.length;
System.out.println(count(arr, target, n));




    }
}
