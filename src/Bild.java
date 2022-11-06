public class Bild{

    // Instanzvariable deklariert.

     private int[][] bildelemente;

     
    // Setter für das array bildelemente.
     public void setbildelemente(int[][] newbildelemente){

        // Ueberprüfung, ob newbildelemente eventuell leer ist.
        if (newbildelemente == null || newbildelemente.length == 0)
        {
            System.out.println("Das Array ist leer.");
            System.exit(0);
        }
        else
        {
            bildelemente = newbildelemente;
        }
        
     }


     public void flipAndInvert(){

        // Invertieren, das heißt 1 wird zur 0 und 0 wird zur 1.

        for (int i = 0; i < bildelemente.length; i++) {
            for (int j = 0; j < bildelemente[i].length; j++) {
                if (bildelemente[i][j] == 1)
                {
                    bildelemente[i][j] = 0;
                }
                else
                {
                    bildelemente[i][j] = 1;
                }
            }
        }


        // flipen beziehungsweise auf den Kopf stellen.

            int counter = 0;
            int [][] tempbildelemente = new int[bildelemente.length][bildelemente[0].length];
            
            for (int i = 0; i < bildelemente.length; i++) {
                for (int j = 0; j < bildelemente[i].length; j++) {
                    
                    tempbildelemente[bildelemente.length-(i+1)][counter] = bildelemente[i][j];
                    counter++;
                }
                counter = 0;
            }

        // Elemente aus dem tempbildelemente Array in das bildelement Array überführen.

            for (int i = 0; i < tempbildelemente.length; i++) {
                for (int j = 0; j < tempbildelemente[i].length; j++) {
                    bildelemente[i][j] = tempbildelemente[i][j];
                }
            }
     }


    // ausgabe, welche das Bild in der Konsole ausgibt.
     public void ausgabe(){

        for (int i = 0; i < bildelemente.length; i++) {
            for (int j = 0; j < bildelemente[i].length; j++) {
                System.out.print(bildelemente[i][j]);
            }
            System.out.println();
        }

     }

}