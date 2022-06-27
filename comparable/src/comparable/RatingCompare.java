package comparable;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{
	
    public int compare(Movie m1, Movie m2)
    {
        if (m2.getRating() < m1.getRating()) return -1;
        if (m2.getRating() > m1.getRating()) return 1;
        else return 0;
    }
}
