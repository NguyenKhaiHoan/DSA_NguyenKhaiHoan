package Week5;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> str = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char Ch = s.charAt(i);
            if (Ch == '{' || Ch == '[' || Ch == '(') {
                str.push(Ch);
                continue;
            }
            if (str.isEmpty()) {
                return "NO";
            }
            char popCh = str.pop();
            if (Ch == '}' && popCh != '{') return "NO";
            if (Ch == ']' && popCh != '[') return "NO";
            if (Ch == ')' && popCh != '(') return "NO";
        }
        return str.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s));
    }
}
