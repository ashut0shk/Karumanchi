package linkedlists;

import java.util.Random;

class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLLNode head = createList();
        System.out.println("Random List:");
        printList(head);
        System.out.println("Inserting Element at 3:");
        head = insertNode(head, new SinglyLLNode(51), 3);
        printList(head);
        System.out.println("Adding to front:");
        head = addFront(head, new SinglyLLNode(1));
        printList(head);
        System.out.println("Adding to last:");
        head = addLast(head, new SinglyLLNode(31));
        printList(head);
        System.out.println("Inserting Element at 2:");
        head = insertNode(head, new SinglyLLNode(41), 2);
        printList(head);
        System.out.println("Deleting First:");
        head = deleteFirst(head);
        printList(head);
        System.out.println("Deleting Last:");
        head = deleteLast(head);
        printList(head);
        System.out.println("Deleting Element at 4:");
        head = deleteElementAt(head, 4);
        printList(head);
        System.out.println("Deleting SLL:");
        head = deleteSLL(head);
        printList(head);
    }

    // Create a random sized linked list
    static SinglyLLNode createList() {
        Random r = new Random();
        SinglyLLNode head = new SinglyLLNode(1 + r.nextInt(30));
        SinglyLLNode curr = head;
        for (int i = 0; i < 5 + r.nextInt(10); i++) {
            SinglyLLNode n = new SinglyLLNode(1 + r.nextInt(30));
            curr.setNext(n);
            curr = n;
        }
        curr.setNext(null);
        return head;
    }

    // Linked list traversal for printing and counting nodes 
    static void printList(SinglyLLNode head) {
        SinglyLLNode node = head;
        while (node != null) {
            System.out.print(node.getData() + " -> ");
            node = node.getNext();
        }
        System.out.println("null");
    }

    static int countNodes(SinglyLLNode node) {
        int res = 0;
        SinglyLLNode curr = node;
        while (curr != null) {
            res++;
            curr = curr.getNext();
        }
        return res;
    }

    // Manipulating linked list
    static SinglyLLNode addFront(SinglyLLNode head, SinglyLLNode newnode) {
        newnode.setNext(head);
        return newnode;
    }

    static SinglyLLNode addLast(SinglyLLNode head, SinglyLLNode newnode) {
        SinglyLLNode curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(newnode);
        return head;
    }

    static SinglyLLNode insertNode(SinglyLLNode head, SinglyLLNode newnode, int pos) {
        int total = countNodes(head);
        if (total + 1 < pos || pos < 1) {
            System.out.println("Incorrect Position");
            return head;
        }
        if (pos == 1) {
            return addFront(head, newnode);
        }
        if (pos == total + 1) {
            return addLast(head, newnode);
        }
        int currpos = 1;
        SinglyLLNode currnode = head;
        while (currpos < pos - 1) {
            currnode = currnode.getNext();
            currpos++;
        }
        SinglyLLNode temp = currnode.getNext();
        newnode.setNext(temp);
        currnode.setNext(newnode);
        return head;
    }

    static SinglyLLNode deleteFirst(SinglyLLNode head) {
        head = head.getNext();
        return head;
    }

    static SinglyLLNode deleteLast(SinglyLLNode head) {
        SinglyLLNode curr = head;
        while (curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        curr.next = null;
        return head;
    }

    static SinglyLLNode deleteElementAt(SinglyLLNode head, int pos) {
        int total = countNodes(head);
        if (pos < 1 || pos > total) {
            System.out.println("Invalid position for deleting.");
            return head;
        }
        if (pos == 1) {
            return deleteFirst(head);
        }
        if (pos == total) {
            return deleteLast(head);
        }
        int currpos = 1;
        SinglyLLNode curr = head;
        while (currpos < pos - 1) {
            curr = curr.getNext();
            currpos++;
        }
        SinglyLLNode temp = curr.getNext();
        curr.setNext(temp.getNext());
        return head;
    }

    static SinglyLLNode deleteSLL(SinglyLLNode head) {
        while (head != null) {
            head = head.getNext();
        }
        return head;
    }
}
