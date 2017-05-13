public class Professor extends Usuario
{
    // atributos específicos para o Professor
    private String areaAtuacao;
    
    //método construtor Professor = recebe todos os parâmetros do construtor da superclasse = construtor da classe: Usuario
    public Professor(int mat, String nom, String log, String sen)
    {
        //encaminha os parâmetros para o construtor da superclasse = construtor da classe: Usuario
        super(mat, nom, log, sen);
    }

    //método de acesso ao atributo: areaAtuacao
    public String getAreaAtuacao()
    {
        return areaAtuacao;
    }

    //método de configuração do atributo: areaAtuacao
    public void setAreaAtuacao(String are)
    {
        areaAtuacao = are;
    }
    
    //método sobrescrito = deve possuir a mesma assinatura do método da superclasse: Usuario
    public void exibeDados()
    {
        System.out.println("");
        System.out.println("++++++ Dados do Professor ++++++"); 
        
        //vamos reaproveitar as instruções que já existem no método da superclasse, para isso, vamos fazer uso da palavra: super
        super.exibeDados();  // esta instrução chama o método exibeDados() da superclasse
        
        //se a área de atuação for diferente de null e vazio, vamos apresentá-la também
        if(areaAtuacao!=null && !areaAtuacao.isEmpty())
            System.out.println("Área de Atuação: " + areaAtuacao);
    }
}
