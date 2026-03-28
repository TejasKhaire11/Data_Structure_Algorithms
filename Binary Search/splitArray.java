public class splitArray {
    

    static int splitArray(int[] nums, int k) {
        int max = 0;
        long sum = 0;
        
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        
        long low = max, high = sum;
        
        while (low < high) {
            long mid = (low + high) / 2;
            
            if (canSplit(nums, k, mid)) {
                high = mid;  // mid works, try smaller
            } else {
                low = mid + 1;  // mid too small, try bigger
            }
        }
        
        return (int) low;
    }
    
    static boolean canSplit(int[] nums, int k, long maxSumAllowed) {
        int subarrays = 1;
        long currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxSumAllowed) {
                subarrays++;
                currentSum = num;
                if (subarrays > k) return false;
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        

        int arr[]={7,2,5,10,8};
        int k=2;

        System.out.println(splitArray(arr,k));
    }
}


