
//Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.
public class Ex2 {
    public static void main(String[] args) {

        int day = 10;
        int month = 4;
        int year = 2000;

        if (month == 12) {
            day = 1;
            month = 1;
            year = year + 1;
        } else if (day == 31) {
            day = 1;
            month = month + 1;
        } else {
            day = day + 1;
        }
        System.out.println("Следующий день:  ");
        System.out.print(day);
        System.out.print("-");
        System.out.print(month);
        System.out.print("-");
        System.out.print(year);
    }
}



