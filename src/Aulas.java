public class Aulas {
    private String disciplina;
    private String assunto;

    public Aulas(String disciplina, String assunto) {
        this.disciplina = disciplina;
        this.assunto = assunto;
    }
    
    public String assistirAula() {
        return "Aula de " + disciplina + ": " + assunto;
    }

    public String salvarConteudo() {
        return "Salvar conteúdo " + disciplina + ": " + assunto;
    }

    public String fazerExercicios() {
        return "Exercícios de " + disciplina + ": " + assunto;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setDisciplina() {
        this.disciplina = disciplina;
    }

    public void setAssunto() {
        this.assunto = assunto;
    }
}
