public class ListaOrdenada extends List {

    public ListaOrdenada(){
        super( "lista ordenada" );
    }

    public ListaOrdenada( String listName ){
        super( listName );
    }

    public void insert(String s){
        if( isEmpty() ){
            insertAtFront(s);
            return;
        }
        // 1) Elemento inserido na primeira posição da lista
        if( s.compareTo( (String) getFirst().getData() ) < 0 ){
            insertAtFront(s);
            return;
        }
        // 2) Elemento inserido na última posição da lista
        if( s.compareTo( (String) getLast().getData() ) > 0 ){
            insertAtBack(s);
            return;
        }
        // 3) Elemento inserido em uma posição intermediária na lista
        Node i = getFirst();
        while( s.compareTo( (String) i.getData() ) > 0 ){
            i = i.getNext();
        }
        Node n = new Node( s );
        n.setNext( i );
        n.setPrevious( i.getPrevious() );
        i.getPrevious().setNext( n );
        i.setPrevious( n );
    }

    public void printAscending(){
        Node n = getFirst();
        while( n != null ){
            System.out.println( n.getData() );
            n = n.getNext();
        }
    }
 
    public void printDescending(){
        Node n = getLast();
        while( n != null ){
            System.out.println( n.getData() );
            n = n.getPrevious();
        }
    }

}