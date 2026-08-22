package org.example.interfaces;

public class AarrayStack implements Stack{
    @Override
    public void push(int x) {
        System.out.println("pushed in AarrayStack");
    }

    @Override
    public void pop() {
        System.out.println("poped in AarrayStack");
    }

    @Override
    public int top() {

        System.out.println("top in AarrayStack");
        return 0;
    }

}
