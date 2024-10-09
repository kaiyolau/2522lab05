package ca.bcit.comp2522.lab5;

/**
 * Represents a novel with a title, author name, and year of publication.
 * This class is immutable, meaning its state cannot be changed after creation.
 *
 * @author Yuho Lim
 * @author Daniil Yarygin
 * @author Kyle Lau
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class Novel
{

    private final String title;
    private final String authorName;
    private final int    yearPublished;

    /**
     * Constructs a new Novel with the specified title, author name, and publication year.
     *
     * @param title         The title of the novel.
     * @param authorName    The name of the novel's author.
     * @param yearPublished The year the novel was published.
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the novel.
     *
     * @return The title of the novel.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the name of the novel's author.
     *
     * @return The name of the novel's author.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the year the novel was published.
     *
     * @return The year of publication.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Returns a string representation of the novel.
     *
     * @return A string in the format "title by author (year)".
     */
    @Override
    public String toString()
    {
        return title + " by " + authorName + " (" + yearPublished + ")";
    }
}