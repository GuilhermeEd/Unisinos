

public class GeneralTree {
    private Object key;
    private int degree;
    private List list; 

    public Object getKey ()
    { return key; }
    
    public GeneralTree (Object key) {
        this.key = key;
        degree = 0;
        list = new List ();
    }

    public GeneralTree getSubtree (int i) {
        if (i < 0 || i >= degree)
            throw new IndexOutOfBoundsException ();
        Node ptr = list.getFirst ();
        for (int j = 0; j < i; ++j)
            ptr = ptr.getNext ();
        return (GeneralTree) ptr.getData ();
    }

    public void attachSubtree (GeneralTree t) {
        list.insertAtBack (t);
        ++degree;
    }

    public GeneralTree detachSubtree (GeneralTree t) throws UnderflowException {
        list.remove (t);
        --degree;
        return t;
    }
    
    public int countNodes(GeneralTree t) {
        if ( t.degree == 0 ) return 0;
        int count = t.degree;
        for ( int i = 0 ; i < t.degree ; i++ ) {
            count += countNodes( t.getSubtree(i) );
        }
        return count;
    }
    
    //este método deve contar o número de filhos totais, diretos ou não, de determinado nodo recebido por parâmetro.
    public int contaFilhosNodo(GeneralTree T) {
        if ( T.degree == 0 ) return 0;
        int count = T.degree;
        for ( int i = 0 ; i < T.degree ; i++ ) {
            count += countNodes( T.getSubtree(i) );
        }
        return count;
    }
    
}
