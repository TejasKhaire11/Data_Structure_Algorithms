public class leftRotateArray {
    

    static void function(int nums[]){

        int temp=nums[0];
        for(int i=1 ;i<nums.length;i++){

            nums[i-1]=nums[i];

        }
        nums[nums.length-1]=temp;
       
       for(int i=0 ;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }

    }

    public static void main(String[] args) {
        
int nums[]={3,5,6,1,2,3,7,8};

leftRotateArray.function(nums);

    }
}
