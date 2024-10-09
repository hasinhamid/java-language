package Library;

public class Main {
    public static void main(String[] args) {
        // Creating StoryBook Objects
        StoryBook sb1 = new StoryBook("111", "Harry Potter", "J.K. Rowling", 29.99, 10, "Fantasy");
        StoryBook sb2 = new StoryBook("112", "Lord of the Rings", "J.R.R. Tolkien", 39.99, 5, "Fantasy");
        StoryBook sb3 = new StoryBook("113", "The Hobbit", "J.R.R. Tolkien", 19.99, 15, "Fantasy");
        StoryBook sb4 = new StoryBook("114", "Alice in Wonderland", "Lewis Carroll", 25.99, 8, "Children");
        StoryBook sb5 = new StoryBook("115", "Chronicles of Narnia", "C.S. Lewis", 22.99, 12, "Fantasy");

        // Creating TextBook Objects
        TextBook tb1 = new TextBook("211", "Mathematics", "John Doe", 49.99, 20, 10);
        TextBook tb2 = new TextBook("212", "Physics", "Albert Einstein", 59.99, 18, 12);
        TextBook tb3 = new TextBook("213", "Chemistry", "Marie Curie", 55.99, 12, 11);
        TextBook tb4 = new TextBook("214", "Biology", "Charles Darwin", 45.99, 22, 9);
        TextBook tb5 = new TextBook("215", "History", "Howard Zinn", 35.99, 25, 11);

        // Creating BookShop Object
        BookShop bookShop = new BookShop("AIUB Bookshop");

        // Inserting StoryBooks into BookShop
        bookShop.insertBook(sb1);
        bookShop.insertBook(sb2);
        bookShop.insertBook(sb3);
        bookShop.insertBook(sb4);
        bookShop.insertBook(sb5);

        // Inserting TextBooks into BookShop
        bookShop.insertBook(tb1);
        bookShop.insertBook(tb2);
        bookShop.insertBook(tb3);
        bookShop.insertBook(tb4);
        bookShop.insertBook(tb5);

        // Showing all books in BookShop
        bookShop.showAllBooks();

        // Searching for a book by ISBN
        Book searchResult = bookShop.searchBook("113");
        if (searchResult != null) {
            System.out.println("Book Found:");
            searchResult.showDetails();
        } else {
            System.out.println("Book not found.");
        }
    }
}

