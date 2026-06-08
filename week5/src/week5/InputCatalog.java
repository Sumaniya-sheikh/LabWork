package week5;
import java.util.*;

// -------- Book Class --------
class Book {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;

    Book(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    public String toString() {
        return "Book ID: " + bookId +
               ", Title: " + title +
               ", Author: " + author +
               ", Genre: " + genre +
               ", Available: " + available;
    }
}

// -------- User Class --------
class User {
    int userId;
    String name;
    ArrayList<Integer> borrowedBooks = new ArrayList<>();

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void borrowBook(Book book) {
        if (book.available) {
            book.available = false;
            borrowedBooks.add(book.bookId);
        } else {
            System.out.println("Book not available.");
        }
    }

    void returnBook(Book book) {
        if (borrowedBooks.contains(book.bookId)) {
            book.available = true;
            borrowedBooks.remove(Integer.valueOf(book.bookId));
        }
    }

    void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

// -------- Main Class --------
public class InputCatalog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> catalog = new ArrayList<>();

        // Add one book
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        System.out.print("Available (true/false): ");
        boolean available = sc.nextBoolean();

        Book book = new Book(bookId, title, author, genre, available);
        catalog.add(book);

        // Create user
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        User user = new User(userId, name);

        // Borrow
        System.out.print("Enter Book ID to Borrow: ");
        int borrowId = sc.nextInt();

        if (book.bookId == borrowId) {
            user.borrowBook(book);
        }

        // Display status
        System.out.println("\nCatalog: " + catalog);
        user.displayUser();

        // Return
        System.out.print("Enter Book ID to Return: ");
        int returnId = sc.nextInt();

        if (book.bookId == returnId) {
            user.returnBook(book);
        }

        System.out.println("\nCatalog After Return: " + catalog);

        sc.close();
    }
}