package question2;

public class Question2 {
    public void solve(int num) {
        int a = 0, b = 1, temp;
        boolean found = (num == 0 || num == 1);

        while (b <= num) {
            if (b == num) {
                found = true;
                break;
            }
            temp = a + b;
            a = b;
            b = temp;
        }

        if (found) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
