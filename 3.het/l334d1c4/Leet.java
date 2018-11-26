import java.util.Scanner;
import java.util.Vector;


public class Leet {

    public static Vector<String> atalakitas(String szo, Vector<String> szovector)
    {
        
        szo=szo.toUpperCase();
        for(int i=0;i<szo.length();i++)
        {
            switch (szo.charAt(i)) {
                case 'A' : szovector.add("4");
                     break;
                case 'B' : szovector.add("|3");
                     break;
                case 'C' : szovector.add("(");
                     break;
                case 'D' : szovector.add("|)");
                     break;
                case 'E' : szovector.add("3");
                     break;
                case 'F' : szovector.add("|=");
                     break;
                case 'G' : szovector.add("6");
                     break;
                case 'H' : szovector.add("|-|");
                     break;
                case 'I' : szovector.add("|");
                     break;     
                case 'J' : szovector.add(".]");
                     break;
                case 'K' : szovector.add("|<");
                     break;      
                case 'L' : szovector.add("1");
                     break;      
                case 'M' : szovector.add("|Y|");
                     break;
                case 'N' : szovector.add("N");
                     break;
                case 'O' : szovector.add("0");
                     break;
                 case 'P' : szovector.add("P");
                     break;
                case 'Q' : szovector.add("Q");
                     break;
                case 'R' : szovector.add("|2");
                     break;
                case 'S' : szovector.add("5");
                     break;
                case 'T' : szovector.add("7");
                     break;
                case 'U' : szovector.add("|_|");
                     break;                    
                case 'V' : szovector.add("V");
                     break;
                case 'W' : szovector.add("W");
                     break;                    
                case 'X' : szovector.add("}{");
                     break;                     
                case 'Y' : szovector.add("'/");
                     break;
                case 'Z' : szovector.add("2");
                     break;
                case ' ' : szovector.add(" ");
                     break;      
            }
        
        
        }
        
    return szovector; 
    }
    
    public static void main(String[] args) {
       Vector<String> szovector = new Vector<>();
       Scanner scan = new Scanner(System.in);
       String szo;
       String kerdes;
       boolean kerdesbool = true;
 
      while(kerdesbool=true)
      {
       kerdesbool=false;
       System.out.println("irj be egy szot!");
       szo=scan.nextLine();
       System.out.println("Általad megadott szó: "+szo);
       
       szovector=atalakitas(szo,szovector);
               
       for(int i=0;i<szovector.size();i++)
         System.out.print(szovector.get(i));
       
       System.out.print("\n");
       System.out.println("Folytassuk?(y vagy n)");
       kerdes=scan.nextLine();
       if(kerdes.startsWith("y"))
       {
           szovector.clear();
           kerdesbool = true;
       }
       else
           break;
      }
           
       
       
    }
    
}
