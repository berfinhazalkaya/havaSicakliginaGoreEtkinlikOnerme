import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen hava sıcaklığını giriniz : ");
        sicaklik = input.nextInt();

        if(sicaklik <5){
            System.out.print("Bu havada kayak yapabilirsiniz.");
        }
        else if(sicaklik >= 5 && sicaklik <15){
            System.out.print("Bu havada sinemaya gidebilirsiniz");
        }
        else if(sicaklik >= 15 && sicaklik <= 25){
            System.out.print("Bu havada piknik yapabilirsiniz.");
        }
        else{
            System.out.print("Bu havada yüzmeye gidebilirsiniz");
        }

    }
}
