import javax.swing.JOptionPane; // importa biblioteca para comando de exibicao MessageDialog; 
 
public class TesteRotaBike // Classe de teste  
{ 
    public static void main(String[] args) 
    { 
    JOptionPane.showMessageDialog(null, "Bem vindo ao Rota Pedal!");//configuracao do MessageDialog de abertura;   
     
    //configuracao do scanner da classe Teclado; 
    String cid = Teclado.leString ("\nDigite a sua cidade: "); 
    String par = Teclado.leString ("\nDigite o local de partida: "); 
    String des = Teclado.leString ("\nDigite o local de destino: "); 
    System.out.print          ("\nEscolha a rota de acordo com o seu objetivo!!!"); 
    System.out.print          ("\n\nDigite:\n\n['T' ou 't' - TRABALHO ]\n\n[ 'P'ou 'p' - PASSEIO ]\n\n[ 'E' ou 'e' - ESPORTE ]"); 
    char tRt = Teclado.leChar ("\n\nTipo de Rota: "); 
    
    //instancia os objetos da classe RotaBike; 
    RotaBike obj = new RotaBike (cid, par, des); 
     
    obj.escolheRota(tRt); // chama metodo dos comandos de selecao; 
    obj.exibeDados(); // chama metodo para exibir dados de entrada; 
       
    } 
} 