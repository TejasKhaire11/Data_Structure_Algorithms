
import java.util.*;
public class fourSum {
    

    static List<List<Integer>>fourSumProblem(int nums[]){
       int  target=8;
        int n=nums.length;
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0 ;i<n ;i++){
            if(i>0 && nums[i]==nums[i-1])continue;

            for(int j=i+1;j<n;j++){
                if(j>0 && nums[j]==nums[j-1])continue;

            int k=j+1;
            int l=n-1;
            
            while(k<l){

                long sum=nums[i]+nums[j];
                sum+=nums[k];
                sum+=nums[l];

                if(sum>target){
                    l--;
                }
                else if(sum<target){
                    k++;
                }
                else{

                    int temp[]={nums[i],nums[j],nums[k],nums[l]};
                    ans.add(Arrays.asList(temp[0],temp[1],temp[2],temp[3]));
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1])k++;
                    while(k<l && nums[l]==nums[l+1])l--;

                }

                }

            }

        }

        return new ArrayList<>(ans);

    }
    public static void main(String[] args) {
        
    int nums[]={1,1,1,2,2,2,3,3,3,4,4,4,5,5};

    List<List<Integer>>ans=fourSumProblem(nums);

    System.out.println(ans);
    }
}
