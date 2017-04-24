public class phraseomatic{
	public static void main(String[] args){
		// make three sets of words to choose from. 
		String[] WordListOne = {"24/7","multi-Tier","30.000 foot","B-To-B","Win-Win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
		
		String[] WordListTow = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked"};
		
		String[] WordListThree = {"process","tipping-point","solution","architechture","core competency","strategy","midshare","portal","space","vision","paradigm","mission"};
		
		//find out how many words are in each list
		int oneLength = WordListOne.length;
		int twoLength = WordListTow.length;
		int threeLength = WordListThree.length;
		
		//generate three random numbers
		int random1 = (int) (Math.random() * oneLength);
		int random2 = (int) (Math.random() * twoLength);
		int random3 = (int) (Math.random() * threeLength);
		
		//now build a phraseomatic
		String phrase = WordListOne[random1] + " " + WordListTow[random2] + " " + WordListThree[random3];
		
		//print out the phrase
		System.out.println("What we need is a " + phrase);
	}//method end
}//class end
	