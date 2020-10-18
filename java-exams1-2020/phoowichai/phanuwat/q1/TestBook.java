package phoowichai.phanuwat.q1;

/**
 * 
 * Problem 3
 * 
 * Name : Phanuwat Phoowichai
 * St. ID : 623040140-8
 * 
 **/

public class TestBook {
    public static void main(String[] args) { // main of program
        Book book1 = new Book();
        System.out.println(Book.getNoOfBook() + " : " + book1);

        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 15.43, BookGenres.FICTION);
        System.out.println(Book.getNoOfBook() + " : " + book2);

        Book book3 = new Book("Time", "Time USA", 1.4321, BookGenres.MAGAZINE);
        System.out.println(Book.getNoOfBook() + " : " + book3);

        Book book4 = new Book("Educated a Memoir", "Tara Westover", -14.99, BookGenres.AUTOBIOGRAPHY);
        System.out.println(Book.getNoOfBook() + " : " + book4);

        book1.setTitle("Around the World in Eighty Days");
        book1.setAuthor("Jules Verne");
        book1.setPrice(-1.00);
        book1.setGenres(BookGenres.TRAVEL);
        System.out.println(book1);

        book2.setPrice(1.2345);
        System.out.println(book2.getTitle() + " changes price to " + book2.getPrice());

        if (book1.isCheaper(book2)) {
            System.out.println(book1.getTitle() + " is cheaper than " + book2.getTitle());
        } else {
            System.out.println(book2.getTitle() + " is cheaper than " + book1.getTitle());
        }
    }
}