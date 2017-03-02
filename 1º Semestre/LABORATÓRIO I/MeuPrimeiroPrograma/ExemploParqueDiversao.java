public class ExemploParqueDiversao
{
    public static void main(String args[]){
    
        //declarar e atribuir valor para a constante: IDADE_MINIMA para acesso ao brinquedo
        final int IDADE_MINIMA = 12; //tipo de dado primitivo numero inteiro
        
        //declarar e atribuir valor as variaveis: 
        //  - seuNome, primeiraLetraNome, idade, valorBrinquedo
        String seuNome = "Maria"; //tipo de dado objeto para sequencia de caracteres
        char primeiraLetraNome = 'M'; //tipo de dado primitivo para caracter (apenas um)
        int idade = 15; //tipo de dado primitivo numero inteiro
        double valorBrinquedo = 3.5; //tipo de dado primitivo numero real
    
        //imprimir as mensagens na tela
        System.out.print("Ola ");
        System.out.println(seuNome);
        System.out.printf("A primeira letra do seu nome e: %c. \n", primeiraLetraNome);
        System.out.printf("Sua idade e: %d.",idade);
        System.out.printf("A idade minima para acessar este brinquedo e: %d. \n", IDADE_MINIMA);
        System.out.printf("O valor do brinquedo e: %4.2f.",valorBrinquedo);
    }
}
