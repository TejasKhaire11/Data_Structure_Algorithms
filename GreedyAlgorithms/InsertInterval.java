import  java.util.*;


public class InsertInterval {
    
    static List<int []>function(int arr[][],int newInterval[]){

        List<int []>result=new ArrayList<>();

        int i=0;
        int n=arr.length;

        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        // FINDING THAT THIER IS NO INTERVAL 

        while (i<n && arr[i][1]<newInterval[0]) { 
            
            result.add(arr[i]);
            i=i+1;

        }

         // FINDING INTERVAL  

        while(i<n && arr[i][0]<newInterval[1]){

            newInterval[0]=Math.min(arr[i][0],newInterval[0]);
            newInterval[1]=Math.max(arr[i][1],newInterval[1]);


            i=i+1;
        }
        result.add(newInterval);


        while (i<n) { 
            
            result.add(arr[i]);
            i=i+1;

        }

        return result;



    }
public static void main(String[] args) {
    
    int arr[][]={

        {1,2},{4,5},{7,8},{3,6},{2,5}

    };

    int newInterval[]={4,5};

    List<int[]>ans=function(arr, newInterval);

    for(int []internal:ans){

        System.out.println(internal[0]+" "+internal[1]);
    }



}



}
