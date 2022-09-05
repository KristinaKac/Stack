package ru.netology;

import static java.lang.System.exit;

class StackUsingLinkedlist {
    private class Node {
        int value;
        Node prev;
    }
    Node head;
    StackUsingLinkedlist() {
        this.head = null;
    }
    public void push(int x) {
        Node temp = new Node();
        if (temp == null) {
            return;
        }
        temp.value = x;
        temp.prev = head;
        head = temp;
    }
    public void pop() {
        if (head == null) {
            System.out.print("EMPTY");
            return;
        }
        head = (head).prev;
    }
    public void printMe() {
        if (head == null) {
            System.out.println("Пусто");
            exit(1);
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.printf("%d->", temp.value);
                temp = temp.prev;
            }
        }
    }
}
