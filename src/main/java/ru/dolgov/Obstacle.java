package ru.dolgov;

interface Obstacle {
    int height();

    int length();

    boolean moving(Runnable runnable);
}
