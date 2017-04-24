public class mybeer{
	public static void main(String[] args){
		int beernum = 99;
		while (beernum > 0){
			if (beernum > 1){
				System.out.println(beernum + " bottles of beer on the wall," + beernum + " bottles of beer.");
				System.out.print("Take on down and pass it around,");
				beernum = beernum - 1;
				System.out.println(beernum + " bottles of beer on the wall.");
			} if (beernum == 1){
				System.out.println(beernum + " bottle of beer on the wall," + beernum + " bottle of beer.");
				System.out.println("Take on down and pass it around.");
				beernum = beernum - 1;
				System.out.println("No more bottles of beer on the wall");
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
			} 
		}
	}
}