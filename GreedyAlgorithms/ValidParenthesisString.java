import java.util.*;

public class ValidParenthesisString {

    static boolean function(String s, int ind, int cnt) {

        // invalid if more ')' used
        if (cnt < 0) return false;

        // reached end
        if (ind == s.length()) {
            return cnt == 0;
        }

        char ch = s.charAt(ind);

        if (ch == '(') {
            return function(s, ind + 1, cnt + 1);
        }

        else if (ch == ')') {
            return function(s, ind + 1, cnt - 1);
        }

        else { // '*' case
            return function(s, ind + 1, cnt + 1) ||   // treat as '('
                   function(s, ind + 1, cnt - 1) ||   // treat as ')'
                   function(s, ind + 1, cnt);         // treat as empty
        }
    }

    public static void main(String[] args) {

        String s = "((*)())";
        System.out.println(function(s, 0, 0));
    }
}


