

public class Stack {
    List l;

   // construct stack
   public Stack() { 
      l = new List(); 
   }

   // add object to stack
   public  void push( Object object ) { 
      l.insertAtFront( object ); 
   }

   // remove object from stack
   public  Object pop() throws EmptyListException, UnderflowException { 
      return l.removeFromFront(); 
   }
   
   // output List contents
   public boolean isEmpty() { 
      return l.isEmpty();
    }

   public int size(){  
        if( isEmpty() ) {
            return 0;
        } else {
            Node node = l.getFirst();
            int count = 0;
            while( node != null ) {
                count++;
                node = node.getNext();
            }
            return count;
        }
    }
} // end class Stack

