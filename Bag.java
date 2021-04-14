import java.util.Scanner;
public class Bag {
	String brand;
	String colour;
	int priceRinggit;
	double volumeLiters;
	
	Scanner s = new Scanner(System.in);
	
	public void setBrand() {
		System.out.printf("%-20s:", "Enter the brand");
		this.brand = s.nextLine();
	}
	
	public void setColour() {
		System.out.printf("%-20s:", "Enter the colour");
		this.colour = s.nextLine();
	}
	
	public void setPriceRinggit() {
		System.out.printf("%-20s:", "Enter the price");
		this.priceRinggit = s.nextInt();
	}
	
	public void setVolumeLiters() {
		System.out.printf("%-20s:", "Enter the volume");
		this.volumeLiters = s.nextDouble();
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Integer getPrice() {
		return this.priceRinggit;
	}
	
	public double getVolume() {
		return this.volumeLiters;
	}
	
	public Integer changePrice() {
		System.out.printf("%-20s:", "Enter the new price");
		int newPrice = s.nextInt();
		return newPrice;
	}
	
	
}
