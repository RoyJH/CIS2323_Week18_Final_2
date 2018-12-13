public class DemoCandles{
	
		public static void main (String[] args){
			Candle plain = new Candle();
			ScentedCandle scented = new ScentedCandle();
			
			plain.setcolor("Red");
			plain.setheight(8);
			plain.getprice();
			
			scented.setcolor("Green and Yellow Swirl");
			scented.setheight(6);
			scented.getprice();
			scented.setscent("Lemongrass Mint");
			
			plain.printCandle();
			scented.printScentedCandle();
		}

}