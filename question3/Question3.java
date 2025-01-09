package question3;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Question3 {
    static class Faturamento {
        public int dia;
        public double valor;
    }

    public void solve() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Faturamento> faturamentos = mapper.readValue(
                new File("src/resources/dados.json"),
                new TypeReference<List<Faturamento>>() {}
            );

            double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
            int diasValidos = 0, diasAcimaMedia = 0;

            for (Faturamento f : faturamentos) {
                if (f.valor > 0) {
                    menor = Math.min(menor, f.valor);
                    maior = Math.max(maior, f.valor);
                    soma += f.valor;
                    diasValidos++;
                }
            }

            double media = soma / diasValidos;

            for (Faturamento f : faturamentos) {
                if (f.valor > media) {
                    diasAcimaMedia++;
                }
            }

            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            System.out.println("Dias acima da média: " + diasAcimaMedia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
