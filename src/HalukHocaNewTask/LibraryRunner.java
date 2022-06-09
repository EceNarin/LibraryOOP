package HalukHocaNewTask;

import java.awt.print.Book;
import java.util.Scanner;

public class LibraryRunner {
 static Scanner scan=new Scanner(System.in);
 static int hesap=0;
	public static void main(String[] args) throws InterruptedException {
	         BookVariety book=new BookVariety();
	         LibraryDataBase dBase=new LibraryDataBase();
	         System.out.println("HAS KAPİTAL Online kitapciya Hos Geldiniz");
	         System.out.println("Kitap bagisinda bulunmak icin 1\nOnline magazimizi gezmek icin 2'yi tuslayiniz ");
	         switch (scan.nextInt()) {
	         case 1:
	        	 dBase.addBook();
	        	 System.out.println("HAS KAPİTAL ilesi adina bagisiniz icin minnetlerimizi sunariz");
	        	 break;
	         case 2:
	        	 while(true) {
		        	 System.out.println("Kitap kategorileri");
		        	 book.categories();
		        	 System.out.println("kategoriye gore kitaplarinizi seciniz");
		        	 book.categoricList(scan.nextInt());
		        	 System.out.println("Satin almak icin 1 \nAna menuye icin 2 \nCikmak icin 3'u tuslayiniz");
		        	 int a=scan.nextInt();
		        	 if(a==2) {
		        		 continue;
		        	 }else if(a==3) {
		        		 break;
		        	 }else if(a==1) {
		        		 System.out.println("Satin alacaginiz kitabin kitap numarasini girerek seciniz");
			        	 int x=scan.nextInt();
			        	 book.buyBook(x);
			        	 hesap+=book.getPrice(x);
			        	 System.out.println("Guncel liste yukleniyor");
			        	 Thread.sleep(3000);
			        	 book.Remove(x);
			        	 book.BookList();
			        	 System.out.println("devam etmek icin 1 \nCikmak icin 9'u tuslayin");
			        	 int y=scan.nextInt();
			        	 if(y==1) {
			        		 continue;
			        	 }else if(y==9) {
			        		 System.out.println("Iyi gunler ");
			        	 }else {
			        		 System.out.println("gecersiz tuslama yaptınız. Sizi ana menuye aktariyprum");
			        		 continue;
			        	 }
			        	 break;
		        	 }
		        
		         }
	         }
	         

	}

}
