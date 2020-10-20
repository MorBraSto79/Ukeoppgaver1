package Section1_1_2;

public class Number2 {
    // Lag en min-metode på samme måte som maks-metoden i programkode 1.1.2, dvs. en metode som finner (og returnerer)
    // posisjonen til minste verdien i tabellen

    static int min(int[] a){
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int m = 0;                              // indeks til foreløpig minste posisjon

        for (int i = 1; i < a.length; i++){
            if(a[i] < a[m]){
                m = i;
            }
        }
        return m;
    }

    public static void main(String[] args){

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19}; //tabellen a, som den er i Figur 1.1.2 i kompendiet

        System.out.println(min(a));
    }
}
