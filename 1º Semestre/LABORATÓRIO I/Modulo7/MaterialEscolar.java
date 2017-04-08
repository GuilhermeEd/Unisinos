
public class MaterialEscolar
{
    // atributos da classe
    private int codigo;
    private String nome;
    private double preco;
    private int qtdeEstoque;

    /**
     * Construtor da classe MaterialEscolar
     * Entrada: recebe os parametros com os valores dos atributos
     * Funcao: criar o objeto e atribuir os valores dos parametros para os atributos 
     */
    public MaterialEscolar(int cod, String nom, double pre, int qte)
    {
        codigo = cod; // atribui o valor do parametro: cod para o atributo: codigo
        nome = nom; // atribui o valor do parametro: nom para o atributo: nome
        preco = pre; // atribui o valor do parametro: pre para o atributo: preco
        qtdeEstoque = qte; // atribui o valor do parametro: qte para o atributo: qtdeEstoque
    }

    /**
     * Metodo getCodigo
     * Entrada: nao recebe nenhum parametro
     * Saida: retorna um int
     * Funcao: retornar o valor do atributo: codigo
     */
    public int getCodigo()
    {
        return codigo;
    }
    
    /**
     * Metodo getNome
     * Entrada: nao recebe nenhum parametro
     * Saida: retorna uma String
     * Funcao: retornar o valor do atributo: nome
     */
    public String getNome()
    {
        return nome;
    }
    
    /**
     * Metodo setNome
     * Entrada: recebe um parametro com valor String
     * Saida: nao tem retorno, e do tipo void
     * Funcao: atribuir um novo valor para o atributo: nome
     */
    public void setNome(String nom)
    {
        nome = nom;
    }
    
    /**
     * Metodo getPreco
     * Entrada: nao recebe nenhum parametro
     * Saida: retorna um double
     * Funcao: retornar o valor do atributo: preco
     */
    public double getPreco()
    {
        return preco;
    }
    
    /**
     * Metodo setPreco
     * Entrada: recebe um parametro com valor double
     * Saida: nao tem retorno, e do tipo void
     * Funcao: atribuir um novo valor para o atributo: preco
     */
    public void setPreco(double pre)
    {
        preco = pre;
    }
    
    /**
     * Metodo getQtdeEstoque
     * Entrada: nao recebe nenhum parametro
     * Saida: retorna um int
     * Funcao: retornar o valor do atributo: qtdeEstoque
     */
    public int getQtdeEstoque()
    {
        return qtdeEstoque;
    }
    
    
    /**
     * Metodo compraMaterial
     * Entrada: recebe um parametro com valor int
     * Saida: retorna um int
     * Funcao: adicionar a qtde de material no estoque indicada no parametro
     * e retornar o novo valor do atributo: qtdeEstoque
     */
    public int compraMaterial(int qtdeMaterialComprado)
    {
        qtdeEstoque+=qtdeMaterialComprado; //incrementa o estoque de material
        return getQtdeEstoque(); //retorna o valor do atributo utilizando o metodo getQtdeEstoque()
    }
    
    
    /**
     * Metodo vendeMaterial
     * Entrada: recebe um parametro com valor int
     * Saida: retorna um int
     * Funcao: remove a qtde de material do estoque indicada no parametro
     * e retornar o novo valor do atributo: qtdeEstoque
     */
    public int vendeMaterial(int qtdeMaterialVendido)
    {
        qtdeEstoque-=qtdeMaterialVendido; //decrementa o estoque de material
        return getQtdeEstoque(); //retorna o valor do atributo utilizando o metodo getQtdeEstoque()
    }
}
