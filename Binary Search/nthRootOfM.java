// public class nthRootOfM {
    
// static boolean  findValue(int m,int n){

//     int ans=1;
//     for(int i=1;i<=n;i++){

//         ans*=n;

//     }
//     if(ans==m){
//         return true;
//     }
//     return false;
// }
// public static void main(String[] args) {
    
// int m=69;

// int n=4;

// System.out.println(findValue(m, n));

//     }

// }
public class nthRootOfM{

static int intM(int m,int n ,int mid)
{

    int ans=1;

    for(int i=1;i<=n;i++){

        ans=ans*mid;
        if(ans>m) return 2;

    }
    if(ans==m)return 1;

    return 0;

}
static int mid(int m,int n){

    int low=1;
    int high=m;

    while (low<=high) {
        
        int mid=(low+high)/2;

        int mdn=intM(m, n, mid);

        if(mdn==1){
            return mid;
        }
        else if(mdn==0) low=mid+1;
        else high=mid-1;
    }

    return -1;
}

public static void main(String[] args) {
    
    int m=27;
    int n=3;
    System.out.println(mid(m, n));


}

}