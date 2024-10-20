public class Loto {

    public static long combinari(int n, int k) {
        if (k > n) {
            return 0;
        }

        long rezultat = 1;
        for (int i = 0; i < k; i++) {
            rezultat *= (n - i);
            rezultat /= (i + 1);
        }
        return rezultat;
    }

    public static int nrRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args){

        double sanse = 1.0 / (combinari(49, 6));

        System.out.println(sanse + "\n");

        System.out.println(nrRandom(1, 46) + " " + nrRandom(1, 46) + " " +  nrRandom(1, 46) + " " +  nrRandom(1, 46) + " " +  nrRandom(1, 46) + " " +  nrRandom(1, 46));


    }
}
