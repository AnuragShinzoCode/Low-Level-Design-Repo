package org.example.interfaces;

public class QueueStack implements Stack{
    @Override
    public void push(int x) {
        System.out.println("pushed in queuestack");
    }

    @Override
    public void pop() {
        System.out.println("poped in queuestack");
    }

    @Override
    public int top() {

        System.out.println("top in queuestack");
        return 0;
    }
}
