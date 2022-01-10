package ru.dolgov;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        //Генерация Человека, Кота, Робота
        Runnable[] runnables = new Runnable[2];
        for (int i = 0; i < runnables.length; i++) {
            runnables[i] = generateRunnable();
        }
        //Генерация препятствия
        Obstacle[] obstacles = new Obstacle[6];
        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i] = generateObstacle();
        }

        /*
        Выбор участника по порядку
         */
        for (int i = 0; i < runnables.length; i++) {
            boolean result = true; // Объявления переменной результата
            //Проходим по всем препятствиям каждым игроком
            for (int j = 0; j < obstacles.length; j++) {

                result = obstacles[j].moving(runnables[i]);//Вызываем метод moving на припятские
                /*
                Если участник не прошел препятствие выходим с цикла перебора препятствий
                 */
                if (!result) {
                    break;
                }
            }
            /*
            Вывод прошел ли участник препятствие
             */
            if (result) {
                System.out.println(runnables[i] + " До шел до финиша!");
            } else {
                System.out.println(runnables[i] + " Проиграл не дошел до финиша");
            }
        }

    }

    /**
     * Генерация Человека, Кота, Робота
     * @return Возвращаем массив
     */
    public static Runnable generateRunnable() {
        String[] nameshuman = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] namesrobot = new String[]{"Бейлис", "Бильбо", "Бывалый", "Воля", "Виндоус", "Винтер", "Винтик", "Вихрь", "Вольт", " Гастон"};
        String[] namescat = new String[]{"Айсберг", "Аскольд", "Астерикс", "Аякс", "Артур", "Асклепий", "Арес", "Атос", "Арамис", "Август"};

        int typeIndex = random.nextInt(3);
        int distance = random.nextInt(101);
        int jumpes = random.nextInt(31);
        switch (typeIndex) {
            case 0:
                return new Human(nameshuman[random.nextInt(nameshuman.length)], distance, jumpes);
            case 1:
                return new Robot(namesrobot[random.nextInt(namesrobot.length)], distance, jumpes);
            case 2:
                return new Cat(namescat[random.nextInt(namescat.length)], distance, jumpes);
        }
        return null;
    }

    /**
     * Генерация препятствия
     * @return Возвращаем массив
     */
    public static Obstacle generateObstacle() {

        int typeIndex = random.nextInt(2);
        int height = random.nextInt(20);
        int lenght = random.nextInt(100);

        switch (typeIndex) {
            case 0:
                return new Wall("Стена", height);
            case 1:
                return new Track("Беговая дорожка", lenght);
        }
        return null;
    }
}
