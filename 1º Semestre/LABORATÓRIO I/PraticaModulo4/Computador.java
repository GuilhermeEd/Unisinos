public class Computador
{
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;
    private Monitor monitorComputador;
    
    public Computador(String mod, double cap, int qua, int tam, Monitor monitor)
    {
        this.modeloProcessador = mod;
        this.capacidadeProcessador = cap;
        this.quantidadeMemoriaRAM = qua;
        this.tamanhoHD = tam;    
        this.monitorComputador = monitor;
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
    
        //método de configuração de valor para o atributo: monitorComputador
    public void SetMonitorComputador(Monitor monitor){
        monitorComputador = monitor;
    }
    
    //método de acesso ao valor do atributo: monitorComputador
    public Monitor getMonitorComputador(){
        return monitorComputador;
    }
}
