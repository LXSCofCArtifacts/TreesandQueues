
/**
 * Deque is a doubley linked list that contains 5 methods. The first two 
 * methods are the push and pop methods that insert and remove a node at
 * the front of the list. There are also inject and eject methods that
 * do the same thing but at the rear of the list. The last methods is 
 * simply a print method to print the contents of the DLinkedList.
 * The print method is the only method that is not O(1) runtime.
 * 
 * @Logan Sitar
 * @16 October 2019
 */
public class deque<E>{
    private Node<E> front;
    private Node<E> rear;
    private int dQSize;
    private Node<E> temp;

    // Constructor
    deque(){
        front = null;
        rear = null;
    }  
    
    // push method (insert @ front)
    public boolean push(E it){
        if (front == null){
            front = rear = new Node<E>(it, null, null);
            dQSize++;
            return true;
        }
        else{
            front = new Node<E>(it, front, null);
            dQSize++;
            return true;            
        }
    }
    
    // pop method (remove @ front)
    public E pop(){
        if (front == null){
            return null;
        }
        else{
            E it = front.element();
            front = front.next();
            dQSize--;
            return it;
        }
    }
    
    // inject method (insert @ rear)
    public boolean inject(E it){
        if (front == null){
            front = rear = new Node<E>(it, null, null);
            dQSize++;
            return true;
        }
        else {
            rear.setNext(new Node<E>(it, null, rear));
            rear = rear.next();
            dQSize++;
            return true;
        }
    }
    
    // eject method (remove @ rear)
    public E eject(){
        if (rear == null){
            return null;
        }
        else {
            E it = rear.element();
            rear = rear.prev();
            rear.setNext(null);
            dQSize--;
            return it;
        }
    }
    
    public void printDeque(){
        temp = front;
        while(temp != null) {
            if (temp == rear){
                System.out.print(temp.element());
                temp = temp.next();
            }
            else {
                System.out.print(temp.element() + " -> ");
                temp = temp.next();
            }
        }
    }
}
