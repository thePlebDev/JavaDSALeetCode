/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DSA2;

import DSA2.linkedLists.SinglyLinkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList= new SinglyLinkedList<>();
        singlyLinkedList.addFirst(4);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addLast(5);
        singlyLinkedList.remove(44);
        System.out.println(singlyLinkedList.toString());

        //System.out.println(new App().getGreeting());
    }
}
