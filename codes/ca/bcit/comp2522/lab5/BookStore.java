package ca.bcit.comp2522.lab5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The BookStore class represents a bookstore that contains a list of novels.
 * It provides methods to perform various operations related to the novels in the store,
 * such as retrieving the name of the bookstore, counting books that contain specific words,
 * calculating the percentage of books written in a certain year range, and more.
 */
public class BookStore
{
    private static final int MIN_YEAR = 0;
    private static final int MAX_YEAR = 9999;
    private static final int MIN_TITLE_Length = 0;
    private static final int MAX_TITLE_Length = 9999;
    private static final int PERCENTAGE_FIXER = 100;
    private final List<Novel> novelList;
    private String bookStoreName;

    /**
     * Constructs a new BookStore with the specified name and list of novels.
     *
     * @param bookStoreName The name of the bookstore.
     * @param novels        The list of novels to be added to the bookstore.
     */
    BookStore(final String bookStoreName,
              final List<Novel> novels)
    {
        this.novelList = new ArrayList<>();

        novelList.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novelList.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        novelList.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novelList.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novelList.add(new Novel("Animal Farm", "George Orwell", 1946));
        novelList.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novelList.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novelList.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novelList.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novelList.add(new Novel("Atonement", "Ian McEwan", 2002));
        novelList.add(new Novel("Beloved", "Toni Morrison", 1987));
        novelList.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novelList.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novelList.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novelList.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novelList.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novelList.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novelList.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novelList.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novelList.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novelList.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novelList.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novelList.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novelList.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novelList.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novelList.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novelList.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novelList.add(new Novel("A Death in the Family", "James Agee", 1958));
        novelList.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novelList.add(new Novel("Deliverance", "James Dickey", 1970));
        novelList.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novelList.add(new Novel("Falconer", "John Cheever", 1977));
        novelList.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novelList.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novelList.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novelList.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novelList.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novelList.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novelList.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novelList.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novelList.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novelList.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novelList.add(new Novel("Herzog", "Saul Bellow", 1964));
        novelList.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novelList.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novelList.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novelList.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novelList.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novelList.add(new Novel("Light in August", "William Faulkner", 1932));
        novelList.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novelList.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novelList.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novelList.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novelList.add(new Novel("Loving", "Henry Green", 1945));
        novelList.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novelList.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novelList.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novelList.add(new Novel("Money", "Martin Amis", 1984));
        novelList.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novelList.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novelList.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novelList.add(new Novel("Native Son", "Richard Wright", 1940));
        novelList.add(new Novel("Neuromancer", "William Gibson", 1984));
        novelList.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novelList.add(new Novel("1984", "George Orwell", 1948));
        novelList.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novelList.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novelList.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novelList.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novelList.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novelList.add(new Novel("Play It As It Lays", "Joan Didion", 1970));
        novelList.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novelList.add(new Novel("Possession", "A.S. Byatt", 1990));
        novelList.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novelList.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novelList.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novelList.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novelList.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novelList.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novelList.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novelList.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novelList.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novelList.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novelList.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novelList.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novelList.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novelList.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novelList.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novelList.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novelList.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novelList.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novelList.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novelList.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novelList.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novelList.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novelList.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novelList.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novelList.add(new Novel("White Noise", "Don DeLillo", 1985));
        novelList.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novelList.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }

    /**
     * Gets the name of the bookstore.
     *
     * @return The name of the bookstore.
     */
    public String getBookStoreName()
    {
        return bookStoreName;
    }

    /**
     * Sets the name of the bookstore.
     *
     * @param bookStoreName The name to set for the bookstore.
     */
    public void setBookStoreName(final String bookStoreName)
    {
        this.bookStoreName = bookStoreName;
    }

    /**
     * Checks if there is a novel in the list that was written in the specified year.
     *
     * This method iterates through the list of novels and checks if any novel's
     * publication year matches the given year. If a match is found, it returns true
     * immediately; otherwise, it returns false after checking all novels.
     *
     * @param year The year to check if a book was written.
     * @return {@code true} if a novel was written in the specified year;
     *         {@code false} otherwise.
     * @throws IllegalArgumentException if the specified year is invalid.
     */
    public boolean isThereABookWrittenBetween(final int year)
    {
        validateYear(year);

        for (Novel novel : novelList)
        {
            int selectedBook;
            selectedBook = novel.getYearPublished();

            if (selectedBook == year)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts how many books in the bookstore's list contain the specified word in their title.
     *
     * @param word The word to search for in book titles.
     * @return The number of books that contain the specified word in their title.
     * @throws IllegalArgumentException If the word is null or empty.
     */
    public int howManyBooksContain(final String word)
    {
        validateWord(word);

        int wordCount;
        wordCount = 0;

        if (novelList != null)
        {
            final Iterator<Novel> it;
            it = novelList.iterator();

            while (it.hasNext())
            {
                final Novel novels;
                novels = it.next();

                String novelsTitle;
                novelsTitle = novels.getTitle().toLowerCase();

                if(novelsTitle.contains(word.toLowerCase()))
                {
                    wordCount++;
                }
            }
        }
        return wordCount;
    }

    /**
     * Calculates the percentage of books written between the specified years.
     *
     * @param first The starting year of the range.
     * @param last  The ending year of the range.
     * @return The percentage of books written between the specified years.
     * @throws IllegalArgumentException If the year range is invalid.
     */
    public int whichPercentWrittenBetween (final int first,
                                           final int last)
    {
        validateTwoYears(first, last);

        int totalNumOfBooks;
        int selectedNumOfBooks;
        int percentageOfSelectedBooks;

        totalNumOfBooks = novelList.size();
        selectedNumOfBooks = 0;
        percentageOfSelectedBooks = 0;

        if(novelList != null && !novelList.isEmpty())
        {
            final Iterator<Novel> it;
            it = novelList.iterator();

            while (it.hasNext())
            {
                final Novel selectednovel;
                int selectedYear;

                selectednovel = it.next();
                selectedYear = selectednovel.getYearPublished();

                if (first <= selectedYear && last >= selectedYear)
                {
                    selectedNumOfBooks ++;
                }
            }
            percentageOfSelectedBooks = (selectedNumOfBooks * PERCENTAGE_FIXER) / totalNumOfBooks;
        }
        return percentageOfSelectedBooks;
    }

    /**
     * Retrieves the oldest book in the bookstore's list.
     *
     * @return The title and author of the oldest book in the list, or null if the list is empty.
     */
    public String getOldestBook()
    {

        if (novelList == null || novelList.isEmpty())
        {
            return null;
        }

        Novel oldestBook;
        oldestBook = novelList.getFirst();

        for (final Novel novel : novelList)
        {
            if (novel.getYearPublished() < oldestBook.getYearPublished())
            {
                oldestBook = novel;
            }
        }
        return oldestBook.toString();
    }

    /**
     * Retrieves the books in the bookstore that have titles of the specified length.
     *
     * @param titleLength The desired length of the book titles.
     * @return A list of books with the specified title length.
     * @throws IllegalArgumentException If the title length is out of bounds.
     */
    public String getBooksThisLength(final int titleLength)
    {
        validateTitleLength(titleLength);

        if (novelList == null || novelList.isEmpty())
        {
            return null;
        }

        List<Novel> sameLengthTitle = new ArrayList<>();

        for (final Novel novel : novelList)
        {
            int selectedBookLength;
            selectedBookLength = novel.getTitle().length();

            if (selectedBookLength == titleLength)
            {
                sameLengthTitle.add(novel);
            }
        }
        return sameLengthTitle.toString();
    }

    private void validateYear(final int year)
    {
        if (year < MIN_YEAR || year > MAX_YEAR)
        {

            throw new IllegalArgumentException("Year needs to be between " +
                    MIN_YEAR + " and " + MAX_YEAR);

        }
    }
    /**
     * Validates that the provided word is not null or empty.
     *
     * @param word The word to validate.
     * @throws IllegalArgumentException If the word is null or empty.
     */
    private void validateWord(final String word)
    {
        if(word == null || word.isEmpty())
        {

            throw new IllegalArgumentException("Word needs to be provided");

        }
    }

    /**
     * Validates the specified year range.
     *
     * @param first The starting year of the range.
     * @param last  The ending year of the range.
     * @throws IllegalArgumentException If the years are out of bounds.
     */
    private void validateTwoYears(final int first,
                              final int last)
    {
        if (first < MIN_YEAR || first > MAX_YEAR)
        {

            throw new IllegalArgumentException("Year needs to be between " +
                    MIN_YEAR + " and " + MAX_YEAR);

        }

        if (last < MIN_YEAR || last > MAX_YEAR)
        {

            throw new IllegalArgumentException("Year needs to be between " +
                    MIN_YEAR + " and " + MAX_YEAR);

        }
    }

    /**
     * Validates that the specified title length is within the allowed range.
     *
     * @param titleLength The length of the title to validate.
     * @throws IllegalArgumentException If the title length is out of bounds.
     */
    private void validateTitleLength(final int titleLength)
    {
        if(titleLength < MIN_TITLE_Length || titleLength > MAX_TITLE_Length)
        {
            throw new IllegalArgumentException("Title length needs to be between " +
                    MAX_TITLE_Length + " and " + MAX_TITLE_Length);

        }
    }

    /**
     * The main method serves as the entry point for the BookStore program.
     * It demonstrates the usage of various methods in the BookStore class
     * by creating a BookStore instance and calling its methods to display
     * information about the books in the store.
     *
     * The program performs the following tasks:
     * <ul>
     *   <li>Checks if there is a book written in a specific year.</li>
     *   <li>Counts how many books contain a specific word in their titles.</li>
     *   <li>Calculates the percentage of books written between two given years.</li>
     *   <li>Finds the oldest book in the store.</li>
     *   <li>Retrieves books that have a specific length in their titles.</li>
     * </ul>
     *
     * It then prints the results of these operations to the console in a human-readable format.
     */
    public static void main(final String[] args)
    {
        boolean bookWrittenBetween;
        int wordCount;
        int percentage;
        String oldestBook;
        String getBooksThisLength;

        List<Novel> novelList = new ArrayList<>();
        BookStore myBookStore = new BookStore("Animal Crossing", novelList);

        bookWrittenBetween = myBookStore.isThereABookWrittenBetween(1980);
        wordCount = myBookStore.howManyBooksContain("white");
        percentage = myBookStore.whichPercentWrittenBetween(1510, 1980);
        oldestBook = myBookStore.getOldestBook();
        getBooksThisLength = myBookStore.getBooksThisLength(8);

        System.out.println("Does book exist in 1980? " + (bookWrittenBetween ? "Yes" : "No"));
        System.out.println("The number of book which contains word \"white\": " + wordCount);
        System.out.println("Percentage of books written between 1510 and 1980: " + percentage + "%");
        System.out.println("The older Book in the store: " + oldestBook);
        System.out.println("The books that have length of 8: " + getBooksThisLength);
    }
}

