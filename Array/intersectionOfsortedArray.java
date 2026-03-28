
import java.util.ArrayList;

// import java.util.ArrayList;

// public class intersectionOfsortedArray {
 
//     public static void main(String[] args) {

//         int a[]={1,2,2,3,3,4,5,6};
//         int b[]={2,3,3,5,6,6,7};
//         int visit[]=new int[b.length];
              
// ArrayList<Integer>ans=new ArrayList<>();

// for(int i=0;i<a.length;i++){

//     for(int j=0; j<b.length;j++){

//         if(a[i]==b[j] && visit[j]==0){
//             ans.add(a[i]);
//             visit[j]=1;
//             break;
//         }
//     } 
// }
//     System.out.println(ans);

//     }
// }
//optimal approch

public class intersectionOfsortedArray{

    public static void main(String[] args) {
        
        ArrayList<Integer>ans=new ArrayList<>();

         int a[]={1,2,2,3,3,4,5,6};
         int b[]={2,3,3,5,6,6,7};

        int i=0;
        int j=0;

        while(i<a.length && j<b.length){

             if(a[i]<b[j]){
            i++;
        }
       else if(b[j]<a[i]){
            j++;
        }
        else{
            ans.add(a[i]);
            i++;
            j++;
        }

     }

        System.out.println(ans);
    }


}

