package HalukHocaNewTask;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDataBase  {
	static Scanner scan=new Scanner(System.in);
	static ArrayList<String> horror=new ArrayList<>();
	static ArrayList<String> actionadventure=new ArrayList<>();
	static ArrayList<String> classics=new ArrayList<>();
	static ArrayList<String> fantastic=new ArrayList<>();
	static ArrayList<String> mystery=new ArrayList<>();
	static ArrayList<String> novel=new ArrayList<>();
	static ArrayList<String> political=new ArrayList<>();
    static ArrayList<Integer> nums1=new ArrayList<>();
    static ArrayList<String> allBook=new ArrayList<>();
    static ArrayList<Integer> price=new ArrayList<>();
    static ArrayList<String> addBooks=new ArrayList<>();
	BookVariety horror1;
	String hData;
	String hisData;
	String numsData;
	static int priceData;
	static BookVariety comics1,actionAdventure1,classics1,fantastic1,mystery1,novel1,historical1;
	public void addBook() {
		System.out.println("Bagista bulunacaginiz kitap sayisini giriniz");
		int kitapsayisi=scan.nextInt();
		String bagisKitap;
		for(int i=0;i<kitapsayisi;i++) {
			System.out.println(i+1 +". kitabin yazarini giriniz");
			String author=scan.next();
			System.out.println(i+1+ ". kitabin adini giriniz");
			String bookname=scan.next();
			bagisKitap=author+"-"+bookname;
			addBooks.add(bagisKitap);
		}
		System.out.println("Bagisladiginiz kitaplarin listesi: ");
		int x=addBooks.size();
		for(int i=0;i<x;i++) {
			System.out.println(addBooks.get(i));
		}
		
	}
	public ArrayList<String> politicalList(){
	    historical1=new BookVariety("KARL MARKS","DAS KAPİTAL",150);
	    hisData=BookVariety.author+" - "+BookVariety.name;
	    priceData=BookVariety.nums;
	    political.add(hisData);
	    allBook.add(hisData);
	    price.add(priceData);
	    return political;
	}
	public ArrayList<String> horrorList(){
		horror1=new BookVariety("Stephen King","The Shinnig",140);
		hData=BookVariety.author+" - "+BookVariety.name;
		horror.add(hData);
		priceData=BookVariety.nums;
		price.add(priceData);
		allBook.add(hData);
		horror1=new BookVariety("Clive Barker","Sun",130);
		hData=BookVariety.author+" - "+BookVariety.name;
		horror.add(hData);
		priceData=BookVariety.nums;
		price.add(priceData);
		allBook.add(hData);
	    horror1=new BookVariety("Peter Straub","The Night",170);
	    hData=BookVariety.author+" - "+BookVariety.name;
	    horror.add(hData);
	    priceData=BookVariety.nums;
	    price.add(priceData);
	    allBook.add(hData);
	    horror1=new BookVariety("Bram Stoker","Baby",290);
	    hData=BookVariety.author+" - "+BookVariety.name;
	    horror.add(hData);
	    priceData=BookVariety.nums;
	    price.add(priceData);
	    allBook.add(hData);
	    return horror;
	}
	String acData;
	public ArrayList<String> actionAdventureList(){
		    actionAdventure1=new BookVariety("Don Brown","Angels and Demons",120);
		    acData=BookVariety.author+" - "+BookVariety.name;
		    actionadventure.add(acData);
		    allBook.add(acData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    actionAdventure1=new BookVariety("J.R.R. Tolkien","The Lord Of The Rings",130);
		    acData=BookVariety.author+" - "+BookVariety.name;
		    actionadventure.add(acData);
		    allBook.add(acData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    actionAdventure1=new BookVariety("J.K. Rowling","Harry Potter",340);
		    acData=BookVariety.author+" - "+BookVariety.name;
		    actionadventure.add(acData);
		    allBook.add(acData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    actionAdventure1=new BookVariety("Mark Twain","Finn",67);
		    acData=BookVariety.author+" - "+BookVariety.name;
		    actionadventure.add(acData);
		    allBook.add(acData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    return actionadventure;
		}
	static String classicsData;
	public static ArrayList<String> classicsList(){
		  classics1=new BookVariety("Lev Tolstoy","Anna Karenina",24);
		    classicsData=BookVariety.author+" - "+BookVariety.name;
		    classics.add(classicsData);
		    allBook.add(classicsData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    classics1=new BookVariety("Maksim Gorki","Ana",82);
		    classicsData=BookVariety.author+" - "+BookVariety.name;
		    classics.add(classicsData);
		    allBook.add(classicsData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    classics1=new BookVariety("Fyodor Dostoyevski","Suc ve Ceza",120);
		    classicsData=BookVariety.author+" - "+BookVariety.name;
		    classics.add(classicsData);
		    allBook.add(classicsData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    classics1=new BookVariety("Anton Cehov","Visne Bahcesi",133);
		    classicsData=BookVariety.author+" - "+BookVariety.name;
		    classics.add(classicsData);
		    allBook.add(classicsData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    classics1=new BookVariety("I. Turgenyev","Babalar ve Ogullar",240);
		    classicsData=BookVariety.author+" - "+BookVariety.name;
		    classics.add(classicsData);
		    allBook.add(classicsData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    classics1=new BookVariety("Nikolay Vaisyevic","Gogol",98);
		    classicsData=BookVariety.author+" - "+BookVariety.name;
		    classics.add(classicsData);
		    allBook.add(classicsData);
		    priceData=BookVariety.nums;
		    price.add(priceData);
		    return classics;
	}
	static String fData;
	public static ArrayList<String> fantasticList(){
	   fantastic1=new BookVariety("Stephenie Meyer","The Twilight",124);
	   fData=BookVariety.author+" - "+BookVariety.name;
	   fantastic.add(fData);
	   allBook.add(fData);
	   priceData=BookVariety.nums;
	    price.add(priceData);
	   return fantastic;
	}
	static String mysData;
	public static ArrayList<String> mysteryList(){
		   mystery1=new BookVariety("Stephenie Meyer","Java the Danger",126);
		   mysData=BookVariety.author+" - "+BookVariety.name;
		   mystery.add(mysData);
		   allBook.add(mysData);
		   priceData=BookVariety.nums;
		    price.add(priceData);
		   return mystery;
	}
	static String novData;
	public static ArrayList<String>  novelList(){
		 novel1=new BookVariety("Nicholas Sparsks","The Notbook",78);
		 novData=BookVariety.author+" - "+BookVariety.name;
		 novel.add(novData);
		 allBook.add(novData);
		 priceData=BookVariety.nums;
		 price.add(priceData);
		 return novel;
	}
public static void main(String[] args) {
	fantasticList();
	int a=allBook.size();
	System.out.println(allBook.size());
		for(int i=0;i<a;i++) {
			System.out.println(allBook.get(i));
		}
		

	}

  
    

}
