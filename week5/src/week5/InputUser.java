package week5;
import java.util.*;
   
  
    class User{
          private int userId;
    private String name;
    private ArrayList<Integer> borrowedBooks;
    public User(int userId,String name){
        this.userId=userId;
        this.name=name;
        this.borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(int bookId){
        borrowedBooks.add(bookId);
    }
    public void returnBook(int bookId){
        if(!borrowedBooks.contains(bookId)){
            System.out.println("Book ID "+bookId+" was not borrowed.");
        } else {
            borrowedBooks.remove(Integer.valueOf(bookId));
            System.out.println("Book ID "+bookId+" returned successfully.");
        } }
    public void displayUser(){
        System.out.println("User ID: "+userId);
        System.out.println("Name: "+name);
        System.out.println("Borrowed Books: "+borrowedBooks);
    }
    }

        
public class InputUser {
    public static void main(String[] args) {
       
                User user = new User(1, "Alice");
        user.borrowBook(101);
        user.borrowBook(102);
        user.displayUser();
        user.returnBook(101);
        user.displayUser();
        user.returnBook(102);
        user.displayUser();
        user.returnBook(103); 
        user.displayUser();

}}