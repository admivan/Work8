package ru.dolgov;

public class Robot implements Runnable {
    private String name;
    protected int runDistance;
    protected int jumpHeight;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.runDistance = run;
        this.jumpHeight = jump;
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " Бежит " + runDistance);
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " Прыгает " + jumpHeight);
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public String toString() {
        return name;
    }
}
