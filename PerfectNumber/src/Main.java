
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int total=0;
				
		Scanner scn=new Scanner(System.in);	
		System.out.println("Bir say� giriniz :");
		int number=scn.nextInt();
		//say�n�n pozitif tam b�lenlerini bulduk.
		for (int i = 1; i <number; i++) {
			if(number%i==0)
				total=total+i;
		}
		//tam b�lenlerinin toplam� say�ya e�it mi?
		if(total==number)
			System.out.println(number+" m�kemmel bir say�d�r.");
		else 
			System.out.println(number+" m�kemmel bir say� de�ildir.");
	}

}
