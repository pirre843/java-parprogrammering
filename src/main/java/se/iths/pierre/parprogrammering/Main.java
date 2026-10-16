package se.iths.pierre.parprogrammering;

public class Main {
    static void main() {

        String libraryName = "pierre bibliotek";
        int bookCount = 12;
        Boolean isOpen = true;
        IO.println(libraryName + "\n" + bookCount + "\n" + isOpen);
        libraryName = "pierre och felix bibliotek";
        IO.println(libraryName + "\n" + bookCount + "\n" + isOpen);

        int borrowedBookCount = 8;
        int availableBookCount = bookCount - borrowedBookCount;

        IO.println("Available book count is: " + availableBookCount);


    }
}
