public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();

        user = user.signUp("Cassandra", "email@email.com", "senha");
        user = user.signIn("Cassandra", "email@email.com");

        System.out.println("Olá, " + user.getName() + ". Bem-vindo ao RespondeAí!");

        Aulas aula = new Aulas("Cálculo", "Integral");

        System.out.println(aula.salvarConteudo());
        System.out.println(aula.assistirAula());
        System.out.println(aula.fazerExercicios());
    }
}
