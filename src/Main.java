import java.time.LocalDate;

public class Main {
    public static void checkingTheYear(int checkYear) {
        if ((checkYear % 4 == 0) && checkYear % 100 != 0) {
            System.out.println(checkYear + " - ���������� ���.");
        } else if ((checkYear % 4 == 0) && (checkYear % 100 == 0) && (checkYear % 400 == 0)) {
            System.out.println(checkYear + " - ���������� ���.");
        } else {
            System.out.println(checkYear + " - �� ���������� ���.");
        }
    }
    public static void checkPhoneSettings(int checkYears, int checkOS){
        if (checkOS == 0 && checkYears <= 2022){
            System.out.println("���������� ������ ���������� ��� iOS �� ������.");
        } else if (checkOS == 0 && checkYears > 2022) {
            System.out.println("���������� Lite ������ ���������� ��� iOS �� ������");
        } else if (checkOS == 1 && checkYears <= 2022) {
            System.out.println("���������� ������ ���������� ��� Android �� ������.");
        } else {
            System.out.println("���������� Lite ������ ���������� ��� Android �� ������");
        }
    }
    public static int checkDistanceClient(int distanceClient, int dayDistance){
        if (distanceClient <= 20){
            return dayDistance = 1;
        } if (distanceClient <= 60) {
            return dayDistance = 2;
        }
        return dayDistance = 3;
    }

    public static void main(String[] args) {

        //������ 1
        int year = 2002;
        checkingTheYear(year);

        //������ 2
        int clientOS2 = 1;
        int currentYear = 2022;
        checkPhoneSettings(currentYear, clientOS2);

        //������ 3
        int deliveryDistance = checkDistanceClient(95, 1);
        System.out.println("���������� ���� ��� ��������: " + deliveryDistance);

    }
}