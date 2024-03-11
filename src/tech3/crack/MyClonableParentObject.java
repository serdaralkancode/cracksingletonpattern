package tech3.crack;

public class MyClonableObject implements Cloneable {

    int val = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
