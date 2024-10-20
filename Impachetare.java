public class Impachetare {
    public static void main (String[] args){
        int varsta = 20;
        int sex = 1; //1 - M, 0 - F
        int inaltime = 177;

    short infoImpachetata;

        infoImpachetata = (short) (varsta << 1);
        infoImpachetata = (short) ((infoImpachetata | sex) << 8);
        infoImpachetata = (short)(infoImpachetata | inaltime);

        inaltime =  infoImpachetata & 0xff;
        sex = ( infoImpachetata >>> 8) & 1;
        varsta = ( infoImpachetata >>> 9) & 0x7f;

        System.out.println(varsta);
        System.out.println(sex);
        System.out.println(inaltime);
    }
}
