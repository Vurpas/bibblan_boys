import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen till Bibblan");

        ArrayList<books> bookList = new ArrayList<>();

        books book1 = new books("Lord of the rings", "J.R.R. Tolkien - ", "A magical ring needs to be destroyed to save the world");
        books book2 = new books("Wuthering Heights", "Emily Bronte - ", "A love story about two young british people");
        books book3 = new books("The Process", "Franz Kafka - ", "A man gets framed for a crime he did not commit");
        books book4 = new books("Harry Potter", "J.K. Rowling - ", "A magical boy with glasses is trying to save the world");
        books book5 = new books("Lord of the flies", "William Golding", "A group of boys gets stranded on a desert island");
        books book6 = new books("The jungle book", "Rudyard Kipling", "A boy grows up in the jungle and is raised by wild animals");
        books book7 = new books("Little women", "Louisa May Alcott", "A group of women live their lives during the American civil war");
        books book8 = new books("Frankenstein", "Mary Shelley", "A young scientist ventures to far in his quest to create life");
        books book9 = new books("The three musketeers", "Alexandre Dumas", "Three french guys walks around cutting people with swords");
        books book10 = new books("The great Gatsby", "F. Scott Fitzgerald", "Party like theres no tomorrow with mr. Gatsby in the 1920s");


        bookList.add(book1); bookList.add(book2); bookList.add(book3); bookList.add(book4); bookList.add(book5);
        bookList.add(book6); bookList.add(book7); bookList.add(book8); bookList.add(book9); bookList.add(book10);
        book1.describeBook();
        for (books i : bookList) {
            System.out.println(i);
        }


    }

}
