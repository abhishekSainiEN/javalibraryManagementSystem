package .vscode.java project;

import java.util.Scanner;
 
class publicLibrary{
    String books[];
    int no_of_books;
    
    publicLibrary(){
         this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
    no_of_books++;
    System.out.println(book+" ::has been added in library");
    }
    void showAvailableBook(){
        System.out.println("* available book *");
        for(String book:this.books){
            if(book==null){
                continue;
                }
                
                System.out.println("* :"+book);
                }
    }
                void issusedBook(String book){
                    
                        for(int i=0;i<this.books.length;i++){
                            if(this.books[i].equals(book)){
     System.out.println("this book has been issused");                      
                                    this.books[i]=null;
                                    return;
                                    }
            }
                                    }
                                    void returnBook(String book){
                        System.out.println("book has been returned by borrower");               addBook(book);
                                        }
                                                                        
}
 
public class Main {
    public static void main(String[] args) {
        
System.out.println("     ** welcome in ApniLibraray📖  **  "+"\n\n\n\n");     
        
        
        
    publicLibrary c=new publicLibrary();
System.out.println("*************************************");
    System.out.println("1 use for addBook");
    System.out.println("2 use for issusedBook");
    
    System.out.println("3 use for showAvailableBook");
    
    System.out.println("4 use for returnBook");
    
System.out.println("*************************************");    
    
    Scanner sc=new Scanner(System.in);
    while(true){
System.out.println("select option for do work");     
System.out.println("*************************************");
   int choice=sc.nextInt();
   
    switch(choice){
case 1:
System.out.println("please addBook");
Scanner a=new Scanner(System.in);
System.out.println("give book name that you want to add");
String add=a.nextLine();
 
c.addBook(add);
System.out.println("*************************************");
break;
case 2:
System.out.println("issusedBook");
 
Scanner b=new Scanner(System.in);
System.out.println("give name of that book you want to give");
String d=b.nextLine();
c.issusedBook(d);
System.out.println("*************************************");
break;
case 3:
c.showAvailableBook();
System.out.println("*************************************");
break;
case 4:
System.out.println("return book section");
Scanner l=new Scanner(System.in);
System.out.println("give name of that book you want to return:");
String r=l.nextLine();
c.returnBook(r);
System.out.println("*************************************");
break;
default:
System.out.println("nothing");
 
 
 
    }
 
 
    }
 
 
 
    }
}