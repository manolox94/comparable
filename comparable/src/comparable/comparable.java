package comparable;


import java.io.*;
import java.util.*;

public class comparable {
	
	public static void main(String[] args) {
		compararPare();
    }
	
	
	public static void comparar() {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015, 300.00));
        list.add(new Movie("Star Wars", 8.7, 1977, 500.00));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980, 900.00));
        list.add(new Movie("Return of the Jedi", 8.4, 1983, 800.00));
        
        System.out.println(list.get(0));
 
        MoneyCompare moneyCompare = new MoneyCompare();

        Collections.sort(list, moneyCompare);
        
        
 
        System.out.println("Movies after sorting by money : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear() + " " +
                               movie.getMoney());
        }	
	}

	
	public static void comparabl() {

        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015, 0));
        list.add(new Movie("Star Wars", 8.7, 1977, 0));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980, 0));
        list.add(new Movie("Return of the Jedi", 8.4, 1983, 0));
        
        System.out.println(list.get(0));
 
        Collections.sort(list);
        
        
 
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }	
	}
	
	public static void comparato() {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015, 0));
		list.add(new Movie("Star Wars", 8.7, 1977, 0));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980, 0));
		list.add(new Movie("Return of the Jedi", 8.4, 1983, 0));

		// Sort by rating : (1) Create an object of ratingCompare
		//                  (2) Call Collections.sort
		//                  (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();

		Collections.sort(list, ratingCompare);
		for (Movie movie: list)
			System.out.println(movie.getRating() + " " +
					movie.getName() + " " +
					movie.getYear());


		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie: list)
			System.out.println(movie.getName() + " " +
					movie.getRating() + " " +
					movie.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movie movie: list)
			System.out.println(movie.getYear() + " " +
					movie.getRating() + " " +
					movie.getName()+" ");
	}
	
	public static void compararPare() {
        int n = 4;
        Pair arr[] = new Pair[n];
 
        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);
 
        // Sorting the array
        Arrays.sort(arr);
 
        // printing the
        // Pair array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
	}

}
