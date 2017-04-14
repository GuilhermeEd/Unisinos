//assinatura da classe:
//public = identificador da classe, esta classe é pública
//class = identifica a classe
//Computador = identifica o nome da classe
public class Computador
{// o símbolo "{" simboliza o início do corpo da classe
  
    //atributos da classe:
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;
    private double espacoLivreHD;
    
    //construtor da classe Computador que recebe como parâmetros (dentro das chaves):
    //mod = parâmetro do tipo String que irá receber o valor para o atributo: modeloProcessador
    //cap = parâmetro do tipo double que irá receber o valor para o atributo: capacidadeProcessador
    //qua = parâmetro do tipo int que irá receber o valor para o atributo: quantidadeMemoriaRAM
    //tam = parâmetro do tipo int que irá receber o valor para o atributo: tamanhoHD
    public Computador(String mod, double cap, int qua, int tam){
        //cada parâmetro será utilizado para atribuir valor para os atributos, conforme exemplo abaixo
        modeloProcessador = mod;
        capacidadeProcessador = cap;
        quantidadeMemoriaRAM = qua;
        tamanhoHD = tam;
        
        //como o espaço livre do HD é igual ao tamanho do HD na criação do computador
        //vamos atribuir o valor do atributo: tamanhoHD para o novo atributo criado: espacoLivreHD
        espacoLivreHD = tamanhoHD;
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

    //método de configuração de valor para o atributo: quantidadeMemoriaRAM
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

    //método de configuração de valor para o atributo: espacoLivreHD
    public void setEspacoLivreHD(double esp){
        espacoLivreHD = esp;
    }
    
    //método de acesso ao valor do atributo: espacoLivreHD
    public double getEspacoLivreHD(){
        return espacoLivreHD;
    }

    //método que irá calcular qual é o percentual de uso do HD do computador
    public void calculaPercentualUsoHD(){
        
        //criar a variavel espacoEmUso para receber o resultado da expressão: tamanhoHD - espacoLivreHD
        double espacoEmUso = tamanhoHD - espacoLivreHD;
        
        //criar a variavel percentual
        //calcular o percentual de uso e converter o resultado para o tipo de dados int
        int percentual = (int)(espacoEmUso*100)/tamanhoHD;
        
        //utilizar a estrutura de seleção if e else if para comparar o percentual de uso do espaço do computador
        if(percentual<25)
            System.out.println("O percentual de Uso do computador está abaixo de 25%");
        else if(percentual>=25 && percentual<50)
            System.out.println("O percentual de Uso do computador está entre 25% e 50%");
        else if(percentual>=50 && percentual<75)
            System.out.println("O percentual de Uso do computador está entre 50% e 75%");
        else if(percentual>=75 && percentual<100)
            System.out.println("O percentual de Uso do computador está entre 75% e 100%");
        else
            System.out.println("O percentual de Uso do computador é 100%");
    }
    
    //método que exibe os dados dos atributos do Computador
    public void exibeDados(){
        System.out.println("Modelo do Processador = " + modeloProcessador);
        System.out.println("Capacidade do Processador = " + capacidadeProcessador);
        System.out.println("Quantidade de Memória RAM = " + quantidadeMemoriaRAM);
        System.out.println("Tamanho HD = " + tamanhoHD);
        System.out.println("Espaço Livre do HD = " + espacoLivreHD);
    }
    
}// o símbolo "}" simboliza o fim do corpo da classe
