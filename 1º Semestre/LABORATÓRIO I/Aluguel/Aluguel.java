public class Aluguel
{
    private int codigo;
    private String dataInicio;
    private String dataFim;
    private Imovel imovel;
    private Cliente cliente;
    
    public Aluguel(int co, String dtIni, String dtFim, Imovel imov, Cliente cli)
    {
        codigo = co;
        dataInicio = dtIni;
        dataFim = dtFim;
        imovel = imov;
        cliente = cli;
    }
    
    public void exibeDados()
    {
        System.out.printf(
        "Aluguel de código %d\nImóvel: %d\nAlugado de %s a %s por %s",
        codigo, imovel.getCodigo(), dataInicio, dataFim, cliente.getNome());
    }
}