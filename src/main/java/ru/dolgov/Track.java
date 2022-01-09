package ru.dolgov;

public class Track implements Obstacle {
    private String name;
    private int lenght;

    public Track(String name, int lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public int length() {
        return lenght;
    }

    @Override
    public boolean moving(Runnable runnable) {
        System.out.println(name + " длина: " + lenght);

        runnable.run();

        if (length() <= runnable.getRunDistance()) {
            System.out.println("Бег успешен");

            return true;
        } else {
            System.out.println("Не могу бежать больше " + runnable.getRunDistance());

            return false;
        }
    }
}
