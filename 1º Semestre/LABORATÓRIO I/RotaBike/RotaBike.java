//Bibliotecas importadas para o funcionamento dos labels;  
import java.awt.BorderLayout; 
import javax.swing.ImageIcon; 
import javax.swing.JLabel; 
import javax.swing.JFrame; 
//classe RotaBike 
public class RotaBike 
{ 
    // declaracao de atributos; 
    private String cidade; 
    private String pontoPa; 
    private String destino; 
    private char tipoRota; 
    private String rota; 
     
    public RotaBike(String cd, String pa, String dest)// constutor da classe; 
    { 
        cidade = cd; 
        pontoPa = pa; 
        destino = dest; 
         
    } 
    // metodos SET para configuracao dos atributos; 
    public void setCidade( String cd) 
    { 
        cidade = cd; 
    } 
    //metodos GET para acesso dos atributos; 
    public String getCidade() 
    { 
        return cidade; 
    } 
    public void setPontoPa( String pa) 
    { 
        pontoPa = pa;    
    } 
    public String getPontoPa() 
    { 
        return pontoPa; 
    } 
     
    public void setDestino( String dest) 
    { 
        destino = dest;  
    } 
    public String getDestino() 
    { 
        return destino; 
    } 
   
    //metodo com comandos selecao para tipo de rota e mostrar imagem rota; 
    public void escolheRota(char tipoRota) 
    { 
        
         
            if ( tipoRota == 'T' || tipoRota == 't' ) 
            { 
                //Estes comandos de exibicao de labels foram retirados do Livro Java como programar Pag. 299; 
                //Portanto tenho apenas conecimento basico sobre estes comandos; 
                 
                // cria rotulo do texto da rota; 
                JLabel northLabel = new JLabel( " \nRota com percurso mais rapido e poucos obstaculos\npara quem deseja ir pedalando ao trabalho!" ); 
                // cria um icone com as imagens dos mapas para colocar no JLabel; 
                ImageIcon labelIcon = new ImageIcon( "TrabalhoOK.png" ); 
                // cria um rotulo com icone no centro do lab; 
                JLabel centerLabel = new JLabel( labelIcon ); 
                // Instancia o frame; 
                JFrame application = new JFrame(); 
                //configuracao para fechar o frame ao sair; 
                application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
                // adiciona os rotulos ao frame; segundo o argumento especifica 
                //onde adicionar os rotulos;  
                application.add( northLabel, BorderLayout.NORTH ); 
                application.add( centerLabel, BorderLayout.CENTER );       
                application.setSize( 750, 700 ); // Configura tamanho da janela 
                application.setVisible( true ); // configura a visibilidade se verdadeira; 
            } 
         
            else if ( tipoRota == 'P' || tipoRota == 'p' ) 
            {   
                //comentarios segue os da primeira configuracao, apenas foi repetido os comandos; 
                JLabel northLabel = new JLabel( " \nRota com percurso medio e alguns obstaculos para um passeio saudavel!" ); 
                ImageIcon labelIcon = new ImageIcon( "PasseioOK.png" ); 
                JLabel centerLabel = new JLabel( labelIcon ); 
                JLabel southLabel = new JLabel( labelIcon ); 
                JFrame application = new JFrame(); 
                application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
                application.add( northLabel, BorderLayout.NORTH ); 
                application.add( centerLabel, BorderLayout.CENTER );       
                application.setSize( 750, 700 ); 
                application.setVisible( true );      
            } 
         
            else if (tipoRota == 'E' || tipoRota == 'e' ) 
            { 
                //comentarios segue os da primeira configuracao, apenas foi repetido os comandos; 
                JLabel northLabel = new JLabel( " \nRota com percurso longo e varios obstaculos para um pedal a nivel esportivo!" ); 
                ImageIcon labelIcon = new ImageIcon( "EsporteOK.png" ); 
                JLabel centerLabel = new JLabel( labelIcon ); 
                JLabel southLabel = new JLabel( labelIcon ); 
                JFrame application = new JFrame(); 
                application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
                application.add( northLabel, BorderLayout.NORTH ); 
                application.add( centerLabel, BorderLayout.CENTER );       
                application.setSize( 750, 700 ); 
                application.setVisible( true ); 
            } 
            else  
            rota = "Sem rota definida";// retorna mensagem caso nao definida a rota; 
    } 
     
        
    public void exibeDados()// exibe os dados; 
    { 
        System.out.printf("\n================================"); 
        System.out.printf("\n\nCidade: %s", cidade); 
        System.out.printf("\n\nLocal de partida eh: %s", pontoPa); 
        System.out.printf("\n\nLocal de destino: %s", destino); 
         
        System.out.printf("\n\nObrigado por utilizar o Rota Bike!!");          
    } 
   
} 