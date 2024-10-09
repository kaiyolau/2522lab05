public class Main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop();
        // Print all the titles
        bookshop.printTitles();

        // Remove titles containing "the"
        bookshop.removeTitlesContainingThe();

        // Print the sorted novels (no "the" in titles)
        bookshop.printSortedNovels();
    }
}
