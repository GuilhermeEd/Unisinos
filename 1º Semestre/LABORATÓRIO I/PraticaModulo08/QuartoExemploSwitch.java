
//classe de teste
public class QuartoExemploSwitch
{
    //método main da classe de teste
    //responsável pela execução dos comandos 
    public static void main(String args[])
    {
        // criando uma variável do tipo inteiro para realizar o teste
    	int numero = 10;
    	
    	// utilizando o switch com comparação do valor da variável
    	switch(numero){  // caso o valor do número
  			case 0://seja 0, apresenta a mensagem abaixo
    				System.out.println("O valor da variável é 0");
    				break;
  			case 5://seja 5, apresenta a mensagem abaixo
    				System.out.println("O valor da variável é 5");
    				break;
			case 10://seja 10, apresenta a mensagem abaixo
    				System.out.println("O valor da variável é 10");
    				break;
  			default://seja diferente de 0,5 e 10, apresenta a mensagem abaixo
    				System.out.println("O valor da variável é diferente de 0,5 e 10");
    				break;
		}
    }
}
