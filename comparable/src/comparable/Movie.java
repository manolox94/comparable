package comparable;
import java.io.*;
import java.util.*;

class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
    private double money;
    
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public Movie(String nm, double rt, int yr, double money)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
        this.money= money;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
   public double getMoney() { return money; }
}
   
