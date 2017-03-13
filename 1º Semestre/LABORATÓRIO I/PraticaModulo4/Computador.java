public class Computador
{
    String modeloProcessador;
    double capacidadeProcessador;
    int quantidadeMemoriaRAM;
    int tamanhoHD;
    
    public Computador(String mod, double cap, int qua, int tam)
    {
        modeloProcessador = mod;
        capacidadeProcessador = cap;
        quantidadeMemoriaRAM = qua;
        tamanhoHD = tam;        
    }

   //método de configuração de valor para o atributo: modeloProcessador
   public void setModeloProcessador(String mod){
       modeloProcessador = mod;
    }

    //método de acesso ao valor do atributo: modeloProcessador
    public String getModeloProcessador(){
        return modeloProcessador;
    }

    //método de configuração de valor para o atributo: capacidadeProcessador
    public void setCapacidadeProcessador(double cap){
        capacidadeProcessador = cap;
    }
    
    //método de acesso ao valor do atributo: capacidadeProcessador
    public double getCapacidadeProcessador(){
        return capacidadeProcessador;
    }
    
    //método de configuação de valor para o atributo: quantidadeMemoriaRAM
    public void setQuantidadeMemoriaRAM(int qua){
        quantidadeMemoriaRAM = qua;
    }
    
    //método de acesso ao valor do atributo: quantidadeMemoriaRAM
    public int getQuantidadeMemoriaRAM(){
        return quantidadeMemoriaRAM;
    }
    
    //método de configuração de valor para o atributo: tamanhoHD
    public void setTamanhoHD(int tam){
        tamanhoHD = tam;
    }
    
    //método de acesso ao valor do atributo: tamanhoHD
    public int getTamanhoHD(){
        return tamanhoHD;
    }
}
