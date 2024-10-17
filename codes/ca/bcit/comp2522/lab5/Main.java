package ca.bcit.comp2522.lab5;

/**
 * Main class for the BookShop application.
 * This class demonstrates the usage of the BookShop class and its methods.
 *
 * @author Kyle Lau
 * @author Yuho Lim
 * @author Daniil Yarygin
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class Main
{
    /**
     * The main method that serves as the entry point for the application.
     * It creates a BookShop instance and performs various operations on it.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(final String[] args)
    {
        final BookShop bookshop;
        bookshop = new BookShop();

        System.out.println("All titles in the bookshop:");
        bookshop.printTitles();

        System.out.println("\nRemoving titles containing 'the'...");
        bookshop.removeTitlesContainingThe();

        System.out.println("\nSorted novels (excluding titles with 'the'):");
        bookshop.printSortedNovels();
    }
}