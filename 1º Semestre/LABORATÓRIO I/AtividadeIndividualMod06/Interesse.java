public class Interesse
{
    // atributos da classe
    private String titulo;
    private String descricao;
    private char tipo;
    private Usuario usuario;
    
    // construtor
    public Interesse(String tit, String desc, char tp, Usuario usr)
    {
        this.titulo = tit;
        this.descricao = desc;
        this.tipo = tp;
        this.usuario = usr;
        
        this.usuario.adicionaNovoInteresse();
    }
    
    // método de acesso do atributo titulo
    public String getTitulo()
    {
        return this.titulo;
    }
    
    // método de acesso do atributo descricao
    public String getDescricao()
    {
        return this.descricao;
    }
    
    // método de acesso do atributo tipo
    public char getTipo()
    {
        return this.tipo;
    }
    
    // método de acesso do atributo usuario
    public Usuario getUsuario()
    {
        return this.usuario;
    }
    
    // método de configuração do atributo titulo
    public void setTitulo(String novoTitulo)
    {
        this.titulo = novoTitulo;
    }
    
    // método de configuração do atributo descricao
    public void setDescricao(String novaDescricao)
    {
        this.descricao = novaDescricao;
    }
    
    // método de configuração do atributo tipo
    public void setTipo(char novoTipo)
    {
        this.tipo = novoTipo;
    }
    
    // método de configuração do atributo usuario
    public void setUsuario(Usuario novoUsuario)
    {
        this.usuario = novoUsuario;
    }
    
    // método para apresentar os dados do interesse
    public void exibeDados()
    {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Usuário: " + this.usuario.getNome());
    }
}