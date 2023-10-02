public class books {
    private String title;
    private String author;
    private String info;
    private boolean isAvailable;

    public books(String title, String author, String info, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.info = info;
        this.isAvailable = true;
    }
    //uppdaterat så även isAvailable visas som true eller  false
    public void describeBook() {
        System.out.println(title + " " + author + " " + info + "\nBook is available: " + isAvailable);

    }
    public boolean isAvailable() {
        //System.out.println("Available!");
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getInfo() {
        return info;
    }
    // metod som lånar ut bok och sätter isAvailable till false
    public boolean borrowBook() {
        isAvailable = false;
        return isAvailable;
    }
    //metod som lämnar tillbaks bok och sätter isAvailable till true
    public boolean returnBook() {
        isAvailable = true;
        return isAvailable;
    }
}
