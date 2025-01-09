package question1;

public class Question1 {
    public void solve() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Valor final de SOMA: " + SOMA);
    }
}
