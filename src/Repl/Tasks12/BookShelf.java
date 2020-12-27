package Repl.Tasks12;

public class BookShelf {
    public static void main(String[] args) {

        Book book = new Book();
        book.setAuthor("marWan subhi");
        book.setId(32);
        book.setPages(300);
        book.setTitle("the grOOMING MeeTiNg AT THE house");

        Book book1 = new Book(480, "Mahdi", "The way back home", 1250);
        Book book2 = new Book(785, "Majd", "The way to Texas", 1650);
        Book book3 = new Book(784, "Majd", "dd", 10);
        Book book4 = new Book(654, "Mahdi", "The way back ", 1250);
        Book book5 = new Book(368, "Mahdi", "The way ", 1250);
        //Shelf.addBook(book2);
        // Shelf.addBook(100,"Luran wayne"," the arch",0);


        Shelf.addBook(book);
        Shelf.addBook(book1);
        Shelf.addBook(book2);
        Shelf.addBook(book3);
        Shelf.addBook(book4);
        Shelf.addBook(book5);
        //Shelf.addBook(417,"Manara","The way to Krabala",1000);
        System.out.println(Shelf.addBook(789, "Manara", "Karbala", 150));
        System.out.println("******************************************");
        System.out.println(Shelf.getTheBooks());
        System.out.println("============================================");

        System.out.println(Shelf.getAllBooksForAuthor("Mahdi"));

    }
}
