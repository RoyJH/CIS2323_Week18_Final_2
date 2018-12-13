public class ScentedCandle extends Candle{
		public String scent;
		
		public void setscent(String s){
				scent = s;
		}
		public String getscent(){
				return scent;
		}
		public void setheight(int h){
				height = h;
				int v = 3;
				int p = h * v;
				price = p;
		}
		public void printScentedCandle(){
				System.out.println("");
				System.out.println("Scented Candle");
				System.out.println("Color: " + getcolor());
				System.out.println("Height: " + getheight()+"\"");
				System.out.println("Price: $" + getprice());
				System.out.println("Scent: "+ getscent());
		}
}
