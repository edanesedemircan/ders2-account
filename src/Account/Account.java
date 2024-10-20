package Account;

import java.util.Scanner;

public class Account {

	private String name;
	private int bakiye;
	
Account(String name, int bakiye){
	
	this.name=name;
	if (bakiye<0)
		System.out.println("bakiye sıfırdan küçük olamaz");
	else
		this.bakiye=bakiye;
}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBakiye() {
		return bakiye;
	}
	
	public void depositMoney(int miktar) {
		bakiye=bakiye+miktar;
	}
	
	
public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);
	Account k1=new Account ("Eda",500);
	Account k2=new Account ("Engin", 1200);
	
	System.out.println("Kullanıcılar: ");
	System.out.println("1.kullanıcı: "+k1.getName()+"   ");
	System.out.println("Bakiye: "+k1.getBakiye()+"    ");
	
	System.out.println("2.kullanıcı: "+k2.getName()+"   ");
	System.out.println("Bakiye: " +k2.getBakiye()+"   ");
	
	System.out.println("Miktar giriniz");
	int miktar1 =input.nextInt();
	k1.depositMoney(miktar1);
	
	int miktar2=input.nextInt();
	k2.depositMoney(miktar2);
	
	System.out.println("Kullanıcılar: ");
	System.out.println("1.kullanıcı: "+k1.getName()+"   ");
	System.out.println("Bakiye: "+k1.getBakiye()+"    ");
	
	System.out.println("2.kullanıcı: "+k2.getName()+"   ");
	System.out.println("Bakiye: " +k2.getBakiye()+"   ");
	
	
}
	
	
}
