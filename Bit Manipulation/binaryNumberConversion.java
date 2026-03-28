class binaryNumberConversion{

   

        static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }


   static  String convert2Binary(int n){

    String res="";

    while(n>0){
        if(n%2==1)res+='1';
        else res+='0';
        n=n/2;
    }
    res= reverse(res);

    return res;
   } 
    public static void main(String[] args) {
        

        String s=convert2Binary(4);
        System.out.println(s);


    }


}