public abstract class Usuario
{
    // atributos comuns para todos os usuários
    private int matricula;
    private String nome;
    private String login;
    private String senha;

    //método construtor para todos os usuários
    public Usuario(int mat, String nom, String log, String sen)
    {
        matricula = mat;
        nome = nom;
        login = log;
        senha = sen;
    }

    //método de acesso ao atributo: matrícula
    public int getMatricula()
    {
        return matricula;
    }
    
    //método de cnfiguração do atributo: matrícula
    public void setMatricula(int mat)
    {
        matricula = mat;
    }
    
    //método de acesso ao atributo: nome
    public String getNome()
    {
        return nome;
    }
    
    //método de cnfiguração do atributo: nome
    public void setNome(String nom)
    {
        nome = nom;
    }
    
    //método de acesso ao atributo: login
    public String getLogin()
    {
        return login;
    }
    
    //método de cnfiguração do atributo: login
    public void setLogin(String log)
    {
        login = log;
    }
    
    //método de acesso ao atributo: senha
    public String getSenha()
    {
        return senha;
    }
    
    //método de cnfiguração do atributo: senha
    public void setSenha(String sen)
    {
        senha = sen;
    }
    
    public void exibeDados()
    {
        System.out.println(""); 
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
    }
}
