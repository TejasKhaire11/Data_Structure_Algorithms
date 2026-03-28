
    // import java.util.*;

    // public class ThreeSum {
        
    //     static List<List<Integer>>threeSum(int arr[]){

    //         Set<List<Integer>>result=new HashSet<>();

    //         int n=arr.length;
    //         for(int i=0;i<n;i++){
    //             HashSet<Integer>hashSet=new HashSet<>();
    //             for(int j=i+1;j<n;j++){
    //                 int third=-(arr[i]+arr[j]);
    //                 if(hashSet.contains(third)){
    //                     int []temp={arr[i],arr[j],third};
    //                     Arrays.sort(temp);
    //                    result.add(Arrays.asList(temp[0],temp[1],temp[2]));
    //                 }
    //                 hashSet.add(arr[j]);

    //             }
                
    //         }

    //         return new ArrayList<>(result);

    //     }
    //     public static void main(String[] args) {
        
    //         int arr[]={-1,0,1,2,-1,4};
    //         List<List<Integer>>ans= threeSum(arr);
    //       System.out.println(ans);


    //     }
    // }
    import java.util.*;
public class ThreeSum{

    static List<List<Integer>>threeSum(int nums[]){

        Set<List<Integer>>result=new HashSet<>();

        int n=nums.length;
        for(int i=0;i<n;i++){

            if(i>0 && nums[i]==nums[i-1] )continue;

            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if (sum<0) {
                    j++;
                }
                else if (sum>0) {
                    k--;

                }
                else{

                    int []temp={nums[i],nums[j],nums[k]};
                    result.add(Arrays.asList(temp[0],temp[1],temp[2]));
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;

                }

            }

        }

        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        
        int nums[]={-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};

        List<List<Integer>>ans=threeSum(nums);
        System.out.println(ans);

    }
}