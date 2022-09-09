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
        } else {
            if (clientDeviceYear >= 2015)
                if (clientOS1 == 1) {
                    System.out.println("Установите полную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите полную версию приложения для iOS по ссылке");
                }

        }
        //Задание 3
        System.out.println("Задание 3");
        int year = 2032;
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 80;
        int days = 1;
        if(deliveryDistance > 20){
            days = (deliveryDistance / 40) + days;{
                System.out.println("Потребуется дней " + days);
            }
        }

        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 3;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
             System.out.println("Сейчас зима");
        break;
            case 3:
            case 4:
            case 5:
          System.out.println("Сейчас весна");
           break;
           case 6:
           case 7:
           case 8:
           System.out.println("Сейчас лето");
           break;
           case 9:
           case 10:
           case 11:
          System.out.println("Сейчас осень");
         default:
         System.out.println("Такого месяца не существует");
}
}
}