public class Usuario
{
    // atributos da classe
    private String email;
    private String senha;
    private String nome;
    private int numeroCelular;
    private int quantidadeInteresses;
    
    // construtor
    public Usuario(String mail, String sen, String no, int cel)
    {
        this.email = mail;
        this.senha = sen;
        this.nome = no;
        this.numeroCelular = cel;
    }
    
    // método de acesso do atributo email
    public String getEmail()
    {
        return this.email;
    }
    
    // método de acesso do atributo senha
    public String getSenha()
    {
        return this.senha;
    }
    
    // método de acesso do atributo nome
    public String getNome()
    {
        return this.nome;
    }
    
    // método de configuração do atributo senha 
    public void setSenha(String novaSenha)
    {
        this.senha = novaSenha;
    }
    
    // método que soma +1 ao atributo quantidadeInteresses toda vez que é executado
    public void adicionaNovoInteresse()
    {
        this.quantidadeInteresses++;
    }
    
    // método para apresentar os dados do usuário (exceto senha)
    public void exibeDados()
    {
        System.out.println("Usuário: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Número de Celular: " + this.numeroCelular);
        System.out.println("Quantidade de Interesses: " + this.quantidadeInteresses);
    }
}