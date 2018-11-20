public class Liskov{

    public static void main(String[] args) {
     
    ValtoztatoEllipszis ellipse = new ValtoztatoEllipszis(); // Létrehozunk egy Elipszis objektumot
    Kor circle = new Kor(); // Illetve egy kört 
      
        
    ellipse.tengely(); 
    }
    
    
public static class Kor extends Ellipszis{
    
}
public static class ValtoztatoEllipszis extends Ellipszis{
    void tengely(){
 		System.out.print("Függoleges tengely modositva 10re.\nVizszintes tengely 20ra.\n");
 	}
}
public static class Ellipszis extends Liskov{
 	 
    
}
}
