public class books {
    private String title;
    private String author;
    private String info;
    private boolean isAvailable;

    public books(String title, String author, String info) {
        this.title = title;
        this.author = author;
        this.info = info;
        this.isAvailable = true;
    }
    public void describeBook() {
        System.out.println(title + " " + author + " " + info);

    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
