public class TextBook extends Book {

    private final String subject;
    private final String edition;

    public TextBook(String title, String author, int yearPublished, String ISBN, String subject, String edition) {
        super(title, author, yearPublished, ISBN);
        this.subject = subject;
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public String getEdition() {
        return edition;
    }

    @Override
    public void getDetails() {
    super.getDetails();
        System.out.println(" Subject: " + subject + " Edition: " + edition);
    }
}