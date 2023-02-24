import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine("Red wine","Kindzmarauli","Georgia",
                LocalDate.of(2021,10,11));
        Wine wine2 = new Wine("White wine","Tobitoly","Georgia",
                LocalDate.of(2020,11,23));

        Vinodel vinodel = new Vinodel("Georgea",100,"Georgea, Aleuli12");
        Wine[] wines = {wine1,wine2};
        for (Wine wn:wines) {
            System.out.println(wn.toString());
            System.out.println(vinodel);
        }
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
        String a = "Saperavi";
        System.out.println("Please enter any digit:  ");
        System.out.println("New name of wine:  " + a);

    }
}