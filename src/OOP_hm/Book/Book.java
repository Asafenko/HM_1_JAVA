package OOP_hm.Book;

public class Book {

     String bookName;
     String authorsFullName;
     int release;
     String publishingHouse;
     String style;
     int countOfPages;


    // GETTER
    public String getBookName() {
        return bookName;
    }

    public String getAuthorsFullName() {
        return authorsFullName;
    }

    public int getRelease() {
        return release;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getStyle() {
        return style;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    // SETTER
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorsFullName(String authorsFullName) {
        this.authorsFullName = authorsFullName;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    //CONSTRUCTOR
    public Book(String bookName, String authorsFullName, int release, String publishingHouse, String style, int countOfPages) {
        this.bookName = bookName;
        this.authorsFullName = authorsFullName;
        this.release = release;
        this.publishingHouse = publishingHouse;
        this.style = style;
        this.countOfPages = countOfPages;
    }
    public Book(){}


    public void showInfo(Book book){
        System.out.println(book.bookName + book.authorsFullName + book.release
                + book.publishingHouse + book.style + book.countOfPages );
    }

    public String showInfo() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorsFullName='" + authorsFullName + '\'' +
                ", release=" + release +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", style='" + style + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }
}
