import java.util.Arrays;

public class divideTwoInteger {
    
  static int[] divideIneger(int divident,int divisor){
    
    if(divident==Integer.MIN_VALUE && divisor==-1){
        return new int[] {Integer.MAX_VALUE};
    }

    boolean sign=(divident<0)^(divisor<0);

    long dvd=Math.abs((long)divident);
    long divs=Math.abs((long)divisor);

    long qoutient=0;


    while(dvd>=divs){

        long temp=divs,multiple=1;


        while(dvd>=(temp<<1)){

            temp<<=1;
            multiple<<=1;

        }

        dvd-=temp;
        qoutient+=multiple;
        
    }

    if(sign)qoutient=-qoutient;

    return new int[]{(int)qoutient,(int)dvd};

  }

    public static void main(String[] args) {
        

        System.out.println(Arrays.toString(divideIneger(43, 5)));

    }



}
