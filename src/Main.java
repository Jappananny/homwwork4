public class Main {
    public static void main(String[] args) {
        //Задача 1/2
        System.out.println("Задача 1/2");

        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        //Задача 3
        System.out.println("Задача 3");

        int year = 2021;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 60;
        int day = 1;
        int distanceIncer = 40;

        if (deliveryDistance > 20) {
            int addDays = (deliveryDistance -20)/ distanceIncer+1;
            day = addDays + day;
        } System.out.println("Потребуется дней: " + day);

    }
}