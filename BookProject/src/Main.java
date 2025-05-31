import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.Entry();

    }

    ArrayList<Book> books = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void Entry() {
        while (true) { //allows user to input multiple books (prevent the code stopping after running once
            System.out.println("Book Manager");
            System.out.println("---------------------");
            System.out.println("Enter 1: View Books");
            System.out.println("Entr 2: Add Books");
            System.out.println("Enter 3: Exit");

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBooks();
                    break;
                case 3:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter input 1-3.");
            }
        }
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books saved in the catalog.");
        }
        for (Book b : books) {
            b.getDetails();
        }
    }

    public void addBooks() {
            System.out.println("Enter a book type(1 for Fictional, 2 for Non-Fictional, 3 for Textbook): ");

            int bookType = input.nextInt();
            input.nextLine();


            System.out.println("Title: ");
            String title = input.nextLine();

            System.out.println("Author: ");
            String author = input.nextLine();

            System.out.println("Year Published: ");
            int yearPublished = input.nextInt();
            input.nextLine();


            System.out.println("ISBN: ");
            String ISBN = input.nextLine();

            switch (bookType) {
                case 1:
                    System.out.println("Genre: ");
                    String genre = input.nextLine();
                    books.add(new Fiction(title, author, yearPublished, ISBN, genre));
                    break;
                case 2:
                    System.out.println("Genre: ");
                    String nonFictionGenre = input.nextLine();
                    books.add(new NonFiction(title, author, yearPublished, ISBN, nonFictionGenre));
                    break;
                case 3:
                    System.out.println("Subject: ");
                    String subject = input.nextLine();
                    System.out.println("Edition: ");
                    String edition = input.nextLine();
                    books.add(new TextBook(title, author, yearPublished, ISBN, subject, edition));
                    break;
            }
            System.out.println("Book has been added :)");

        }
    }

