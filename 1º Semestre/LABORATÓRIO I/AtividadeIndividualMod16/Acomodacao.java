// Declaração da Classe
public class Acomodacao
{
    // Atributos
    private int codigo;
    private String descricao;
    private double precoDiariaLocacao;
    private int qtdMinDiasLocacao;
    
    // Método Construtor
    public Acomodacao(int codigo, String descricao, double precoDiariaLocacao, int qtdMinDiasLocacao)
    {
        // Inicialização dos atributos da classe
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoDiariaLocacao = precoDiariaLocacao;
        this.qtdMinDiasLocacao = qtdMinDiasLocacao;
    }
    
    public void exibeDados()
    {
        // Comandos de Saída
        System.out.println("DADOS DA ACOMODAÇÃO");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço Diária Locação: " + precoDiariaLocacao);
        System.out.println("Quantidade mínima de dias para locação: " + qtdMinDiasLocacao);
    }
}