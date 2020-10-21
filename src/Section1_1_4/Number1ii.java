package Section1_1_4;

public class Number1ii {
    /*
    Hvor mange grunnleggende operasjoner utfører Programkode 1.1.4 hvis tabellen a inneholder
    ii) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     */

    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++){
            if (a[i] > maksverdi)
            {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

    public static void main(String[] args){

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(maks(a));
    }
}
