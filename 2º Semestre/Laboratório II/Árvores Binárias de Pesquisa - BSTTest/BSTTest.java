import java.util.Scanner;
import java.util.InputMismatchException;

public class BSTTest { 
        public static void main(String[] args) {
            
            System.out.println("Bem-vindo(a) ao Sistema.");
            Scanner in = new Scanner(System.in);
            BST bst = new BST();
            int option = 0;
            
            while(option != 8){
                System.out.println("(1) Inserir valor\n"+
                                   "(2) Buscar valor\n"+
                                   "(3) Percurso em (a) Em Ordem (b) Pré-Ordem (c)Pós-Ordem\n"+
                                   "(4) Número de nodos folha\n"+
                                   "(5) Altura\n"+
                                   "(6) Número total de nodos\n"+
                                   "(7) Verificar se a árvore está cheia\n"+
                                   "(8) Sair\n");
                try { option = in.nextInt(); }
                catch (InputMismatchException e) { 
                    System.out.println("Comando deve ser um número inteiro entre 1 e 8\n");
                    option = 8;
                }
                
                if ( option == 1 ) {
                    System.out.println("Digite um número inteiro\n");
                    try {
                        int n = in.nextInt();
                        bst.insert(n);
                    }
                    catch (InputMismatchException e) { 
                        System.out.println("Elemento deve ser um número inteiro\n");    
                        option = 8;
                    }
                }
                
                if ( option == 2 ) {
                    System.out.println("Digite um número inteiro\n");
                    try {
                        int n = in.nextInt();
                        BSTNode node = bst.search(n);
                        if ( node == null ) { System.out.println("Nenhum elemento encontrado\n"); }
                        else { System.out.println("Elemento encontrado: " + node.key); }
                    }
                    catch (InputMismatchException e) { 
                        System.out.println("Elemento deve ser um número inteiro\n");    
                        option = 8;
                    }
                }
                
                if ( option == 3 ) {
                    System.out.println("Percurso: \n(a) Em Ordem: ");
                    bst.inorder();
                    System.out.println("\n(b) Em Pré-Ordem: ");
                    bst.preorder();
                    System.out.println("\n(c) Em Pós-Ordem: ");
                    bst.postorder();
                }            
                
                if ( option == 4 ) {
                    System.out.println("Número de nodos folha: " + bst.countLeafNodes());
                }
                
                if ( option == 5 ) {
                    System.out.println("Altura: " + bst.height());
                }
                
                if ( option == 6 ) {
                    System.out.println("Número total de nodos: " + bst.countNodes());
                }
                
                if ( option == 7 ) {
                    if ( bst.isFull() ) {
                        System.out.println("A árvore ESTÁ cheia.");
                    } else {
                        System.out.println("A árvora NÃO ESTÁ cheia.");
                }
                
            }
        }
        System.out.println("Sistema encerrado");
    }
}