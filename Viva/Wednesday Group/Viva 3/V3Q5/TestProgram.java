/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q5;

/**
 *
 * @author tianlongc
 */
public class TestProgram {
    
    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();
        
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, "Science Fiction");
        Movie movie2 = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, "Drama");
        Movie movie3 = new Movie("Pulp Fiction", "Quentin Tarantino", 1994, "Crime");
        Movie movie4 = new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action");
        Movie movie5 = new Movie("The Godfather", "Francis Ford Coppola", 1972, "Crime");
        
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.addMovie(movie3);
        movieCollection.addMovie(movie4);
        movieCollection.addMovie(movie5);
        
        System.out.println("Searching for movie(s) by director:");
        movieCollection.findmovieCollectionByDirector("Christopher Nolan");
        
        System.out.println("\nSearching for a movie by title:");
        movieCollection.findmovieCollectionByTitle("Inception");
        
        System.out.println("\nMovies released between 1990 and 2010:");
        movieCollection.findmovieCollectionByReleaseYearRange(1990, 2010);
        
        System.out.println("\nSorted movieCollection by release year:");
        movieCollection.sortmovieCollectionByReleaseYear();
        movieCollection.displayCollection();
        
        movieCollection.removeMovie(movie3.getTitle());
        System.out.println("\nUpdated Movie Collection:");
        movieCollection.displayCollection();
    }
}
