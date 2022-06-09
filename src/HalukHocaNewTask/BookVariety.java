package HalukHocaNewTask;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BookVariety extends LibraryDataBase{
	
    static LibraryDataBase dataBase=new  LibraryDataBase();
	static String author;
	static String name;
    static int nums;
   public  BookVariety(int nums) {
	   this.nums=nums;
   }
    
public BookVariety(String author, String name, int nums) {
	 this.author=author;
	   this.name=name;
	   this.nums=nums;;
}
    public BookVariety() {
	// TODO Auto-generated constructor stub
}
        public void categories() {
        	String [] arr= {"POLITICAL","MYSTERY","CLASSİCAL","ACTİON AND ADVENTURES","FANTASTİC","HORROR","NOVEL","TUM KATEGORİLER"};
        	for(int i=0;i<arr.length;i++) {
        		System.out.println(i+1 +"\t"+ arr[i]);
        		
        	}
        }
	public static void priceList() {
			int b=dataBase.price.size();
			for(int i=0;i<b;i++) {
				System.out.println(i+1001 +"-" + dataBase.price.get(i) +" tl");
			}
			
		}
	public static void categoricList(int x){
		switch(x) {
		case 1:
			int a=dataBase.politicalList().size();
			for(int i=0;i<a;i++) {
				System.out.println(i+1001+ "-" + dataBase.politicalList().get(i));
			}
			break;
		case 2:
				System.out.println(1002+"-"+dataBase.mysteryList().get(0));
				break;
		case 3:
			int b=dataBase.classicsList().size();
			for(int i=0;i<b;i++) {
				System.out.println(i+1003+"-"+dataBase.classicsList().get(i));
			}
			break;
		case 4:
			int c=dataBase.actionAdventureList().size();
			for(int i=0;i<c;i++) {
				System.out.println(i+1009+ "-"+dataBase.actionAdventureList().get(i));
			}
             break;
		case 5:
			int d=dataBase.fantasticList().size();
			for(int i=0;i<d;i++) {
				System.out.println(i+1013+"-"+dataBase.fantasticList().get(i));
			}
			break;
		case 6:
			int e=dataBase.horrorList().size();
			for(int i=0;i<e;i++) {
				System.out.println(i+1015+"-"+dataBase.horrorList().get(i));
			}
			break;
		case 7:
			System.out.println(1014+"-"+dataBase.novelList());
			break;
		case 8:
			BookList();
			break;
			default:
				System.out.println("gecersiz secim");
		}
	}
    public static int getPrice(int x) {
    	int a=x-1001;
    	return dataBase.price.get(a);
    }
    public static void Remove(int x){
    	int a=x-1001;
    	dataBase.allBook.remove(a);
    
    }
   
   	public static void BookList() {
 			dataBase.politicalList();
 			dataBase.mysteryList();
 			dataBase.classicsList();
 			dataBase.actionAdventureList();
 			dataBase.fantasticList();
 			dataBase.novelList();
 			dataBase.horrorList();
 			int a=dataBase.allBook.size();
 			for(int i=0;i<18;i++) {
 				System.out.println(i+1001 +"-" + dataBase.allBook.get(i));
 			}
 		}
 public static void buyBook(int x) {
	   int a=x-1001;
    	dataBase.allBook.get(a);
    	System.out.println(dataBase.allBook.get(a) +" kitabi sepetinize ekledi, stoktaki son "+ dataBase.allBook.get(a)+" kitabini aldiniz. \nGuncel liste yüklenecektir.Hesap tutariniz:  "+dataBase.price.get(a) +" tl'dir");
    	
	 //System.out.println( dataBase.allBook.get(0));
	 //dataBase.allBook.get(0);

    }
 		/*public static void main(String[] args) {
 			BookList();
 		   Remove(1015);
           
     
 		}*/

	
}
