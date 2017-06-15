// Declaração da Classe
public class AlugaTudo
{
    // Atributos
    private Reserva[] listaReservas; // Array de Reservas
    private int qtdReservas;
    
    // Método Construtor
    public AlugaTudo(int tamArray)
    {
        this.listaReservas = new Reserva[tamArray];
    }
    
    public void registraReserva(Reserva res)
    {
        // Comando de Repetição
        for(int i = 0; i < listaReservas.length; i++)
        {
            // Comando de Seleção
            if (listaReservas[i] == null)
            {
                listaReservas[i] = res;
                this.qtdReservas++;
                return;
            }
        }
        // Comando de Saída
        System.out.println("ERRO: Lista de Reservas está cheia.");
    }
    
    public void apresentaReservas()
    {
        // Comandos de Saída, Seleção e de Repetição        
        System.out.println("DADOS DA LISTA DE RESERVAS");
        for(int i = 0; i < listaReservas.length; i++)
        {
            if (listaReservas[i] != null) 
            {
                listaReservas[i].exibeDados();
            }
        }
    }
    
    public void pesquisaImovelPorCliente(String telefoneCliente)
    {
        boolean haReserva = false;
        // Comandos de Saída, Seleção e de Repetição
        for(int i = 0; i < listaReservas.length; i++)
        {   
            if (listaReservas[i] != null)
            {
                if (listaReservas[i].getCliente().getTelefone() == telefoneCliente)
                {
                    listaReservas[i].exibeDados();
                    haReserva = true;
                }
            }
        }
        
        if (!haReserva)
        {
            System.out.println("Não foi localizado nenhuma acomodação para este telefone.");
        }
    }
}