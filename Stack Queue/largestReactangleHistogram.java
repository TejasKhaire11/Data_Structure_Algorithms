import java.util.Stack;

public class largestReactangleHistogram {
    
    public static  int largestRectangleArea(int arr[]){

        Stack<Integer>st=new Stack<>();

        int n=arr.length;
        int maxAns=0;
        int element=0;
        int nse=0;
        int pse=0;


        for(int i=0;i<n;i++){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){

                element=st.peek();
                st.pop();

                nse=i;
                pse=st.empty()?-1:st.peek();

                maxAns=Math.max(maxAns, arr[element]*(nse-pse-1));

            }
            st.push(i);   

        }

        while(!st.isEmpty()){

            nse=n;
            element=st.peek();
            st.pop();
            pse=st.isEmpty()?-1:st.peek();

            maxAns=Math.max(maxAns, arr[element]*(nse-pse-1));

        }

        return maxAns;


    }


    public static void main(String[] args) {
        
        
        int[] histogram = {2, 1, 5, 6, 2, 3};

        int result = largestRectangleArea(histogram);

        System.out.println("Largest Rectangle Area = " + result);

    }



}
