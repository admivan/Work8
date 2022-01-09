package ru.dolgov;

interface Obstacle {

    int length();//Высота или длина препятствия

    /**
     * Метод проверки прошел ли участник препятствие
     * @param runnable принимаем участника
     */
    boolean moving(Runnable runnable);
}
