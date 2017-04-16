
public class E9_2 {
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL","Oracl Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
		System.out.println("Current Price: " + stock.currentPrice);
		System.out.println("Price Change: " + stock.getChangepercent() * 100 + "%");
	}
}

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	public Stock(){
		
	}
	public Stock(String newSymbol,String newName){
		symbol = newSymbol;
		name = newName;
	}
	public double getChangepercent(){
		return (currentPrice - previousClosingPrice) / currentPrice ;
	}
}
	
	
