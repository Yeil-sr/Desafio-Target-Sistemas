package question5;

public class Question5 {
    public void solve(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + reversed);
    }
}
