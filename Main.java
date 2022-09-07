package java_crypto_portfolio;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price;
		Bitcoin bitcoin;
		
		Date timestamp = new Date();
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter current BTC-USD price: ");
		
		price = scanner1.nextDouble();
		
		System.out.println("Enter Bitcoin wallet balance: ");
		
		bitcoin = new Bitcoin(scanner1.nextDouble());
		
		System.out.println("Your "+bitcoin.bitcoin+" bitcoin is worth "+price*bitcoin.bitcoin+" US dollars on "+timestamp+".");
		
		scanner1.close();
		
	}

}
