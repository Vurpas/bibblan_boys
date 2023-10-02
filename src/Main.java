import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen till Bibblan");

        List<books> bookList = new ArrayList<>();

        bookList.add(new books("Lord of the rings", "J.R.R. Tolkien - ", "A magical ring needs to be destroyed to save the world",true));
        bookList.add(new books("Wuthering Heights", "Emily Bronte - ", "A love story about two young british people",true));
        bookList.add(new books("The Process", "Franz Kafka - ", "A man gets framed for a crime he did not commit",true));
        bookList.add(new books("Harry Potter", "J.K. Rowling - ", "A magical boy with glasses is trying to save the world",true));
        bookList.add(new books("Lord of the flies", "William Golding", "A group of boys gets stranded on a desert island",true));
        bookList.add(new books("The jungle book", "Rudyard Kipling", "A boy grows up in the jungle and is raised by wild animals",true));
        bookList.add(new books("Little women", "Louisa May Alcott", "A group of women live their lives during the American civil war",true));
        bookList.add(new books("Frankenstein", "Mary Shelley", "A young scientist ventures to far in his quest to create life",true));
        bookList.add(new books("The three musketeers", "Alexandre Dumas", "Three french guys walks around cutting people with swords",true));
        bookList.add(new books("The great Gatsby", "F. Scott Fitzgerald", "Party like theres no tomorrow with mr. Gatsby in the 1920s",true));


        //lånar ut bok baserat på angiven index plats, måste lånas ut innan aktuell forEach för att listan skall vara uppdaterad.
        bookList.get(2).borrowBook();

        //for each som visar varje bok i vår lista samt om den är available
        bookList.forEach(books -> {
            System.out.println("\nTitle : " + books.getTitle() + ", Author : " + books.getAuthor() + ", Info : " + books.getInfo() + "\nAvailable : " + books.isAvailable());
        });


        //bookList.get(1).borrowBook();
        //bookList.get(1).describeBook();




    }

}
