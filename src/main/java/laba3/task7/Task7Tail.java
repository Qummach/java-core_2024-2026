package laba3.task7;

public class Task7Tail {
    public static void main(String[] args) {
        LinkedListTail list = new LinkedListTail();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
    }
}

class LinkedListTail {
    private Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

