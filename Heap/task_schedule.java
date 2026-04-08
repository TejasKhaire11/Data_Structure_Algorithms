import java.util.*;

public class task_schedule {
    
    static int function(char arr[],int n){

        char freq[]=new char[26];

        //Count freq for each Character
        for(char ch:arr){

            freq[ch-'A']++;
            
        }

        // take maxFreq
        int maxFreq=0;
    
        for( int f:freq){

         maxFreq=Math.max(f, maxFreq);
        
        }

        int countmaax=0;

        for(int f:freq){

            if(maxFreq==f){
                countmaax++;
            }
        }

        return Math.max(arr.length,( maxFreq-1)*(n+1)+countmaax);


    }

    public static void main(String[] args) {
        
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;

        System.out.println(function(tasks, n));


    }


}
