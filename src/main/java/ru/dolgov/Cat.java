package ru.dolgov;

public class Cat implements Runnable {
    private String name;
    private int runDistance;
    private int jumpHeight;

    /**
     * Конструктор принимаем имя макс дистанцию и макс высоту
     *
     * @param name
     * @param run
     * @param jump
     */
    public Cat(String name, int run, int jump) {
        this.name = name;
        this.runDistance = run;
        this.jumpHeight = jump;
    }

    /**
     * Метод  бега
     */
    @Override
    public void run() {
        System.out.println("Кот " + name + " Бежит " + runDistance);
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
        System.out.println("Кот " + name + " Прыгает " + jumpHeight);
    }

    /**
     * Возвращаем значения переменной runDistance
     * @return
     */
    public int getRunDistance() {
        return runDistance;
    }

    /**
     * Возвращаем значения переменной jumpHeight
     * @return
     */
    public int getJumpHeight() {
        return jumpHeight;
    }

}
