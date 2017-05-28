/*
 * Classe de Teste
 */

public class TesteDeeper
{
    
    private static ListaAmigo lista = new ListaAmigo(10);
    private static int opt;
    
    public static void main(String[] args){
        
        
        System.out.println("Bem-vindo(a) ao Sistema.");
        
        // Comando de Repetição
        do{
            IniciaSistema();
            opt = Teclado.leInt("Opção: ");
            
            // Comando de Seleção
            switch(opt){
                case 1:
                    lista.visualizaAmigos();
                    break;
                    
                case 2:
                    AdicionaAmigo();
                    break;
            
                case 3:
                    PesquisaPorCelular();
                    break;
                    
            }
            
        } while (opt != 0);
        
        System.out.println("\nSistema Encerrado.");
        
    }
    
    private static void IniciaSistema(){
        // Comandos de Saída
        System.out.println("\nSelecione uma das seguintes opções para continuar:");
        System.out.println("1 – Visualizar Dados dos Amigos");
        System.out.println("2 – Adicionar amigo");
        System.out.println("3 – Pesquisar amigos por Celular");
        System.out.println("0 – Encerrar");
    }
    
    private static void AdicionaAmigo(){
        // Comandos de Entrada
        String em = Teclado.leString("E-mail: ");;
        String se = Teclado.leString("Senha: ");
        String no = Teclado.leString("Nome: ");
        int nu = Teclado.leInt("Numero Celular: ");
        boolean isEstr = Teclado.leBoolean("Usuário é Estrangeiro? (true - Sim, false - Não): ");
        // Comandos de Seleção
        if(isEstr){
            String ling = Teclado.leString("Língua Nativa: ");
            char idi = Teclado.leChar("Idioma Preferencial ( I – Inglês, E – Espanhol, F – Francês ou O – Outro): ");
            lista.adicionaAmigo(new UsuarioEstrangeiro(em, se, no, nu, ling, idi));
            lista.pesquisaAmigoPorCelular(nu)[0].exibeDados();
            return;
        }
        lista.adicionaAmigo(new Usuario(em, se, no, nu));
        lista.pesquisaAmigoPorCelular(nu)[0].exibeDados();
        return;
    }
    
    private static void PesquisaPorCelular(){
        int nu = Teclado.leInt("Numero Celular: ");
        lista.pesquisaAmigoPorCelular(nu)[0].exibeDados();
    }
}
