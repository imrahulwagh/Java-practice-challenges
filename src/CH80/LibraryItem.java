/*
80. Start with a base class LibraryItem that includes common
attributes like itemID, title, and author, and methods like
checkout() and returnItem(). Create subclasses such as Book,
Magazine, and DVD, each inheriting from LibraryItem. Add unique
attributes to each subclass, like ISBN for Book, issueNumber for
Magazine, and duration for DVD.
 */
package CH80;
public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Checkout");
    }

    void returnItem(){
        System.out.println("Return Item");
    }
}
