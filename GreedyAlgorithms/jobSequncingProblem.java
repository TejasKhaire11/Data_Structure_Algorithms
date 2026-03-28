import java.util.*;

class job{

    int id;
    int deadline;
    int profit;


    job(int id,int deadline,int profit){

        this.id=id;
        this.deadline=deadline;
        this.profit=profit;


    }

}

public class jobSequncingProblem {

     static void jobShecduling(job[]jobs){

        Arrays.sort(jobs,(a,b) ->b.profit-a.profit);

        int n=jobs.length;

        int maxdeadline=0;

        for(job j:jobs){
            maxdeadline=Math.max(maxdeadline,j.deadline);

        }

        int []slot=new int[maxdeadline+1];
        Arrays.fill(slot, -1);

        int totalProfit=0;
        int countjobs=0;

        for(int i=0;i<n;i++){

            for(int j=jobs[i].deadline;j>0;j--){

                if(slot[j]==-1){
                    slot[j]=jobs[i].id;
                    totalProfit+=jobs[i].profit;
                    countjobs++;
                    break;
                }
            }
        }

        System.out.println("total job done:"+countjobs);
        System.out.println(totalProfit);

        for(int i=1;i<=maxdeadline;i++){
            if(slot[i]!=-1){
                System.out.println("j"+slot[i]+" ");
            }
        }

     }



    public static void main(String[] args) {
        
        job[]jobs={

            new job(1, 2   ,100),
            new job(2, 1   ,19),
            new job(3, 2   ,27),
            new job(4, 1   ,25),
            new job(5, 3    ,15),
               
        };

        jobShecduling(jobs);

    }

}
