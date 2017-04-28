import java.util.ArrayList;

public class TesteDeeper
{
    public static void main (String[] args) {
        String email, senha, nome, titulo, desc;
        char tipo;
        int acao = 1, cel, qtd = 5;
        ArrayList<Usuario> users = new ArrayList<Usuario> ();
        ArrayList<Interesse> interesses = new ArrayList<Interesse> ();
        
        System.out.println("Entre os dados para criar os " + qtd + " usuários.\n");
        
        for(int i = 1 ; i <= qtd ; i++){
            email = Teclado.leString("Digite o email do usuário número " + i + ":\n");
            nome = Teclado.leString("Digite o nome do usuário número " + i + ":\n");
            senha = Teclado.leString("Digite a senha do usuário número " + i + ":\n");
            cel = Teclado.leInt("Digite o número de celular do usuário número " + i + ":\n");
            
            users.add(new Usuario(email,senha,nome,cel));
            users.get(i-1).exibeDados();
            
            System.out.println("\nEntre os dados para criar os interesses do usuário número " + i + ":\n");
            
            int j = 0;
            while(acao != 0){
            
                titulo = Teclado.leString("Digite um título para o interesse do usuário número " + i + ":\n");
                desc = Teclado.leString("Digite uma descrição para o interesse do usuário número " + i + ":\n");
                tipo = Teclado.leChar("Digite o tipo do interesse do usuário número " + i + " (C - Carreira ou P - Pessoal):\n");
                
                interesses.add(new Interesse(titulo,desc,tipo, users.get(i-1)));
                interesses.get(j).exibeDados();
                
                acao = Teclado.leInt("\nInteresse criado. Digite \"1\" para criar mais um interesse ou \"0\" para encerrar.\n");
                
                if (acao == 0){
                    boolean temInteressePessoal = false;
                    boolean temInteresseDeCarreira = false;
                    
                    for(int k = 0; k < interesses.size() ; k++){
                        if(interesses.get(k).getTipo() == 'P' && interesses.get(k).getUsuario() == users.get(i-1)) temInteressePessoal = true;
                        if(interesses.get(k).getTipo() == 'C' && interesses.get(k).getUsuario() == users.get(i-1)) temInteresseDeCarreira = true;
                    }
                    
                    if (!temInteressePessoal || !temInteresseDeCarreira){
                        acao = 1;
                        System.out.println("\nCada usuário deve ter ao menos um interesse Pessoal e um interesse de Carreira.\n");
                    }
                }

            }
            acao = 1;
        }
    }
}