import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Scanner;

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

    public static void checkPhoneSettings(int checkYears, int checkOS) {
        if (checkOS == 0 && checkYears <= 2022) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������.");
        } else if (checkOS == 0 && checkYears > 2022) {
            System.out.println("���������� Lite ������ ���������� ��� iOS �� ������");
        } else if (checkOS == 1 && checkYears <= 2022) {
            System.out.println("���������� ������ ���������� ��� Android �� ������.");
        } else {
            System.out.println("���������� Lite ������ ���������� ��� Android �� ������");
        }
    }

    public static int checkDistanceClient(int distanceClient) {
        int count = 1;
        int countDays = 20;
        if (distanceClient == 20) {
            return count;
        } else {
            while (countDays < distanceClient){
                count++;
                countDays += 40;
            }
            return count;
        }
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
        int deliveryDistance = checkDistanceClient(500);
        System.out.println("���������� ���� ��� ��������: " + deliveryDistance);

    }
}