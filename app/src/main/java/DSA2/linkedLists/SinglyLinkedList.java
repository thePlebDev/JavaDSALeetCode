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
    //END OF THE INITIAL LINKED LIST

    public E removeAt(int position){
        if(position > -1 && position < size){ // check the bounds
            Node<E> current = head; // reference to the head
            Node<E> previous = null; //
            int index = 0;
            //1)removing the first item
            if(position ==0){
                head = current.next;
            }else{
                //2)traverse to the position
                while (index++ < position){
                    previous = current;
                    current = current.getNext();
                }
                //link previous with current's nex: skip it to remove
                previous.setNext(current.next);
            }
            size --;
            return current.getElement();
        }else{
            return null;
        }

    }
    //INSERT AT
    public boolean insertAt(int position, E element){
        //check for boundaries
        if(position >= 0 && position <= size){
            Node<E> newNode = new Node(element,null);
            Node<E> current = head;
            Node<E> previous = null;
            int index = 0;

            if(position ==0){ //add on first position
                newNode.setNext(current);
                head = newNode;

            }else{
                while(index++ < position){
                    previous = current;
                    current = current.getNext();
                }
                newNode.setNext(current);
                previous.setNext(newNode);
            }
            size ++;
            return true;

        }else{
            return false;
        }
    }

    public String toString(){
        String startingString = "";
        Node<E> current = head;
        while(current != null){
            startingString += current.getElement() + "---->";
            current = current.getNext();
        }
        if(startingString.length() ==0){
            startingString += "EMPTY";
        }
        return startingString;
    }
    public int indexOf(E element){
        Node<E> current = head;
        int index = 0;

        while (current != null){
            if(element == current.getElement()){
                return index;
            }
            index++;
            current = current.getNext();
        }
        return -1;
    }

    public E remove(E element){
        int index = this.indexOf(element);
        return this.removeAt(index);
    }



}
