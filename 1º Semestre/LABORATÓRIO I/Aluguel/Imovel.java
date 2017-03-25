public class Imovel
{
    private int codigo;
    private String descricao;
    private double precoAluguel;
    private int minMesesAluguel;
    
    public Imovel(int co, String desc, double preco, int min)
    {
        codigo = co;
        descricao = desc;
        precoAluguel = preco;
        minMesesAluguel = min;
    }
    
    public void exibeDados()
    {
        System.out.printf(
        "Imóvel código %d:\n%s\nPreço do Aluguel: %5.2f\nMínimo de Meses: %d",
        codigo, descricao, precoAluguel, minMesesAluguel);
    }
    
    public int getCodigo()
    {
        return codigo;
    }
}