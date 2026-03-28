import java.util.*;


public class TrainPlatformProblem {
    

    static int maxPlatformmsRequired(int arrival[],int departure[]){


        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platform=1;
        int maxPlatforms=1;

        int i=1;
        int j=0;
        int n=arrival.length;


        while(i<n){

            if(arrival[i]<=departure[j]){

                platform++;
                i++;

            }else{

                platform--;
                j++;
            }
            maxPlatforms=Math.max(maxPlatforms,platform);


        }

        return maxPlatforms;

    }

    public static void main(String[] args) {
        
        int arrival[]={900,940,950,1100,1500,1900,1110,1560};
        int departure[]={910,1200,1120,1130,1900,1700,1800,1800};

        int result=maxPlatformmsRequired(arrival, departure);
        System.out.println(result);

    }

}
