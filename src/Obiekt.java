public abstract class Obiekt implements Działanie{

    private String[] obiekt1;
    private String[] obiekt2;

    public String[] getObiekt1() {
        return obiekt1;
    }

    public void setObiekt1(String[] obiekt1) {
        this.obiekt1 = obiekt1;
    }

    public String[] getObiekt2() {
        return obiekt2;
    }

    public void setObiekt2(String[] obiekt2) {
        this.obiekt2 = obiekt2;
    }

    public Obiekt(String[] obiekt1, String[] obiekt2) {
        this.obiekt1 = obiekt1;
        this.obiekt2 = obiekt2;
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void sprawdzenie() {
        if (obiekt1==obiekt2){


        }
    }
}
