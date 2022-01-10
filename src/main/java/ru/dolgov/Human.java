package ru.dolgov;

public class Human implements Runnable {
    private String name;
    protected int runDistance;
    protected int jumpHeight;

    /**
     * Конструктор принимаем имя макс дистанцию и макс высоту
     *
     * @param name
     * @param run
     * @param jump
     */
    public Human(String name, int run, int jump) {
        this.name = name;
        this.runDistance = run;
        this.jumpHeight = jump;
    }

    /**
     * Метод  бега
     */
    @Override
    public void run() {
        System.out.println("Человек " + name + " Бежит " + runDistance);
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Метод  прыжка
     */
    @Override
    public void jump() {
        System.out.println("Человек " + name + " Прыгает " + jumpHeight);
    }

    /**
     * Возвращаем значения переменной runDistance
     * @return
     */
    @Override
    public int getRunDistance() {
        return runDistance;
    }

    /**
     * Возвращаем значения переменной jumpHeight
     * @return
     */
    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }
}
