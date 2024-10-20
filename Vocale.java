import java.util.Scanner;

public class Vocale {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String sir = in.nextLine();

        String vocale = "aeiouAEIOU";
        int nrVocale = 0;
        int nrConsoane = 0;

        for (int i = 0; i < sir.length(); i++){
            char c = sir.charAt(i);

            if (vocale.indexOf(c) != -1) {
                nrVocale++;
            }else if (Character.isLetter(c)){
                nrConsoane++;
            }
        }

        System.out.println("Nr vocale: " + nrVocale);
        System.out.println("Nr consoane: " + nrConsoane);
    }
}
