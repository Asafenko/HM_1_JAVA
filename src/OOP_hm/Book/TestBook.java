package OOP_hm.Book;

public class TestBook {
    public static void main(String[] args) {

        Book book1 = new Book("Код Судьбы: матрица. Путь истинного Я","Анастасия Джей Голлов",
                2022,"Литрес","Практическая эзотерика, Эзотерика",437);

        System.out.println(book1.showInfo());

        System.out.println("------------------------------------------------------");

        Book book2 = new Book("none","none", 0,"none","none",0);
        book2.setBookName("Тонкое искусство пофигизма");
        book2.setAuthorsFullName("Марк Мэнсон");
        book2.setRelease(2016);
        book2.setPublishingHouse("Литрес");
        book2.setStyle("Саморазвитие / личностный рост");
        book2.setCountOfPages(180);

        book2.showInfo(book2);
    }
}
