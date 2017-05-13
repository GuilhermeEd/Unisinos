public class Aluno extends Usuario
{
    // atributos específicos do aluno
    private double notaGA;
    private double notaGB;

    //método construtor Aluno = recebe todos os parâmetros do construtor da superclasse = construtor da classe: Usuario
    public Aluno(int mat, String nom, String log, String sen)
    {
        //encaminha os parâmetros para o construtor da superclasse = construtor da classe: Usuario
        super(mat, nom, log, sen);
    }
    
    //método de acesso ao atributo: notaGA
    public double getNotaGA()
    {
        return notaGA;
    }

    //método de configuração do atributo: notaGA
    public void setNotaGA(double not)
    {
        notaGA = not;
    }

    //método de acesso ao atributo: notaGB
    public double getNotaGB()
    {
        return notaGB;
    }

    //método de configuração do atributo: notaGB
    public void setNotaGB(double not)
    {
        notaGB = not;
    }
}
