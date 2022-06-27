package comparable;

import java.util.Comparator;


public class MoneyCompare implements Comparator<Movie>{
	
    public int compare(Movie m1, Movie m2)
    {
        if (m2.getMoney() < m1.getMoney()) return -1;
        if (m2.getMoney() > m1.getMoney()) return 1;
        else return 0;
    }
}
