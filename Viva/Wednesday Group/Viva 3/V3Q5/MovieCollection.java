/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q5;

/**
 *
 * @author tianlongc
 */
public class MovieCollection {
    private Movie[] movieCollection;
    private int numMovie;
    
    public MovieCollection(){
        this.movieCollection = new Movie[100];
    }
    
    public boolean isEmpty(){
        return numMovie == 0;
    }
    
    public void addMovie(Movie movie){
        if (numMovie < movieCollection.length) {
            movieCollection[numMovie] = movie;
            numMovie++;
        }else{
            System.out.println("The movie collection is full! Can not add more movies.");
        }
    }
    
    public void removeMovie(String title){
        boolean found = false;
        
        for (int i = 0; i < numMovie; i++) {
            if (movieCollection[i].getTitle().equalsIgnoreCase(title)) {
                // Shift all subsequent movies to the left
                for (int j = i; j < numMovie-1; j++) {
                    movieCollection[j] = movieCollection[j+1];
                }
                // Clear the last element to avoid duplication
                movieCollection[numMovie-1] = null;
                numMovie--;
                found = true;
                System.out.println("Removed movie: " + title);
                break; // Exit the loop once the movie is found and removed
            }
        }
        
        if (!found) {
            System.out.println("Movie '" + title + "' not found.");
        }
    }
    
    public void findmovieCollectionByDirector(String director){
        boolean found = false;
        
        System.out.println("Movies directed by '" + director + "':");
        for (int i = 0; i < numMovie; i++) {
            if (movieCollection[i].getDirector().equalsIgnoreCase(director)) {
                System.out.println(movieCollection[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No movies found directed by '" + director + "'.");
        }
    }
    
    public void findmovieCollectionByTitle(String title){
        boolean found = false;
        
        System.out.println("Movie '" + title + "' found:");
        for (int i = 0; i < numMovie; i++) {
            if (movieCollection[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(movieCollection[i]);
                found = true;
                break; // found a movie only
            }
        }
        
        if (!found) {
            System.out.println("Movie '" + title + "' not found in the collection.");
        }
    }
    
    public void findmovieCollectionByReleaseYearRange(int startYear, int endYear){
        boolean found = false;
        
        for (int i = 0; i < numMovie; i++) {
            if ((movieCollection[i].getYear() >= startYear) && (movieCollection[i].getYear() <= endYear)) {
                System.out.println(movieCollection[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No movies found released between " + startYear + " and " + endYear + ".");
        }
    }
    
    public void sortmovieCollectionByReleaseYear(){
        for (int i = 0; i < numMovie; i++) {
            for (int j = 0; j < numMovie-i-1; j++) {
                if (movieCollection[j].getYear() >= movieCollection[j+1].getYear()) {
                    Movie temp = movieCollection[j];
                    movieCollection[j] = movieCollection[j+1];
                    movieCollection[j+1] = temp;
                }
            }
        }
    }
    
    public void displayCollection(){
        if (isEmpty()) {
            System.out.println("The movie collection is empty!");
        }else{
            for (int i = 0; i < numMovie; i++) {
                System.out.println(movieCollection[i]);
            }
        }
    }
}
