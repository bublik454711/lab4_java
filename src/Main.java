import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client[] cl = new Client[2];
        cl[0]=new Client();
        cl[0].input();
        cl[0].print();
        cl[1]=new Client();
        cl[1].print();

        System.out.println("Кол-во пройденных занятий: "+cl[0].getCompLess());
        int HoursComp = LessToHours.convert(cl[0].getCompLess());
        System.out.println("Кол-во пройденных часов обучения: "+HoursComp);

        System.out.println("Количество клиентов: "+ Client.getClientCounter());
    }
}