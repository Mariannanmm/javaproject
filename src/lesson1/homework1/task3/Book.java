package lesson1.homework1.task3;

public class Book{

    private int BookId;
    private int numberOfPages;
    private String author;
    private String title;

    public Book(){};

    public Book(int BookId,int numberOfPages, String author, String title) {
        this.BookId = BookId;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.title = title;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}