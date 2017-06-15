// Declaração de Classe de Teste
public class TesteAlugaTudo
{
    
    // Instanciação de um novo Objeto AlugaTudo com uma lista capaz de suportar 10 reservas
    public static AlugaTudo at = new AlugaTudo(10);
    
    
    public static void main(String[] args)
    {
        // inicialização da variável. será sobrescrita na primeira iteração do while
        int opcao = 10;
        while(opcao != 0){
            
            // Comandos de Saída
            System.out.println("Selecione uma das opções para continuar.");
            System.out.println("1) Registrar Reserva");
            System.out.println("2) Apresentar Reservas");
            System.out.println("3) Pesquisa Acomodação por telefone do cliente");
            System.out.println("0) Encerrar");
            
            // Comando de Entrada
            opcao = Teclado.leInt("Opção: ");
            
            switch(opcao)
            {
                case 1:
                    RegistrarReservas();
                    break;
                    
                case 2:
                    ApresentarReservas();
                    break;
                    
                case 3:
                    PesquisarAcomodacaoPorTelefone();
                    break;
                    
                case 0:
                    Encerrar();
                    break;
                    
                default:
                    System.out.println("ERRO: Opção Inválida.");
            }
        }
    }
    
    public static void RegistrarReservas()
    {        
        // Comandos de Entrada para criar a Acomodacao
        int codigoAcomodacao = Teclado.leInt("Código da Acomodação: ");
        String descricaoAcomodacao = Teclado.leString("Descrição da Acomodação: ");
        double precoDiariaLocacao = Teclado.leDouble("Preço Diária da Locação: ");
        int qtdMinDiasLocacao = Teclado.leInt("Quantidade Mínima de Dias Para Locação: ");
        
        Acomodacao acomodacao = new Acomodacao(codigoAcomodacao, descricaoAcomodacao, precoDiariaLocacao, qtdMinDiasLocacao);
        
        // Comandos de Entrada para criar o Cliente
        int codigoCliente = Teclado.leInt("Código do Cliente: ");
        String nome = Teclado.leString("Nome do Cliente: ");
        String telefone = Teclado.leString("Telefone do Cliente: ");
        
        Cliente cliente = new Cliente(codigoCliente, nome, telefone);
        // Comandos de Entrada para criar a Reserva
        int codigoReserva = Teclado.leInt("Código da Reserva: ");
        String dataInicioReserva = Teclado.leString("Data de Início da Reserva: ");
        String dataFimReserva = Teclado.leString("Data de Fim da Reserva: ");
        
        Reserva res = new Reserva(codigoReserva, dataInicioReserva, dataFimReserva, acomodacao, cliente);

        at.registraReserva(res);
        System.out.println("RESERVA REGISTRADA");
    }
    
    public static void ApresentarReservas()
    {
        at.apresentaReservas();
    }
    
    public static void PesquisarAcomodacaoPorTelefone()
    {
        String telefone = Teclado.leString("Telefone: ");
        at.pesquisaImovelPorCliente(telefone);
    }
                    
    public static void Encerrar()
    {
        System.out.println("SISTEMA ENCERRADO");
    }
    
}