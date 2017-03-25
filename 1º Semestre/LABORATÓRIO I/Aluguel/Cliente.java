public class Cliente
{
    private int codigo;
    private String nome;
    private String telefone;
    
    public Cliente(int cd, String no, String tel)
    {
        codigo = cd;
        nome = no;
        telefone = tel;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getTelefone()
    {
        return telefone;
    }
    
}