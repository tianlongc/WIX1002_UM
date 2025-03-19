/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
public class OAIRecord {
    private String doi, title, subject, keyword, status;
    private String[] authors;
    
    public OAIRecord(String[] attributes){
        // 13 attributes
        this.doi = attributes[0];
        this.title = attributes[1];
        this.subject = attributes[2];
        this.authors = new String[8];
        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = attributes[3 + i];
        }
        this.keyword = attributes[11];
        this.status = attributes[12];
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public String[] getAuthors(){
        return this.authors;
    }
    
    @Override
    public String toString(){
        // Extract empty authors
        String authorsList = "";
        for (String author : authors) {
            if (author != null && !author.isEmpty()) { // Check for non-empty strings
                if (!authorsList.isEmpty()) {
                    authorsList += ", "; // Add comma only if list is not empty
                }
                authorsList += author; // Append valid author and remove last comma
            }
        }
    
        return String.format("%s \"%s\" %s {%s} %s", doi, title, subject, authorsList, keyword);
    }
    
}
