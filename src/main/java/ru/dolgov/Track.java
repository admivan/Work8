package ru.dolgov;

public class Track implements Obstacle {
    private String name;
    private int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * Возвращаем длину беговой дорожки
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
        System.out.println(name + " длина: " + length);

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
