// Declaração da Classe
public class Reserva
{
    // Atributos
    private int codigo;
    private String dataInicioReserva;
    private String dataFimReserva;
    private Acomodacao acomodacao;
    private Cliente cliente;
    
    // Método Construtor
    public Reserva(int codigo, String dataInicioReserva, String dataFimReserva, Acomodacao acomodacao, Cliente cliente)
    {
        this.codigo = codigo;
        this.dataInicioReserva = dataInicioReserva;
        this.dataFimReserva = dataFimReserva;
        this.acomodacao = acomodacao;
        this.cliente = cliente;
    }
    
    public void exibeDados()
    {
        System.out.println("DADOS DA RESERVA");
        System.out.println("Código: " + codigo);
        System.out.println("Data de Início da Reserva: " + dataInicioReserva);
        System.out.println("Data de Fim da Reserva: " + dataFimReserva);
        acomodacao.exibeDados();
        cliente.exibeDados();
    }
    
    // Método GET para o atributo cliente
    public Cliente getCliente()
    {
        return this.cliente;
    }
}