
public class Pessoa
{
    private String nome;
    private int idade;
    
    public Pessoa ( String n, int i )
    {
        nome = n;
        idade = i;
    }
    
    public void fazAniversario( )
    {
        idade = idade + 1;
    }
    
    public void exibeDados( )
    {
        System.out.println (nome);
        System.out.println (idade);
    }
}