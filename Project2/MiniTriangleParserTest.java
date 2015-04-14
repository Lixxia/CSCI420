import java.io.*;
import java_cup.runtime.*;
import java_cup.*;

class MiniTriangleParserTest {
   public static void main(String[] args){
      try {
         String fileName = args[0];
         
         //MiniTriangleLexer: replace with the name of your lexer
         //MiniTriangleParser: replace with the name of your parser
         CalcParser parser= new CalcParser(new MiniTriangleLexer(new FileReader(fileName)));
         Program pm = (Program)parser.debug_parse().value;
         String xml = pm.toXML();
         System.out.println("\n\n" + xml);
        // System.out.println("result is: " + result);
         System.out.println("\nParse complete");         
        } 
        catch (Exception e) {  
            e.printStackTrace();
        }
    }
}
