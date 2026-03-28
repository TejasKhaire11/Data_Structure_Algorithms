
// import java.util.ArrayList;

// public class findMedianOfSorted {
    
//     static int function(int arr1[],int arr2[]){
//         int n=arr1.length+arr2.length;
//         int i=0;
//         int j=0;
//         ArrayList<Integer>arr3=new ArrayList<>();

//         while(i<arr1.length && j<arr2.length){

//             if(arr1[i]<arr2[j]){
//                 arr3.add(arr1[i]);
//                 i++;
//             }else{
//                 arr3.add(arr2[j]);
//                 j++;
//             }
//         }
//         while(i<arr1.length){
//             arr3.add(arr1[i]);
//             i++;
//         }
//         while (j<arr2.length) { 
//                 arr3.add(arr2[j]);
//                 j++;

//         }


//         if(n%2==1){
//             return (arr3.size()/2);
//         }
//         return (arr3.size()/2)+((arr3.size()/2)-1);
//     }





//     public static void main(String[] args) {
        
//         int arr1[]={1,3,4,7,10,12};
//         int arr2[]={2,3,6,15};

//       System.out.println(function(arr1, arr2));  

//     }
// }

 class findMedianOfSorted {


    static void function(int arr1[],int arr2[]){

        int n1=arr1.length;
        int n2=arr2.length;

        int n=n1+n2;
        int i=0;
        int j=0;
        int ind2=n/2;
        int ind1=ind2-1;
        int count=0;
        int indel1=-1,indel2=-1;

        while(i<n1 && j<n2){

            if(arr1[i]<arr2[j]){

            if(count==ind2) indel1=arr1[i];
            if(count==ind1) indel2=arr1[i];
            count++;
            i++;
            }
            else{
                if(count==ind1) indel1=arr2[j];
                if(count==ind2) indel2=arr2[j];
                count++;
                j++;
            }
    }
    while (i<n1) { 
        
            if(count==ind2) indel1=arr1[i];
            if(count==ind1) indel2=arr1[i];
            count++;
            i++;

    }
    while (j<n2) {

                if(count==ind1) indel1=arr2[j];
                if(count==ind2) indel2=arr2[j];
                count++;
                j++;
 
 
            }
            System.out.println(indel1+indel2);




    }

    public static void main(String[] args) {

         int arr1[]={1,3,4,7,10,12};
        int arr2[]={2,3,6,15};
        function(arr1, arr2);
    }

 }
