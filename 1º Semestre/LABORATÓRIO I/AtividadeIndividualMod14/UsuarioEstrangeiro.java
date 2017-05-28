/*
 * Classe UsuarioEstrangeiro Herda de classe Usuario 
 */

public class UsuarioEstrangeiro extends Usuario
{
    // Atributos da classe UsuarioEstrangeiro
    private String linguaNativa;
    private char idiomaPreferencial; /* I – Inglês, E – Espanhol, F – Francês ou O – Outro*/
    
    // Construtor com atributos da classe UsuarioEstrangiero
    public UsuarioEstrangeiro(String em, String se, String no, int nu, String ling, char idi)
    {
        super(em, se, no, nu);
        this.linguaNativa = ling;
        this.idiomaPreferencial = idi;
    }
    
    // Construtor somente com atributos herdados da classe Usuario
    public UsuarioEstrangeiro(String em, String se, String no, int nu)
    {
        super(em, se, no, nu);
    }
    
    // Método GET para linguaNativa
    public String getLinguaNativa(){
        return this.linguaNativa;
    }
    
    // Método GET para idiomaPreferencial
    public char getIdiomaPreferencial(){
        return this.idiomaPreferencial;
    }
    
    // Método SET para linguaNativa
    public void setLinguaNativa(String ling){
        this.linguaNativa = ling;
    }
    
    // Método SET para idiomaPreferencial
    public void setIdiomaPreferencial(char idi){
        this.idiomaPreferencial = idi;
    }
    
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Língua Nativa:" + linguaNativa);
        System.out.println("Idioma Preferencial:" + idiomaPreferencial);
    }

}
