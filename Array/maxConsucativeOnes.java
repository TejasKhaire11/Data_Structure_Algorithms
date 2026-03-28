public class maxConsucativeOnes {
    

    public static void main(String[] args) {
        
        int arr[]={1,1,0,1,1,1,0,1,1};
        int count=0;
        int max=0;
     int i=0;
        while(i<arr.length){

                if(arr[i]==1){
                    count+=1;
                    max=Math.max(max, count);
                    i++;
                }
                else{
                    count=0;
                    i++;
                }



            }
          
        
        System.out.println(max);

    }
}
