package Section1_1_2;

public class Number1 {
    // Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste
    // verdien i en tabell. Hva ville metodekallet min(a) returnere med hvis a er tabellen i figur 1.1.2?

    static int min(int[] a){ // a er en heltallstabell
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int m = 0; // indeks til foreløpig minste verdi

        for (int i = 1; i < a.length; i++){ // trenger ikke sjekke indeks 0, da vi allerede påstår at den er minst.
            if(a[i] < a[m]){
                m = i;                      // indeks oppdateres med minste verdi
            }
        }
        return m;                           // returnerer indeks/posisjon til minste verdi
    }

    public static void main(String[] args){

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19}; //tabellen a, som den er i Figur 1.1.2 i kompendiet

        System.out.println(min(a));     // returnerer posisjon nr 6.
    }
}
