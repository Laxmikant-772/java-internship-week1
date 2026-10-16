package miniproject2;


import java.util.ArrayList;
import java.util.List;

// Abstraction: common features of a library user
abstract class User {
    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public abstract void displayRole();
}

// Inheritance: StudentUser inherits from User
class StudentUser extends User {
    public StudentUser(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}

// Encapsulation: book data is private
class Book {
    private int bookId;
    private String title;
    private boolean available;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void borrowBook(int bookId, User user) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println(user.getName()
                            + " borrowed: " + book.getTitle());
                } else {
                    System.out.println("Book is not available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned: "
                            + book.getTitle());
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        for (Book book : books) {
            String status = book.isAvailable()
                    ? "Available" : "Borrowed";

            System.out.println(
                    book.getBookId() + " - "
                    + book.getTitle() + " - " + status);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        StudentUser user = new StudentUser("Laxmikant", 101);

        user.displayRole();

        library.addBook(new Book(1, "Java Programming"));
        library.addBook(new Book(2, "Python Basics"));

        library.displayBooks();

        library.borrowBook(1, user);
        library.displayBooks();

        library.returnBook(1);
        library.displayBooks();
    }
}

    

