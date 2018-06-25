import java.util.Scanner;

public abstract class Obiekt implements Działanie{

    private String name;
    private int ilosc;

    public Obiekt() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe mebla: ");
        this.name = sc.nextLine();
        System.out.println("Podaj ilość elementu:");
        this.ilosc = sc.nextInt();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Obiekt))
            return false;
        Obiekt innyObiekt = (Obiekt) obj;

        if (!name.equals(innyObiekt.name)) {
            return false;}
        else {
            return true;
        }
    }
    @Override
    public String toString() {
        return "Nazwa mebla: " + name + " ilość elementu: " + ilosc;
    }
}
