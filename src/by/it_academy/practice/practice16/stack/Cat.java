package by.it_academy.practice.practice16.stack;

public class Cat {
    private String mName;
    private int mAge;

    public Cat(String name, int age) {
        mName = name;
        mAge = age;
    }

    @Override
    public String toString() {
        return this.mName;
    }
}
