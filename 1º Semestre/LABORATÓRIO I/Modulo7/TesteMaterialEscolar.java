
/**
 * Classe de TesteMaterialEscolar
 */
public class TesteMaterialEscolar
{
    
    /**
     * Metodo main
     * Funcao: este metodo e utilizado para permitir a execucao dos testes
     * Nota: a assinatura do metodo e padrao para todas as classes de teste
     */
    public static void main(String[] args){
        
        /**
         *a)usando o operador new, criar (instanciar) um objeto da classe MaterialEscolar com codigo 23, 
         *nome "caneta", preco 7,50 e quantidade 20.
         */
        MaterialEscolar caneta = new MaterialEscolar(23,"caneta",7.50,20);
        
        /**
         *b)usando o operador new, criar (instanciar) outro objeto da classe MaterialEscolar com 
         *codigo 67, nome "lapis", preco 2,50 e quantidade 50.
         */
        MaterialEscolar lapis = new MaterialEscolar(67,"lapis",2.50,50);
        
        
        /**
         *c)usando comandos System.out.println, exibir todos os dados do material escolar 23, na tela
         */
        System.out.println("#########################################");
        System.out.println("APRESENTANDO DADOS DO MATERIAL ESCOLAR 23 - CANETA");
        System.out.println("#########################################");
        System.out.println("Codigo: " + caneta.getCodigo());//chama o metodo getCodigo() para apresentar o codigo do material escolar
        System.out.println("Nome: " + caneta.getNome());//chama o metodo getNome() para apresentar o nome do material escolar
        System.out.println("Preco: " + caneta.getPreco());//chama o metodo getPreco() para apresentar o preco do material escolar
        System.out.println("Qtde em Estoque: " + caneta.getQtdeEstoque());//chama o metodo getQtdeEstoque() para apresentar a qtde em estoque do material escolar
        
        
        /**
         *d) chamar o metodo adequado para vender 3 canetas
         */
        caneta.vendeMaterial(3);
        
        /**
         *e)chamar o metodo adequado para alterar o preco dos lapis para 2,70
         */
        lapis.setPreco(2.70);
        
        
        /**
         *f)chamar o metodo adequado para comprar (adicionando ao estoque) 10 canetas 
         */
        caneta.compraMaterial(10);
        
        
        /**
         *g) usando comandos System.out.println, exibir todos os dados dos dois materiais na tela, 
         *com titulos adequados.
         */
        System.out.println("#########################################"); //deixar uma linha em branco
        System.out.println("#########################################");
        System.out.println("APRESENTANDO DADOS DO MATERIAL ESCOLAR 23 - CANETA");
        System.out.println("#########################################");
        System.out.println("Codigo: " + caneta.getCodigo());//chama o metodo getCodigo() para apresentar o codigo do material escolar
        System.out.println("Nome: " + caneta.getNome());//chama o metodo getNome() para apresentar o nome do material escolar
        System.out.println("Preco: " + caneta.getPreco());//chama o metodo getPreco() para apresentar o preco do material escolar
        System.out.println("Qtde em Estoque: " + caneta.getQtdeEstoque());//chama o metodo getQtdeEstoque() para apresentar a qtde em estoque do material escolar

        
        System.out.println("#########################################"); //deixar uma linha em branco
        System.out.println("#########################################");
        System.out.println("APRESENTANDO DADOS DO MATERIAL ESCOLAR 67 - LAPIS");
        System.out.println("#########################################");
        System.out.println("Codigo: " + lapis.getCodigo());//chama o metodo getCodigo() para apresentar o codigo do material escolar
        System.out.println("Nome: " + lapis.getNome());//chama o metodo getNome() para apresentar o nome do material escolar
        System.out.println("Preco: " + lapis.getPreco());//chama o metodo getPreco() para apresentar o preco do material escolar
        System.out.println("Qtde em Estoque: " + lapis.getQtdeEstoque());//chama o metodo getQtdeEstoque() para apresentar a qtde em estoque do material escolar
    }
}
