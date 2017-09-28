public class List {

    protected Node firstNode;
    protected Node lastNode;

    public List() {
        firstNode = null;
        lastNode = null;
    }

    public Node getFirst(){
        return firstNode;
    }

    public Node getLast(){
        return lastNode;
    }

    public void insertAtFront( Object insertItem ) {
        if (isEmpty() )
            firstNode = lastNode = new Node( insertItem );
        else
            firstNode = new Node( insertItem, firstNode );
    }
    
    public void insertAtBack( Object insertItem ) {
        if ( isEmpty() )
            firstNode = lastNode = new Node( insertItem );
        else {
            lastNode.setNext (new Node( insertItem ));
            lastNode = lastNode.getNext();
        }
    }
    
    public Object removeFromFront() throws UnderflowException {
        if ( isEmpty() )
            throw new UnderflowException();
            
        Object removedItem = firstNode.getData();
        
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else
            firstNode = firstNode.getNext();
            
        return removedItem;
    }
    
    public Object removeFromBack() throws UnderflowException {
        if ( isEmpty() )
            throw new UnderflowException();
            
        Object removedItem = lastNode.getData();
        
        if ( firstNode == lastNode ) {
            firstNode = lastNode = null;
        }
        else {
            Node current = firstNode;
            while ( current.getNext() != lastNode ) {
                current = current.getNext();
            }
            lastNode = current;
            current.setNext(null);
        }
        return removedItem;
    }
    
    public boolean isEmpty() {
        return firstNode == null;
    }
    
    public boolean insertAfter(Object obj1, Object obj2) throws UnderflowException {
        if( isEmpty() ){
            throw new UnderflowException();
        }
        Node node = firstNode;
        while ( !obj1.equals( node.getData() ) ){
            if( node.equals( lastNode ) ) {
                throw new UnderflowException();
            }
            node = node.getNext();
        }
        if( node.equals( lastNode ) ){
            insertAtBack(obj2);
        } else {
            Node nextNode = node.getNext();
            node.setNext( new Node( obj2, nextNode ) );
        }
        return true;
    }
    
    public boolean remove(Object o) throws UnderflowException{
        if( isEmpty() ){
            throw new UnderflowException();
        }
        Node node = firstNode;
        Node prevNode = null;
        while ( !o.equals( node.getData() ) ){
            if( node.equals(lastNode) ) {
                throw new UnderflowException();
            }
            prevNode = node;
            node = node.getNext();
        }
        if( node.equals(firstNode) ){
            removeFromFront();
        } else if ( node.equals(lastNode) ){
            removeFromBack();
        } else {
            prevNode.setNext(node.getNext());
        }
        return true;
    }
    
    public boolean troca_ter_quarto() {
        if( isEmpty() ) {
            return false;
        }
        Node node = firstNode;
        Node ter = null;
        Node quarto = null;
        for ( int i = 0 ; i < 4 ; i++ ) {
            if( node == null ) {
                return false;
            } else {
                if ( i == 2 ) {
                    ter = node;
                }
                if ( i == 3 ) {
                    quarto = node;
                }
                node = node.getNext();
            }
        }
        Object aux = ter.getData();
        ter.setData( quarto.getData() );
        quarto.setData(aux);
        return true;
    }
    
    public boolean remove_impar() throws UnderflowException{
        if( isEmpty() ) {
            return false;
        }
        Node node = firstNode;
        Node prevNode = null;
        while( node != null ) {
            if ( (int) node.getData() % 2 == 1) {
                if( node.equals(firstNode) ){
                    removeFromFront();
                } else if ( node.equals(lastNode) ){
                    removeFromBack();
                } else {
                    prevNode.setNext(node.getNext());
                }
                return true;
            }
            prevNode = node;
            node = node.getNext();
        }
        return false;
    }
}