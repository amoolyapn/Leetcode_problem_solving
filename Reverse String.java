import java.util.Arrays;

class Solution {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
    
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        
        Solution sol = new Solution();
        sol.reverseString(s);

        System.out.println(Arrays.toString(s));  
    }
}
