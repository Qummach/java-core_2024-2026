package laba3.task8;

public class Task8 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createHead(new int[]{1, 2, 3, 4});
        System.out.println("Ввод с головы: " + list.toString());

        list.createTail(new int[]{1, 2, 3, 4});
        System.out.println("Ввод с хвоста: " + list.toString());

        list.addFirst(0);
        System.out.println("Добавления элемента в начало: " + list.toString());

        list.addLast(0);
        System.out.println("Добавления элемента в конец: " + list.toString());

        list.insert(2, 1000);
        System.out.println("Вставка элемента в список по номеру: " + list.toString());

        list.removeFirst();
        System.out.println("Удаления первого элемента: " + list.toString());

        list.removeLast();
        System.out.println("Удаления последнего элемента: " + list.toString());

        list.remove(1);
        System.out.println("Удаления элемента по индексу: " + list.toString());

        list.createHeadRec(new int[]{1, 2, 3, 4});
        System.out.println("Ввод с головы с помощью рекурсии: " + list.toStringRec());

        list.createTailRec(new int[]{1, 2, 3, 4});
        System.out.println("Ввод с хвоста с помощью рекурсии: " + list.toStringRec());
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void createHead(int[] arr) {
        head = null;
        for (int value : arr) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    public void createTail(int[] arr) {
        head = null;
        Node tail = null;
        for (int value : arr) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        return sb.append("null").toString();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

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

    public void insert(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    public void createHeadRec(int[] arr) {
        head = createHeadRecHelper(arr, arr.length - 1);
    }

    private Node createHeadRecHelper(int[] arr, int index) {
        if (index < 0) return null;
        Node newNode = new Node(arr[index]);
        newNode.next = createHeadRecHelper(arr, index - 1);
        return newNode;
    }

    public void createTailRec(int[] arr) {
        head = createTailRecHelper(arr, 0, null);
    }

    private Node createTailRecHelper(int[] arr, int index, Node tail) {
        if (index >= arr.length) return tail;
        Node newNode = new Node(arr[index]);
        if (tail == null) {
            return createTailRecHelper(arr, index + 1, newNode);
        } else {
            tail.next = createTailRecHelper(arr, index + 1, newNode);
            return tail;
        }
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "null";
        return node.data + " -> " + toStringRecHelper(node.next);
    }
}