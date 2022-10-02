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

        //Задача 5
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber){
        case 1:
        System.out.println("Январь");
        System.out.println("Зима");
        break;
        case 2:
        System.out.println("Февраль");
        System.out.println("Зима");
        break;
        case 3:
        System.out.println("Март");
        System.out.println("Весна");
        break;
        case 4:
        System.out.println("Апрель");
        System.out.println("Весна");
        break;
        case 5:
        System.out.println("Май");
        System.out.println("Весна");
        break;
        case 6:
        System.out.println("Июнь");
        System.out.println("Лето");
        break;
        case 7:
        System.out.println("Июль");
        System.out.println("Лето");
        break;
        case 8:
        System.out.println("Август");
        System.out.println("Лето");
        break;
        case 9:
        System.out.println("Сентябрь");
        System.out.println("Зима близко");
        break;
        case 10:
        System.out.println("Октябрь");
        System.out.println("Зима близко");
        break;
        case 11:
        System.out.println("Ноябрь");
        System.out.println("Зима близко");
        break;
        case 12:
        System.out.println("Декабрь");
        System.out.println("Зима");
        break;
        default:
        System.out.println("Что за месяц");
}

    }
}