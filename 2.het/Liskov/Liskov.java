public class Liskov{

    public static void main(String[] args) {
     
    ValtoztatoElipszis ellipse = new ValtoztatoElipszis(); // Létrehozunk egy Elipszis objektumot
    Kor circle = new Kor(); // Illetve egy kört 
      
        
    ellipse.tengely(); //Ezzel a paranccsal a tengelyeket 
                    //10 egysegre illetve 20-ra modositjuk
                    // amiből következik hogy ez az alakzat nem lehet kör, mégis elfogadja a program
                    // Sértve ezzel a Liskov elvet

     
    }
    
    
public static class Kor extends Elipszis{
    
}
public static class ValtoztatoElipszis extends Elipszis{
    void tengely(){
 		System.out.print("Függoleges tengely modositva 10re.\nVizszintes tengely 20ra.\n");
 	}
}
public static class Elipszis extends Liskov{
 	 
    
}
}
