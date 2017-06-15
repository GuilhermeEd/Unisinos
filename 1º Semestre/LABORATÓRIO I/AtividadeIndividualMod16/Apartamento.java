// Declaração da Classe
// Herança: Apartamento herda Acomodacao
public class Apartamento extends Acomodacao
{
    // Atributos
    private boolean possuiElevador;
    private int qtdQuartos;
    
    // Método Construtor
    public Apartamento(int codigo, String descricao, double precoDiariaLocacao, int qtdMinDiasLocacao, boolean possuiElevador, int qtdQuartos){
        // Inicialização dos atributos da classe
        super(codigo, descricao, precoDiariaLocacao, qtdMinDiasLocacao);
        this.possuiElevador = possuiElevador;
        this.qtdQuartos = qtdQuartos;
    }
    
    // 
    public void exibeDados()
    {
        // Polimorfismo e sobrescrita do método exibeDados.
        super.exibeDados();
        
        // Comandos de Saída
        System.out.println("Possui Elevador: " + possuiElevador);
        System.out.println("Quantidade de Quartos: " + qtdQuartos);
    }
    
}