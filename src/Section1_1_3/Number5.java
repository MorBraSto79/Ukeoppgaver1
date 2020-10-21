package Section1_1_3;

import java.util.Arrays;

public class Number5 {
    // Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a.
    //Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b definert ved:
    // int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?

    public static int[] minmaks(int[] a){
        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int min = 0;
        int maks = 0;

        for (int i = 1; i < a.length; i++){
            if (a[i] < a[min]){
                min = i;
            }
            if (a[i] > a[maks]){
                maks = i;
            }
        }
        int[] b = {min, maks};

        return b;

        // antall sammenligninger i metoden er: 3n-2
    }

    public static void main(String[] args){

        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};

        System.out.println(Arrays.toString(minmaks(a)));
    }
}
