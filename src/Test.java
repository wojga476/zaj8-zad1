public class Test {

    public static void main(String[] args) {
        Obiekt [] meble = new Obiekt[2];
        meble[0] = new Obiekt(){};
        meble[1] = new Obiekt(){};


        for (int i=0; meble[0].equals(meble[1]); i++) {
            System.out.println("Popraw, tworzysz duplikat mebli.");
            meble[1] = new Obiekt(){};
        }
        System.out.println(meble[0].toString());
        System.out.println(meble[1].toString());
    }
}