import  java.util.*;

// Time complxity O(3^n) Not optimal


public class CandyDistributionProbelm {

    
    // static int candayProblem(int ratings[]){
    //    int n=ratings.length;
    //     int sum=0;
    //      int left[]=new int[n];
    //     int right[]=new int[n];
    //     //For left side checking
    //     left[0]=1;
    //     for(int i=1;i<n;i++){

    //         if(ratings[i]>ratings[i-1]){
    //             left[i]=left[i-1]+1;
    //         }
    //         else{
    //             left[i]=1;

    //         }
    //     }
    //     //Right side checking
    //     for(int i=n-2;i<0;i--){

    //         if(ratings[i]>ratings[i+1]){
    //             right[i]=right[i+1]+1;
    //         }
    //         else{
    //             right[i]=1;
    //         }
    //     }
    //     for(int i=0;i<n;i++){

    //         sum=sum+Math.max(left[i], right[i]);


    //     }

    //     return sum;


    // }

    static int optimalSolutionCandyProblem(int ratings[]){

        int i=1;
        int sum=1;
        int n=ratings.length;

        while(i<n){

            if(ratings[i]==ratings[i-1]){
                i++;
                sum=sum+1;
                continue;
            }
            
        
        int peak=1;
        while(i<n && ratings[i]>ratings[i-1]){
        
               peak++;
               sum+=peak; 
               i++;
        }
        int down=1;
        while(i<n && ratings[i]<ratings[i-1]){

            down++;
            sum+=down;
            i++;
        }

        if(down>peak){
            sum=sum+(down-peak);
        }

       
        }
        return sum;

    }

    public static void main(String[] args) {
        

        int ratings[]={1,2,3,2,8,9,2,8};
       
       // System.out.println(candayProblem(ratings));

      System.out.println("optimal Solution:"+optimalSolutionCandyProblem(ratings));
    }
}
