package linkedlists;

class SinglyLLNode {

    int data;
    SinglyLLNode next;

    SinglyLLNode(int data) {
        this.data = data;
        this.next = null;
    }
    
    SinglyLLNode(SinglyLLNode node) {
        this.data = node.data;
        this.next = node.next;
    }

    void setData(int data) {
        this.data = data;
    }

    int getData() {
        return this.data;
    }

    void setNext(SinglyLLNode next) {
        this.next = next;
    }

    SinglyLLNode getNext() {
        return this.next;
    }

}
