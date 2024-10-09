package ca.bcit.comp2522.lab5;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * The {@code Bookshop} class manages a collection of novels.
 * It stores the novels in a map, where the key is the title of the novel and
 * the value is a {@link Novel} object containing information about the novel.
 * This class provides methods to:
 * <ul>
 *   <li>Print all the titles of the novels</li>
 *   <li>Remove novels whose titles contain the word "the" (case-insensitive)</li>
 *   <li>Print the novels in sorted order based on their titles</li>
 * </ul>
 *
 * @author Yuho Lim
 * @author Daniil Yarygin
 * @author Kyle Lau
 * @author Gem Baojimin Sha
 * @version 1.0
 */
class BookShop
{
    private final Map<String, Novel> novelsMap;

    /**
     * Constructor for the {@code Bookshop} class.
     * It initializes a {@link HashMap} of novels, each keyed by the novel's title.
     */
    public BookShop()
    {
        novelsMap = new HashMap<>();

        // Adding sample novels to the map
        novelsMap.put("The Great Gatsby", new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1800));
        novelsMap.put("To Kill a Mockingbird", new Novel("To Kill a Mockingbird", "Harper Lee", 2001));
        novelsMap.put("Moby Dick", new Novel("Moby Dick", "Herman Melville", 1635));
        novelsMap.put("1984", new Novel("1984", "George Orwell", 1328));
        novelsMap.put("The Catcher in the Rye", new Novel("The Catcher in the Rye", "J.D. Salinger", 2007));
    }

    /**
     * Prints the titles of all the novels in the collection.
     * It uses an iterator to loop through the keys (titles) of the novels in the {@code novelsMap}.
     */
    public void printTitles()
    {
        Set<String> keySet = novelsMap.keySet();
        Iterator<String> iterator = keySet.iterator();

        System.out.println("All novel titles:");
        while(iterator.hasNext())
        {
            String title = iterator.next();
            System.out.println(title);
        }
    }

    /**
     * Removes all novels from the collection whose title contains the word "the" (case-insensitive).
     * It iterates through the map using an iterator and removes the novels directly from the map.
     */
    public void removeTitlesContainingThe()
    {
        Iterator<Map.Entry<String, Novel>> iterator = novelsMap.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, Novel> entry = iterator.next();
            if(entry.getKey().toLowerCase().contains("the"))
            {
                iterator.remove();  // Remove the novel if "the" is in the title
            }
        }
    }

    /**
     * Prints the novels in sorted order by their titles.
     * <p>
     * After removing the titles containing "the" using the method.
     * this method gets the remaining keys from the {@code novelsMap}, converts them into a {@link List},
     * sorts them, and prints the corresponding novel details in sorted order.
     * </p>
     */
    public void printSortedNovels()
    {
        // Step 1: Get the keys from the map
        Set<String> keySet = novelsMap.keySet();

        // Step 2: Convert the keys to a List to allow sorting
        List<String> keyList = new ArrayList<>(keySet);

        // Step 3: Sort the List
        Collections.sort(keyList);

        // Print the sorted novels
        System.out.println("\nNovels in sorted order (after removing titles containing 'the'):");
        for(String key : keyList)
        {
            System.out.println(novelsMap.get(key).toString());
        }
    }
}
