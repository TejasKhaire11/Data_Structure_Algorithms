
    import java.util.*;

public class handOfStraights {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if (hand.length % groupSize != 0) return false;

        
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        for (int num : map.keySet()) {
            
            int freq = map.get(num);

            if (freq > 0) {
                
                for (int i = 0; i < groupSize; i++) {
                    
                    int curr = num + i;

                    if (map.getOrDefault(curr, 0) < freq) {
                        return false;
                    }

                    map.put(curr, map.get(curr) - freq);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        handOfStraights obj = new handOfStraights();
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;

        System.out.println(obj.isNStraightHand(hand, groupSize));
    }
}
