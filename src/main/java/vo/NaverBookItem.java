package vo;

public class NaverBookItem {
    private String title;
    private String author;
    private String isbn;
    private boolean loanAvailable;
    private String returnDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getLoanAvailable() {
        return loanAvailable;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    // Getter, Setter, 생성자, toString 등 필요한 메서드 구현
}
