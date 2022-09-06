public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");

        int clientOS = 1 | 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание 2");

        int clientDeviceYear = 2016;
        int clientOS1 = 1 | 0;
        if (clientDeviceYear < 2015) {
            if (clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else{ if (clientDeviceYear >= 2015)
            if (clientOS1 == 1){
                System.out.println("Установите полную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите полную версию приложения для iOS по ссылке");
            }
					else{
            }
        }
        //Задание 3
        System.out.println("Задание 3");
    }
        }

