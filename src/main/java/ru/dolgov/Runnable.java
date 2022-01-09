package ru.dolgov;

interface Runnable {
    void run();//Метод бега

    void jump();//Метод прыжка

    int getRunDistance();//Возвращение дистанции макс

    int getJumpHeight();//Возвращение высоты макс
}
