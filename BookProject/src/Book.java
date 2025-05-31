public class Book {
    private final String title ;
    private final String author;
    private final int yearPublished;
    private final String ISBN;

    public Book(String title, String author, int yearPublished, String ISBN){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
    }
    public String getAuthor(){
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }
    public void getDetails(){
        System.out.println("Title: " + title + " Author: " + author + " Year Published: " + yearPublished + " ISBN: " + ISBN);
    }


}
