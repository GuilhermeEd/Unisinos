
//classe de teste
public class TerceiroExemploIF
{
    //método main da classe de teste
    //responsável pela execução dos comandos 
    public static void main(String args[])
    {
        // criando três váriáveis do tipo inteiro
        int numero1 = 5;
        int numero2 = 4;
        int numero3 = 5;
        
        // utilizando o If encadeado
    	if (numero1==numero2){
    			System.out.println("As variáveis: numero1 e numero2 possuem valores iguais");
    	} else if (numero1==numero3){
    			System.out.println("As variáveis: numero1 e numero3 possuem valores iguais");
    	} else if (numero2==numero3){
    			System.out.println("As variáveis: numero2 e numero3 possuem valores iguais");
    	} else {
    			System.out.println("As três variáveis possuem valores diferentes");
    	}

    }
}
