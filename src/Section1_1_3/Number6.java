package Section1_1_3;

public class Number6 {
    //Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
    //long fak(int n) som regner ut n!. Hvor mange multiplikasjoner utføres i metoden?

    public static long fak(int n){
        long fak = 1;

        for(int i = 1; i <= n; i++){
            fak = i * fak;
        }

        return fak;

        //Metoden utfører n-1 multiplikasjoner
    }

    public static void main(String[] args){

        System.out.println(fak(5));
    }
}
