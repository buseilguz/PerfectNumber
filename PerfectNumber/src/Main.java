
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int total=0;
				
		Scanner scn=new Scanner(System.in);	
		System.out.println("Bir sayý giriniz :");
		int number=scn.nextInt();
		//sayýnýn pozitif tam bölenlerini bulduk.
		for (int i = 1; i <number; i++) {
			if(number%i==0)
				total=total+i;
		}
		//tam bölenlerinin toplamý sayýya eþit mi?
		if(total==number)
			System.out.println(number+" mükemmel bir sayýdýr.");
		else 
			System.out.println(number+" mükemmel bir sayý deðildir.");
	}

}
