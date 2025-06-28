import java.util.ArrayList;

class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added.");
    }

    public void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    public void issueBook(String book) {
        if (books.contains(book)) {
            System.out.println(book + " issued.");
            books.remove(book);
        } else {
            System.out.println(book + " not available.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.displayBooks();
        lib.issueBook("Java Programming");
        lib.removeBook("Data Structures");
        lib.displayBooks();
    }
}