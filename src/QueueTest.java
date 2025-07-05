// Fig. 17.14: QueueTest.java
// Class QueueTest.

public class QueueTest
{
   public static void main( String args[] )
   {
      Queue queue = new Queue();

      // use enqueue method
      queue.enqueue( -1 ); 
      queue.print();       
      queue.enqueue( 0 );  
      queue.print();       
      queue.enqueue( 1 );  
      queue.print();       
      queue.enqueue( 5 );  
      queue.print();       

      // remove objects from queue
      try
      {
         Object removedObject = null;

         while ( !queue.isEmpty() )
         {
            removedObject = queue.dequeue(); // use dequeue method
            System.out.printf( "%s dequeued\n", removedObject );
            queue.print();
         } // end while
         System.out.println("Empty queue");
      } // end try
      catch ( EmptyListException emptyListException )
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class QueueTest
