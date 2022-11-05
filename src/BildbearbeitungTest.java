

public class BildbearbeitungTest {
    public static void main(String[] args) {

        // Objekt von Typ Bild wird erzeugt.

        Bild bild = new Bild();

        // Initialiserung von array1
        int [][] testbild1 = {{1,1,0,1},{0,1,0,1},{0,1,1,1},{1,0,1,0}};

        // Aufrufe der Mehtoden setbildelemente und flipAndInvert
        bild.setbildelemente(testbild1);
        bild.flipAndInvert();

        System.out.println("Bild 1 nach filpAndInvert:");

        // Ergebnis wird ausgegeben.
        bild.ausgabe();

        System.out.println();
        
         // Initialiserung von array2
        int [][] testbild2 = {{0,0,1,1,0},{0,1,0,1,1},{1,0,0,1,1},{0,1,0,1,0}};

        // Aufrufe der Mehtoden setbildelemente und flipAndInvert
        bild.setbildelemente(testbild2);
        bild.flipAndInvert();
        
        System.out.println("Bild 2 nach filpAndInvert:");

        // Ergebnis wird ausgegeben.
        bild.ausgabe();

        
    }
}
