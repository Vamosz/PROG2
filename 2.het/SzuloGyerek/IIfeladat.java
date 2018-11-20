public class IIfeladat {

    public static void main(String[] args) {
        Szulo szulo = new Gyerek();
            szulo.viselkedes();
    }
    
public static class Gyerek extends Szulo{
     void viselkedes(){
        System.out.print("nyavaja");
    }
}
public static class Szulo extends IIfeladat{
   }
}
