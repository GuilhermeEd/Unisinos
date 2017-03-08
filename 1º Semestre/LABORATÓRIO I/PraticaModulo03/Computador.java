/* assinatura da classe:
 * public = identificador da classe, esta classe é pública
 * class = identifica a classe
 * Computador = identifica o nome da classe
 */
public class Computador
{ // o símbolo "{" simboliza o início do corpo da classe
    
    
    // atributos da classe:
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;
    
    /* construtor da classe Computador que recebe como parâmetros (dentro das chaves):
     * mod = parâmetro do tipo String que irá receber o valor para o atributo: modeloProcessador
     * cap = parâmetro do tipo double que irá receber o valor para o atributo: capacidadeProcessador
     * qua = parâmetro do tipo int que irá receber o valor para o atributo: quantidadeMemoriaRAM
     * tam = parâmetro do tipo int que irá receber o valor para o atributo: tamanhoHD
     */
    public Computador(String mod, double cap, int qua, int tam){
        // cada parâmetro será utilizado para atribuir valor para os atributos, contorme exemplo abaixo
        modeloProcessador = mod;
        capacidadeProcessador = cap;
        quantidadeMemoriaRAM = qua;
        tamanhoHD = tam;
    }
    
    
} // o símbolo "}" simboliza o fim do corpo da classe