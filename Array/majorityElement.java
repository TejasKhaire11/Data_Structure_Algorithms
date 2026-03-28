
import java.util.ArrayList;

// import java.util.ArrayList;
// import java.util.HashMap;

// public class majorityElement {
    
    
//     static void functiom(int arr[]){

//         ArrayList<Integer>ls=new ArrayList<>();
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int n=arr.length;
//         int min=n/3+1;

//         for(int i=0;i<n ;i++){

//             map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

//             if(map.get(arr[i])==min){
//                 ls.add(arr[i]);
//             }

//             if(ls.size()==2)break;

//         }
//         System.out.println("The value is :"+ls);

//     }
//     public static void main(String[] args) {
    
//         int arr[]={1,1,1,1,3,2,2,2};

//         functiom(arr);

//     }
// }
class majorityElement{

    static void functiom(int arr[]){

        int count1=0;
        int count2=0;

        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0;i<n;i++){

            if(count1==0 && ele2!=arr[i]){
                count1=1;
                ele1=arr[i];
            }
           else if(count2==0 && ele1!=arr[i]){
                count2=1;
                ele2=arr[i];  
            }

            else if(arr[i]==ele1)count1++;
            else if(arr[i]==ele2)count2++;
            else{
                count1--;
                count2--;
            }

        }

        ArrayList<Integer>ls=new ArrayList<>();
       int  count3=0 , count4=0;
       int min=n/3+1;
        for(int i=0;i<n;i++){
            if(ele1==arr[i])count3++;
            else if(ele2==arr[i])count4++;
        }
        if(count3>=min)ls.add(ele1);
        if(count4>=min)ls.add(ele2);
        System.out.println(ls);

    }

    public static void main(String[] args) {
        
    int arr[]={1,1,1,1,3,2,2,2};
    functiom(arr);    

    }
}