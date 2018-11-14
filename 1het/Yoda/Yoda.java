public class Yoda {

 
    public static void main(String[] args) {
        int number = 2;
            if (2 == number)  // Itt látható a Yoda feltétel
           		{
             // 3 = number; // erre kiirja a java.lang.NullPointerException
               number = 3; // Ezzel müködik
            }
          	/* A yoda condition-t azért célszerű alkalmazni mert könnyen különbséget lehet tenni az értékadás és a feltétel
           vizsgálat között. Így el lehet kerülni az ebből fakadó hibákat.*/

                       
    }
    
}
