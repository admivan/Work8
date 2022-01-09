package ru.dolgov;

public class Wall implements Obstacle {
    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }


    @Override
    public int height() {
        return height;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public boolean moving(Runnable runnable) {
        System.out.println(name + " высота: " + height);

        runnable.jump();

        if (height() <= runnable.getJumpHeight()) {
            System.out.println("Прыжок успешен");

            return true;
        } else {
            System.out.println("Прыжок провален");

            return false;
        }
    }

}
