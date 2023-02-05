package DSA2.linkedLists;

public class SinglyLinkedList<E> {
    //--------------------NESTED NODE CLASS----------------
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
        public E getElement(){
            return this.element;
        }
        public Node<E> getNext(){
            return this.next;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
        public void setElement(E element){
            this.element = element;
        }
    }
    //--------------------END NESTED NODE CLASS----------------

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList(){}
    public int size(){return this.size;}
    public boolean isEmpty(){return this.size == 0;}

    //add first
    public void addFirst(E e){
        head = new Node<>(e,head);
        if (isEmpty()){
           tail = head;
        }
        this.size ++;
    }
    public void addLast(E e){
        Node<E> newNode = new Node<>(e,null);
        if (isEmpty()){
            head = newNode;
        }else{
            this.tail.setNext(newNode);
        }
        tail = newNode;
        this.size ++;
    }

}
