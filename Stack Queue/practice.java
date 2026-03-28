import java.util.*;

public class practice {

    void frequncy(String st){


        HashMap<Character, Integer>map=new HashMap<>();

    for(char ch:st.toCharArray()){

        if (map.containsKey(ch)) {

            map.put(ch, map.get(ch)+1);
            
        }
        else{

            map.put(ch,1);


        }


    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


}

    public static void main(String[] args) {

        practice obj=new practice();
        obj.frequncy("tejskhairett");
        
        
    }
    

}