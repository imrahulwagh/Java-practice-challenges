class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;

    boolean isBorrowed;
    static {
        totalBooks = 0;
    }
    { // Object Init
        totalBooks++;
    }

    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if(isBorrowed){
            System.out.println("Book has already borrowed");
        } else{
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }

    void returnBook() {
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book.\nPlease leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }


    public static void main(String[] args) {
        Book IOT = new Book("1","Internet of Things","Ramanujan");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        IOT.borrowBook();
        myBook.borrowBook();
        IOT.borrowBook();
        IOT.returnBook();
        IOT.returnBook();
    }
}
