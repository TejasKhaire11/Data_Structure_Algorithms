
import java.util.ArrayDeque;
import java.util.Deque;

// import java.util.TreeSet;

// public class unionOfTwoArrays {
    
// public static void main(String[] args) {
    
//     int arr1[]={1,1,2,3,4,5};
//     int arr2[]={2,3,4,4,5,9,8};
    
//     TreeSet<Integer>t=new TreeSet<>();

//     for(int i=0 ;i<arr1.length;i++){
//         t.add(arr1[i]);
//     }

//     for(int i=0 ;i<arr2.length;i++){
//         t.add(arr2[i]);
//     }
// int union[]=new int[t.size()];
// int i=0;
// for(Integer n:t){
//     System.out.print(union[i++]=n);
// }
// System.out.println(t);

// }
    
// }

            //OPTIMAL APPROCH: two pointe approch

public class unionOfTwoArrays{

    public static void main(String[] args) {
        
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,5,8,9,7};
        int n1=arr1.length;
        int n2=arr2.length;
        Deque<Integer>dq=new ArrayDeque<>();
        int i=0 ,j=0;
        while(i<n1&& j<n2){

            if(arr1[i]<arr2[j]){
                if(dq.isEmpty() || dq.peekLast()!=arr1[i]){
                    dq.add(arr1[i]);
                }
                i++;
            }
            else{
                if(dq.isEmpty()|| dq.peekLast()!=arr2[j]){
                    dq.add(arr2[j]);
                }
                j++;

            }
        }
        while(i<n1){
            if(dq.isEmpty() || dq.peekLast()!=arr1[i]){
                dq.add(arr1[i]);
            }
                i++;
        }
        while(j<n2){
        
               if(dq.isEmpty()|| dq.peekLast()!=arr2[j]){
                    dq.add(arr2[j]);
                }
                j++;
            
        }
        System.out.println(dq);

    }




}


