
/**
 * Classe Livro
 */
public class Livro
{
    // atributos da classe Livro
    private String titulo;
    private boolean emprestado;

    /**
     * Construtor da classe Livro
     * Recebe uma String como parametro
     * Funcao: Criar o objeto Livro e receber o titulo do livro
     */
    public Livro(String t)
    {
        //atribui o valor do parametro recebido para o atributo titulo
        titulo = t;
        
        //seta o valor false para o atributo emprestado
        emprestado = false; //por padrao todo livro criado estara disponivel
    }

    /**
     * Metodo getTitulo
     * Nao recebe parametros
     * Retornara uma String
     * Funcao: retornar o titulo do objeto criado;
     */
    public String getTitulo()
    {
        return titulo;
    }
    
    
    /**
     * Metodo getSituacao
     * Nao recebe parametros
     * Retornara uma String
     * Funcao: retornar a situacao do livro em forma de String
     */
    public String getSituacao() {
        
        //verifica a disponibilidade do Livro:
        //utiliza um comando de selecao para verificar a disponibilidade do livro:
        if(isEmprestado()) { //chama o metodo: isEmprestado() de dentro do if, este metodo ira retornar true ou false para a verificacao da condicao do if 
            //se o metodo: isEmprestado() retorna true, a condicao do if se torna verdadeira e o comando abaixo e executado
            //retorna o valor = "emprestado" e encerra o metodo
            return " EMPRESTADO";
        }
        else {
            //caso o livro nao esteja emprestado, o metodo: isEmprestado() retorna false e o else e executado
            //retorna o valor = "disonivel" e encerra o metodo
            return " DISPONÃ?VEL";
        }
    }
    
    /**
     * Metodo isEmprestado
     * Nao recebe parametros
     * Retornara um boolean
     * Funcao: retorna o valor do atributo emprestado,
     * deve retornar true para livro emprestado e false para disponivel
     */
    public boolean isEmprestado()
    {
        //retorna o valor do atributo emprestado
        return emprestado;
    }
    
    /**
     * Metodo empresta
     * Nao recebe parametros
     * Nao tem retorno, portanto e do tipo "void"
     * Funcao: ao ser chamado, este metodo ira "emprestar o livro"ou seja, atribuir o valor =true
     * para o atributo = emprestado (somente se o livro esta disponivel)
     */
    public void empresta()
    {
        //verifica se o livro esta disponivel utilizando o comando de selecao if
        if(!isEmprestado()) //se o metodo isEmprestado() retornar false
            emprestado = true; //seta o valor do atributo empresta para true
    }
    
    /**
     * Metodo devolve
     * Nao recebe parametros
     * Nao tem retorno, portanto e do tipo "void"
     * Funcao: ao ser chamado, este metodo ira "devolver o livro"ou seja, atribuir o valor =false
     * para o atributo = emprestado
     */
    public void devolve()
    {
        //seta o valor do atributo empresta para false
        emprestado = false;
    }
    
    /**
     * Metodo exibeDados
     * Nao recebe parametros
     * Nao tem retorno, portanto e do tipo "void"
     * Funcao: ao ser chamado, este metodo apresentar os valores de todos os atributos do objeto
     */
    public void exibeDados()
    {
        //utiliza o comando de saida: System.out.println para apresentar os valores dos atributos na tela
        
        //titulo do Livro:
        System.out.println("O titulo do livro e: " + titulo);
        
        //NOTA 1: O comando deve ser descrito EXATAMENTE como esta apresentado acima,
        //comecando com a letra maiuscula, pois java e case-sensitive, ou seja, faz distincao
        //entre letra maisculas e minusculas.  Portanto se tentarmos utilizar o comando acima comecando
        //com a letra minuscula, ocorrera um erro de sintaxe.
        
        //apresenta na tela a disponibilidade do livro por meio do retorno do metodo: getSituacao()
        System.out.println("Este livro esta: " + getSituacao());
        
        /*
         NOTA 2: O simbolo matematico "+" esta sendo utilizado dentro do comando de saida para unir duas Strings.
         Este conceito e chamado: concatenacao, onde podemos unir diversos valores para apresentar na tela depois
        */
    }
}
