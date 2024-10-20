public class SumaPrime {

    public static boolean ePrim(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Goldbach(int num) {
        for (int i = 2; i <= (num / 2); i++){
            if(ePrim(i)){
                System.out.println((2 * num) + " = " + num + " + " + num);
                return;
            }
        }
    }

    public static void main(String[] args){
        int m = 5;
        int n = 14;
        for (int i = m; i <= n; i+=2){
            Goldbach(i);
        }
    }
}
