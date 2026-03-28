
// class moveZeroAttheEnd{

//  public static void main(String[] args) {
//     int nums[]={2,3,0,4,0,0,8,9};
//     int n=nums.length;
//     int temp[]=new int[n];
//     int index=0;
//     for(int i=0 ;i<n ;i++){

//         if(nums[i]!=0){
//             temp[index++]=nums[i];
//         //         ||-This is the posstfix opration

//         }
        
//     }
    
//     for(int i=0;i<n;i++){
//         nums[i]=temp[i];
//     }
//     for(int i=0;i<n;i++){
//         System.out.print( nums[i]+" ");
//     }

//  }

// }


//OPTIMAL SOLUTION ::

class moveZeroAttheEnd{
    public static void main(String[] args) {
        
        int []nums={2,8,0,1,0,0,9,3};

        int n=nums.length;
        int j=-1;
        for(int i=0 ;i<n; i++){
            if(nums[i]==0){
                j=i;
                break;

            }
        }
        
        if(j!=-1){

        
        for(int i=j+1;i<n ;i++){

            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }

        }

    }
        for (int elem : nums) {
            System.out.print(elem+" ");
        }



    }

}
