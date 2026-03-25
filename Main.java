public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Andrew Bashchak",2006);
        Author author2 = new Author("Dmytro Svitlyk",2006);

        Book book1 = new Book("How to scam people?", author1, 2020, "Pages are empty");

        author1.getInfo();
        author2.getInfo();
        book1.getInfo();
    }
}
