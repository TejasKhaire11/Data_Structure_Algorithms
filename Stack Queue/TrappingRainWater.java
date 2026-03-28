public class TrappingRainWater {

    static int findTotal(int[] arr) {

        int n = arr.length;
        int leftMax = 0, rightMax = 0;
        int total = 0;

        int l = 0, r = n - 1;

        while (l <= r) {

            if (arr[l] < arr[r]) {

                if (arr[l] >= leftMax) {
                    leftMax = arr[l];
                } else {
                    total += leftMax - arr[l];
                }
                l++;

            } else {

                if (arr[r] >= rightMax) {
                    rightMax = arr[r];
                } else {
                    total += rightMax - arr[r];
                }
                r--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,2,1,1,3,2,1,2,1};
        System.out.println(findTotal(arr));
    }
}
