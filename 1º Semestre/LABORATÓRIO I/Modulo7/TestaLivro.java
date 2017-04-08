
public class TestaLivro { //inicio da classe

    public static void main (String[] args) { //inicio do metodo main
        
        System.out.println("###############################################################");
        System.out.println("CRIANDO OBJETOS E APRESENTANDO OS VALORES DOS ATRIBUTOS NA TELA");
        System.out.println("###############################################################");
        
        // criar (instanciar) um livro, usando o operador new
        Livro livro1 = new Livro("Guerra dos Mundos");
        
        // criar (instanciar) outro livro, usando o operador new
        Livro livro2 = new Livro("O Senhor dos Aneis");
        
        // chamar o metodo adequado p/ exibir na tela os dados do primeiro livro criado
        livro1.exibeDados();
        
        // chamar o metodo adequado p/ exibir na tela os dados do segundo livro criado 
        livro2.exibeDados();
        
        System.out.println(""); // deixar uma linha em branco
        System.out.println("#####################################################################");
        System.out.println("EMPRESTANDO OS LIVROS E APRESENTANDO OS VALORES DOS ATRIBUTOS NA TELA");
        System.out.println("#####################################################################");
        
        // chamar o metodo adequado p/ emprestar o primeiro livro
        livro1.empresta();
        
        // chamar o metodo adequado p/ novamente exibir na tela os dados do 10 livro
        livro2.empresta();
        
        // chamar o metodo adequado p/ exibir na tela os dados do primeiro livro criado
        livro1.exibeDados();
        
        // chamar o metodo adequado p/ exibir na tela os dados do segundo livro criado 
        livro2.exibeDados();

        System.out.println(""); // deixar uma linha em branco
        System.out.println("#####################################################################");
        System.out.println("DEVOLVENDO OS LIVROS E APRESENTANDO OS VALORES DOS ATRIBUTOS NA TELA");
        System.out.println("#####################################################################");
        
        // chamar o metodo adequado p/ devolver o primeiro livro
        livro1.devolve();
        
        // chamar o metodo adequado p/ novamente exibir na tela os dados do 10 livro
        livro2.devolve();
        
        // chamar o metodo adequado p/ exibir na tela os dados do primeiro livro criado
        livro1.exibeDados();
        
        // chamar o metodo adequado p/ exibir na tela os dados do segundo livro criado 
        livro2.exibeDados();
        
    } //fim do metodo main
    
} //fim da classe