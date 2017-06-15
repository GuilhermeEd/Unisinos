
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // atributos
    private int codigo;
    private String nome;
    private String telefone;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(int c, String n, String t)
    {
        // inicializando atributos da classe
        codigo = c;
        nome = n;
        telefone = t;
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getTelefone()
    {
        return telefone;
    }
    
    // Método de Comandos de Saída
    public void exibeDados()
    {
        System.out.println("DADOS DO CLIENTE");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}