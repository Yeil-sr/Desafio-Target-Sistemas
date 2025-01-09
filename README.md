#  Desafio de Código

Este repositório contém soluções em Java para os desafios de código propostos, relacionados a problemas de faturamento, sequência de Fibonacci e manipulação de strings. O projeto foi estruturado para separação clara de responsabilidades, utilizando classes e interfaces, e faz uso de um arquivo JSON como fonte de dados para alguns dos desafios.

## Estrutura do Projeto

- **src/**: Contém o código fonte do projeto, com classes separadas por questões.
  - **App.java**: Classe principal que coordena a execução das soluções.
  - **Questao1.java**: Solução para o cálculo do valor da variável `SOMA`.
  - **Questao2.java**: Verifica se um número pertence à sequência de Fibonacci.
  - **Questao3.java**: Realiza análise de faturamento diário com base no arquivo JSON.
  - **Questao4.java**: Calcula o percentual de representação do faturamento mensal por estado.
  - **Questao5.java**: Inverte os caracteres de uma string sem utilizar funções prontas.
- **data/**: Contém o arquivo `dados.json` usado na Questão 3.
- **docs/**: Contém este arquivo README e documentação adicional.

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Yeil-sr/Desafio-Target-Sistemas.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd faturamento-desafio
   ```

3. Importe o projeto em sua IDE Java favorita (Eclipse, IntelliJ, etc.) ou compile via linha de comando:

   ```bash
   javac -d bin src/*.java
   ```

4. Execute a classe principal:

   ```bash
   java -cp bin App
   ```

## Explicação das Soluções

### Questão 1: Soma com Laço
Calcula o valor de `SOMA` após executar um laço de incrementação.
- **Entrada**: Nenhuma.
- **Saída**: Valor final de `SOMA`.

### Questão 2: Sequência de Fibonacci
Verifica se um número pertence à sequência de Fibonacci.
- **Entrada**: Um número inteiro.
- **Saída**: Mensagem indicando se o número pertence à sequência.

### Questão 3: Análise de Faturamento Diário
Baseada em dados JSON:
- **Saídas**:
  - Menor valor de faturamento.
  - Maior valor de faturamento.
  - Número de dias com faturamento acima da média mensal.

### Questão 4: Percentual de Faturamento
Calcula a representação percentual do faturamento de cada estado.
- **Entrada**: Valores de faturamento.
- **Saída**: Percentuais de representação.

### Questão 5: Inversão de String
Inverte os caracteres de uma string sem funções prontas.
- **Entrada**: Uma string.
- **Saída**: String invertida.

## Tecnologias Utilizadas

- **Java**: Linguagem principal.
- **JSON**: Formato de dados usado na Questão 3.

## Contato

Criado por [Yale  Souza](https://www.yaledesigner.com.br).

Caso tenha dúvidas ou sugestões, entre em contato pelo e-mail: contato@yaledesigner.com.br.

