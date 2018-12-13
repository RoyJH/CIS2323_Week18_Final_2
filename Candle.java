public class Candle{
		String color;
		int height;
		int price;
			
		void setcolor(String c){
				color = c;
		}
		public String getcolor(){
				return color;
		}
		public void setheight(int h){
				height = h;
				int v = 2;
				int p = h * v;
				price = p;
		}
		public int getheight(){
				return height;
		}
		public int getprice(){
				return price;
		}
		public void setprice(int p){
				price = p;
		}
		public void printCandle(){
				System.out.println("");				
				System.out.println("Scented Candle");
				System.out.println("Color: " + getcolor());
				System.out.println("Height: " + getheight()+"\"");
				System.out.println("Price: $" + getprice());
		}
}