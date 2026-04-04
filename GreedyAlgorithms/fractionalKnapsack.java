import java.util.Arrays;

public class fractionalKnapsack {

    public static void main(String[] args) {

        int value[]={60,100,120};
        int weight[]={20,10,30};

        int capacity=50;

        int n=value.length;

        double [][] ratio=new double[n][2];

        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];

        }
        Arrays.sort(ratio,(a,b)->Double.compare(b[1], a[1]));


        double maxValue=0;

        for(int i=0;i<n;i++){

            int idx=(int)ratio[i][0];

            if(capacity>=weight[idx]){
                maxValue+=value[idx];
                capacity-=weight[idx];

            }else{

                maxValue+=ratio[i][1]*capacity;
                break;

            }

        }
        System.out.println(maxValue);

    }
}
