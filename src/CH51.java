/* 51. Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the library. */

class Book {
    static int totalNoOfBooks;
    String title, author, isbn ;
    boolean isBorrowed;

    // Static block
    static {
        totalNoOfBooks = 0;
    }

    // Initialization block
    {
        totalNoOfBooks++;
    }

    Book(String isbn,String title,String author) {
        this.isbn = isbn ;
        this.title = title ;
        this.author = author ;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int getTotalBooks(){
        return totalNoOfBooks;
    }

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            isBorrowed = true;
            System.out.println("Enjoy your book");
        }
    }
    public void returnBook(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("Hope you enjoyed the book \nPlease leave the review");
        }
        else{
            System.out.println("The book is already in the library");
        }
    }

    public static void main(String[] args) {
        System.out.println("No. of books in the library : "+getTotalBooks());
        Book java = new Book("123","java","James Gangling");
        java.borrowBook();
        java.borrowBook();
        System.out.println("No. of books in the library : "+getTotalBooks());
        Book python = new Book("124");
    }
}
