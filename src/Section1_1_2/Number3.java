package Section1_1_2;

public class Number3 {
    // Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen
    // til den første av dem. Hva må endres for at den skal returnere posisjonen til den siste?

    static int maks(int[] a){
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int m = 0;                              // indeks til foreløpig største posisjon

        for (int i = 1; i < a.length; i++){
            //if(a[i] > a[m]){
            if(a[i] >= a[m]){                   // for å returnere posisjonen til den siste må man ha >= istedenfor >
                m = i;
            }
        }
        return m;
    }

    public static void main(String[] args){

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 20};

        System.out.println(maks(a));
    }
}
