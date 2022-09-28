package Revursividad;

public class MCD {

	public static void main(String[] args) {
		int num1=15;
		int num2=10;
		System.out.println("el MCD de: "+num1+" "+num2+" es: "+Mcd(num1,num2));
	}
	public static int Mcd(int num1,int num2) {
		if(num1==num2) {return num1;}
		if(num1==0 || num2==0) {
		return 0;
		}
		if(num1 >num2){
			return Mcd(num1-num2, num2);
			}else{return Mcd(num1, num2-num1);}
		
		
	}
}
