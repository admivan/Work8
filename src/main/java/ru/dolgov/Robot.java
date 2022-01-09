package ru.dolgov;

public class Robot implements Runnable {
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
    public Robot(String name, int run, int jump) {
        this.name = name;
        this.runDistance = run;
        this.jumpHeight = jump;
    }

    /**
     * Метод  бега
     */
    @Override
    public void run() {
        System.out.println("Робот " + name + " Бежит " + runDistance);
    }

    /**
     * Метод  прыжка
     */
    @Override
    public void jump() {
        System.out.println("Робот " + name + " Прыгает " + jumpHeight);
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

    @Override
    public String toString() {
        return name;
    }
}
