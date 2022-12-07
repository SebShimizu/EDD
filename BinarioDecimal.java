package Revursividad;
import java.util.Scanner;
public class BinarioDecimal {
public static int NumeroD=0;
public static void main(String[] args) {
   Scanner leer= new Scanner(System.in);
   String NumeroIngresar ;
   System.out.println("Ingresa un numero Binario");
   NumeroIngresar=leer.next();
   int NumeroB=Integer.parseInt(NumeroIngresar);
   int or=(NumeroIngresar.length()-1);
   if(NumeroB>=0){
       System.out.println();
       conver(NumeroB,or);
    }
   else{
       NumeroB=(NumeroB/-1);
       System.out.println( "Este numero en decimal equivale a :" + NumeroD);
       conver(NumeroB,or);
   }
   System.out.println( "Este numero en decimal equivale a :" + NumeroD); 
}
public static void conver (int bi,int or){
   if(bi<10){
      int Conversion=(bi%2)*(int)Math.pow(2,or);
      NumeroD=NumeroD+Conversion;
      return;
   }
   else{
    conver(bi/10,or-1); 
    int Conversion=(bi%2)*(int)Math.pow(2,or);
     NumeroD=NumeroD+Conversion;
      return;
   }
   }
  }