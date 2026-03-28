public class mergeSortedArray {
    

    static void swapIfGreater(int arr1[],int arr2[],int ind1,int ind2){

        if(arr1[ind1]>arr2[ind2]){
            int temp=arr1[ind1];
            arr1[ind1]=arr2[ind2];
            arr2[ind2]=temp;
        }
   }

   static void merge(int arr1[],int arr2[],int n,int m){

    int len=n+m;
    int gap=(len/2)+(len%2);

    while(gap>0){
        int left=0;
        int right=left+gap;


        while(right<len){

            if(left<n && right>=n){
                swapIfGreater(arr1, arr2, left, right-n);
            }
            else if(left>=n){
                swapIfGreater(arr2, arr2,left- n,right- n);
            }
            else{
                swapIfGreater(arr1, arr1, left, right);
            }
            left++;
            right++ ;
        }
    
        if(gap==1)break;
        gap=(gap/2)+(gap%2);
    
     }
     printlnArray(arr1, arr2);

 }

 static void printlnArray(int arr1[],int arr2[]){

   for(int x:arr1) System.out.print(x+" ");
   for(int y:arr2) System.out.print(y+" ");
System.out.println();
 }




    public static void main(String[] args) {
        
int arr1[]={1,3,5,7};
int arr2[]={0,2,6,8,9};

merge(arr1, arr2,arr1.length,arr2.length);
    

    }
}
