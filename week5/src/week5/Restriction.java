package week5;

public class Restriction {

    public static void main(String[] args) {

        Book book = new Book(
                1,
                "Java Basics",
                "John Doe",
                "Programming",
                true
        );

        // ❌ Direct access → Compilation Error
//         book.bookId = 10;

        // ✅ Access via getter
        System.out.println(book.getBookId());
        System.out.println(book.getTitle());
    }
}