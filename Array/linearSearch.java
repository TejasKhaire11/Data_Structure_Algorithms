public class linearSearch {
    
static int function(int nums[] ,int k){


for(int i=0;i<nums.length;i++){

    if(nums[i]==k){
        return i;
    }


}


return -1;


}
    public static void main(String[] args) {
        int nums[]={1,2,4,3,4,9};
        int k=4;
        System.out.println(function(nums,k));

    }
}
