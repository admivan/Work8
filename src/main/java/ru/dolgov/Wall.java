package ru.dolgov;

public class Wall implements Obstacle {
    private String name;
    private int length;

    public Wall(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * Возвращаем высоту стены
     *
     * @return
     */
    @Override
    public int length() {
        return length;
    }

    /**
     * Метод проверки прошел ли участник препятствие
     *
     * @param runnable принимаем участника
     * @return возвращаем true прошел false не прошел
     */
    @Override
    public boolean moving(Runnable runnable) {
        System.out.println(name + " высота: " + length);

        runnable.jump();

        if (length() <= runnable.getJumpHeight()) {
            System.out.println("Прыжок успешен");

            return true;
        } else {
            System.out.println("Прыжок провален");

            return false;
        }
    }

}
