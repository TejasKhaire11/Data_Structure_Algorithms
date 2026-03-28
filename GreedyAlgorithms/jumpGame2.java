class jumpGame2{

        //RECURSION

    static int function(int ind,int jumps){
        
        int[]arr={2,3,1,1,4};
        int n=arr.length;
        if(ind>=n-1)return jumps; 

        int mini=Integer.MAX_VALUE;

        for(int i=1;i<=arr[ind];i++){
            mini=Math.min(mini,function(ind+i, jumps+1));
        }

        return mini;

    }

        //GREEDY APPROCH

    static int function2(int[] arr){

        int n=arr.length;
        int jumps=0;
        int currentEnd=0;
        int farthest=0;

        for(int i=0;i<n-1;i++){

            farthest=Math.max(farthest, i+arr[i]);

            if(currentEnd==i){

                jumps++;
                currentEnd=farthest;

            }

        }
        return jumps;

    }


    public static void main(String[] args) {
        
        int arr[]={2,3,1,1,4};
        System.err.println(function2(arr));


       // System.out.println(function(0, 0));


    }


}

