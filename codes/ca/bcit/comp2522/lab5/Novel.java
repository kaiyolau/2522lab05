package ca.bcit.comp2522.lab5;

public class Novel
{

    private String title;
    private String authorName;
    private int yearPublished;


    public Novel(String title, String authorName, int yearPublished)
    {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }


    public String getTitle()
    {
        return title;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }


    @Override
    public String toString()
    {
        return title + " by " + authorName + " (" + yearPublished + ")";
    }
}