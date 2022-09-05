package ru.netology;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        obj.printMe();

        obj.pop();
        obj.pop();

        obj.printMe();
    }
}