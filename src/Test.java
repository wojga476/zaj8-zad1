import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String [] obiekt =new String[3];
        int [] obiekt1 =new int[3];
        Scanner input=new Scanner(System.in);
        System.out.println("podaj obiekt:");
        for(int i=0; i<obiekt.length;i++) {
            obiekt[i] = input.nextLine();
        }
    }
}