public class Casting {
    public static void main(String[] args) {

        //en un año ubique 30 perritos
        // cuantos perritos ubique al mes

        double monthlyDogs = 30/12;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
