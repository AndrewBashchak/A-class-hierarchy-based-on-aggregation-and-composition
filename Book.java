public class Book{

    private String title;
    private Author author;
    private int year;
    private String annotation;

    public Book(String title, Author author, int year, String annotation) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.annotation = annotation;
    }

    public void getInfo() {
        System.out.println("Title: " + title + ", information about author: ");
        author.getInfo();
        System.out.println(", year of publication: " + year + ", annotation: " + annotation);
    }
}
