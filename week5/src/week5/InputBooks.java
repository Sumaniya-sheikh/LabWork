package week5;
import java.util.Scanner;

class Book{
  private int bookId;
  private  String title;
  private  String author;
  private  String genre;
  private boolean available;
    
   public Book (int bookId, String title, String author, String genre, boolean available){
    this.bookId= bookId;
    this.title = title;
    this.author = author;
    this.genre= genre;
    this.available = available;
}
            //getters
                public int getBookId(){
                return bookId;
            }
                public  String getTitle(){
                return  title;
            }
                public  String getAuthor(){
                return author;
            }
                public String getGenre(){
                return genre;
            }
                public boolean isAvailable(){
                return available;
            }

//            setters
               public void setBookId(int bookId){
                this.bookId= bookId;
            }
                public  void setTitle(String title){
                    this.title = title;
            }
                public  void setAuthor( String author){
                 this.author = author;
            }   
                public void setGenre(String genre){
                    this.genre= genre;
            }
                public void setAvailable(boolean available){
                    this.available = available;
            }
                
         void display(){
             System.out.println("Book ID =" + bookId );
             System.out.println("Book ID = " + title );
             System.out.println("Book ID = " + author);
             System.out.println("Genre = "+ genre );
             System.out.println("Available = " + available );
         }
}

    public class InputBooks{
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           
            System.out.print("Enter Book ID = ");
            int bookId = sc.nextInt();
            
            
            sc.nextLine();
            
            System.out.print("Enter Title of the Book = ");
            String title = sc.nextLine();


            System.out.print("Enter Authore Name= ");
            String author = sc.nextLine();
 
            System.out.print("Enter Genre = ");
            String genre = sc.nextLine();

            System.out.print("Is Available (true or false) = ");
            boolean available = sc.nextBoolean();

            Book obj = new Book(bookId, title, author, genre, available);
            obj.display();
        }

    }
