
/**
 * Classe Interesse
 */
public class Interesse
{
    /*
     * Crie a classe: Interesse com os seguintes atributos:
     * a. Título = tipo de dados texto;
     * b. Descrição = tipo de dados texto;
     * c. Tipo = tipo de dados caractere: (C = Carreira, P = Pessoal);
     * d. Usuário = tipo de dados Usuario.
     */
    private String titulo;
    private String descricao;
    private char tipo;
    private Usuario usuario;
    
    /*
     * Crie um Construtor que receba como parâmetro os valores dos atributos:
     * i. Título; 
     * ii. Descrição;
     * iii. Tipo; 
     * iv. Usuário
     */
    public Interesse(String tt, String ds, char tp, Usuario us)
    {
        titulo = tt;
        descricao = ds;
        tipo = tp;
        usuario = us;// o parâmetro us possui o objeto Usuario.  Este objeto será atribuído para o atributo usuario.
        
        /*
         * O método construtor deve fazer uso também do adicionaNovoInteresse da classe Usuario, 
         * para que, a cada novo interesse cadastrado para um determinado usuario (Associação simples entre classes), 
         * seja calculado e armazenado a quantidade de interesses para o usuario selecionado.
         */
        usuario.adicionaNovoInteresse();
    }

    
    //Metodos de acesso (GET) para todos os atributos
    public String getTitulo()
    {
        return titulo;
    }

    public String getDescricao()
    {
        return descricao;
    }
    
    public char getTipo()
    {
        return tipo;
    }
    
    //este método não foi solicitado (opcional)
    public String getTipoDescricao()
    {
        if(tipo=='C')
            return "Carreira";
        
        return "Pessoal";
    }

    public Usuario getUsuario()
    {
        return usuario;
    }
        
    //Metodos de configuracao (SET) para todos os atributos
    
    public void setTitulo(String tt)
    {
        titulo = tt;
    }

    public void setDescricao(String ds)
    {
        descricao = ds;
    }
    
    public void setTipo(char tp)
    {
        tipo = tp;
    }
    
    public void setUsuario(Usuario us)
    {
        usuario = us;
    }
    
    
    //Metodo exibeDados para apresentar todos os dados da classe
    public void exibeDados()
    {
        System.out.println("\nDados do Interesse:");
        System.out.println("Título:" + titulo);
        System.out.println("Descrição:" + descricao);
        System.out.println("Tipo:" + getTipoDescricao());
        System.out.println("Usuario:" + usuario.getNome());
    }
        
}
