//classe de teste
public class TesteComputador
{
    public static void main(String args[])
    {
        //Cenário de Teste:
        //1.Criar um novo computador com as seguintes características:
        //  a.Modelo do Processador = "Intel Core i7";
        //  b.Capacidade do Processador = 1730;
        //  c.Quantidade de Memória RAM = 4;
        //  d.Tamanho HD = 600.
        Computador computador1 = new Computador("Intel Core i7",1730,4,600);

        //2.Apresentar na tela os dados do computador criado.  
        //  Aqui vamos apresentar também o atributo: espacoLivreHD;
        System.out.println("DADOS DO COMPUTADOR:");
        System.out.println("Modelo do Processador = " + computador1.getModeloProcessador());
        System.out.println("Capacidade do Processador = " + computador1.getCapacidadeProcessador());
        System.out.println("Quantidade de Memória RAM = " + computador1.getQuantidadeMemoriaRAM());
        System.out.println("Tamanho HD = " + computador1.getTamanhoHD());
        System.out.println("Espaço Livre do HD = " + computador1.getEspacoLivreHD());
        

        //3.Chamar o método: calculaPercentualUsoHD() para apresentar qual é o 
        //  percentual de uso do HD quando o computador é criado;
        computador1.calculaPercentualUsoHD();

        //4.Modificar o valor do atributo: espacoLivreHD para 300;
        computador1.setEspacoLivreHD(300);
        
        //5.Chamar novamente o método: calculaPercentualUsoHD() para apresentar 
        //  qual é o percentual de uso do HD depois da alteração do valor do atributo: espacoLivreHD para 300;
        computador1.calculaPercentualUsoHD();
        
        //6.Modificar o valor do atributo: espacoLivreHD para 100;
        computador1.setEspacoLivreHD(100);

        //7.Chamar novamente o método: calculaPercentualUsoHD() para apresentar 
        // qual é o percentual de uso do HD depois da alteração do valor do atributo: espacoLivreHD para 100.
        computador1.calculaPercentualUsoHD();
        
        //8.Apresentar novamente todos os dados do computador criado para validar que 
        //  o atributo: espacoLivreHD foi realmente alterado
        System.out.println("\nDADOS DO COMPUTADOR DEPOIS DA ÚLTIMA ALTERAÇÃO:");
        System.out.println("Modelo do Processador = " + computador1.getModeloProcessador());
        System.out.println("Capacidade do Processador = " + computador1.getCapacidadeProcessador());
        System.out.println("Quantidade de Memória RAM = " + computador1.getQuantidadeMemoriaRAM());
        System.out.println("Tamanho HD = " + computador1.getTamanhoHD());
        System.out.println("Espaço Livre do HD = " + computador1.getEspacoLivreHD());
    }
}
