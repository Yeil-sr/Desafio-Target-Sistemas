public class App {
    public static void main(String[] args) {
        // Execute cada questão
        System.out.println("Questão 1:");
        new question1.Question1().solve();
        
        System.out.println("\nQuestão 2:");
        new question2.Question2().solve(21); 
        
        System.out.println("\nQuestão 3:");
        new question3.Question3().solve();
        
        System.out.println("\nQuestão 4:");
        new question4.Question4().solve();
        
        System.out.println("\nQuestão 5:");
        new question5.Question5().solve("OpenAI");
    }
}
