package ru.dolgov;

public class Human implements Runnable {
    private String name;
    protected int runDistance;
    protected int jumpHeight;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.runDistance = run;
        this.jumpHeight = jump;
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " Бежит " + runDistance);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " Прыгает " + jumpHeight);
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }
}
