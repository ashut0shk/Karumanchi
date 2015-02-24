package linkedlists;

class DoublyLLNode {

    int data;
    DoublyLLNode prev;
    DoublyLLNode next;

    DoublyLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    DoublyLLNode(DoublyLLNode node) {
        this.prev = node.prev;
        this.next = node.next;
        this.data = node.data;
    }

    void setData(int data) {
        this.data = data;
    }

    int getData() {
        return this.data;
    }

    void setPrev(DoublyLLNode prev) {
        this.prev = prev;
    }

    DoublyLLNode getPrev() {
        return this.prev;
    }

    void setNext(DoublyLLNode next) {
        this.next = next;
    }

    DoublyLLNode getNext() {
        return this.next;
    }

}
