
//classe de teste
public class QuintoExemploSwitch
{
    //método main da classe de teste
    //responsável pela execução dos comandos 
    public static void main(String args[])
    {
        // criando uma variável do tipo inteiro para realizar o teste
    	int numero = 10;
    	
    	// utilizando o switch com comparação do valor da expressão
    	switch(numero/2){  // caso o valor resultado da expressã
  			case 0://seja 0, apresenta a mensagem abaixo
    				System.out.println("A divisão variável por 2 é 0");
    				break;
  			case 5://seja 5, apresenta a mensagem abaixo
    				System.out.println("A divisão variável por 2 é 5");
    				break;
			default://seja diferente de 0 e 5, apresenta a mensagem abaixo
    				System.out.println("A divisão variável por 2 é diferente de 0 e 5");
    				break;
		}
    }
}
