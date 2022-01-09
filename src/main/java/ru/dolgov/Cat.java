package ru.dolgov;

public class Cat implements Runnable {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.runDistance = run;
        this.jumpHeight = jump;
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " Бежит " + runDistance);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " Прыгает " + jumpHeight);
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

}
