public class NonFiction extends Book{
    private final String genre;

    public NonFiction(String title, String author, int yearPublished, String ISBN, String genre){
        super(title,author,yearPublished,ISBN);
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println(" Genre: " + genre);
    }
}

