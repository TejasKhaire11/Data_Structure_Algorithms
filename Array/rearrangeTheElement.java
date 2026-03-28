
import java.util.ArrayList;

// public class rearrangeTheElement {
    
// static void rearrange(){

//     int arr[]={3,1,-2,-5,2,-4};
//     int n=arr.length;
//     int pos[]=new int[n/2];
//     int neg[]=new int[n/2];
    
//     int j=0,k=0;
//     for(int i=0;i<n;i++){

//         if(arr[i]>0){
//             pos[j]=arr[i];
//             j++;
//         }
//         if(arr[i]<0){
//             neg[k]=arr[i];
//             k++;
//         }

//     }
//     j=0;
//     k=0;

//     for(int i=0;i<n;i++){

//        if(i%2==0){
//         arr[i]=pos[j];
//         j++;
//        }else{
//         arr[i]=neg[k];
//         k++;
//        }

//     }
//     printArray(arr);

// }
// static  void printArray(int []arr){

// for(int num:arr){
//     System.out.print(num+" ");
// }
// }

//     public static void main(String[] args) {
//         rearrange();


//     }
// }
//optimal

// public class rearrangeTheElement {

// static void rearrange(){
//      int arr[]={3,1,-2,-5,2,-4};
//      int n=arr.length;
//      int posIndex=0;
//      int negIndex=1;


//      for(int i=0;i<n;i++){

//         if(arr[i]>0){
//             arr[posIndex]=arr[i];
//             posIndex+=2;
//         }
//         else{
//             arr[negIndex]=arr[i];
//             negIndex+=2;

//         }

//      }
//      printArray(arr);

// }
//  static  void printArray(int []arr){

//  for(int num:arr){
//      System.out.print(num+" ");
    
//     }
//  }

// public static void main(String[] args) {
    
//         rearrange();
//     }

// }
// IF UNEQAUL NUMBER OF + & -VE

public class rearrangeTheElement {


    static void rearrange(){

    int arr[]={-3,2,5,-4,8,6};
    int n=arr.length;

int posIndex=0;
int negIndex=0;


ArrayList<Integer>pos=new ArrayList<>();
ArrayList<Integer>neg=new ArrayList<>();
    for(int i=0;i<n;i++){
        
        if(arr[i]<0){
            neg.add(arr[i]);
        }else{
            pos.add(arr[i]);
        }  
    }
    int i=0;
  
    while (posIndex<pos.size() && negIndex<neg.size()) { 

        arr[i++]=pos.get(posIndex++);
        arr[i++]=neg.get(negIndex++);
        
    }
    while(posIndex<pos.size()){
        arr[i++]=pos.get(posIndex++);


    }
    while(negIndex<neg.size()){

        arr[i++]=neg.get(negIndex++);

    }

  printArray(arr);
    }

    static void printArray(int arr[]){

        for(int num:arr){
            System.out.print(num+" ");
        }

    }

    public static void main(String[] args) {
        rearrange();
        
    }
}