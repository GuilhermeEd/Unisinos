public class Aluno {

    protected String nome;
    protected Float nota1;
    protected Float nota2;

    public Aluno(String nome, Float nota1, Float nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String toString(){
        float media = (this.nota1 + this.nota2) / 2;
        return String.format("Nome: %s\nMédia: %f\r\n",this.nome, media);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Float getNota1(){
        return this.nota1;
    }

    public void setNota1(Float nota){
        this.nota1 = nota;
    }

    public Float getNota2(){
        return this.nota2;
    }

    public void setNota2(Float nota){
        this.nota2 = nota;
    }

}