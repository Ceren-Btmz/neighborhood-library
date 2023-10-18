import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[20];
    private static int numBooks = 20;

    public static void main(String[] args) {
        books[0] = new Book(2001, "3903352489", "The Great Gatsby", true, "Emily");
        books[1] = new Book(2002, "9780060933", "To Kill a Mockingbird", false, "");
        books[2] = new Book(2003, "97865865630", "Fahrenheit 451", false, "");
        books[3] = new Book(2004, "97884080529", "The Alchemist", true, "Anthony");
        books[4] = new Book(2005, "97831404640", "The Little Prince", true, "Jenny");
        books[5] = new Book(2006, "97805533983", "Gone Girl", false, "");
        books[6] = new Book(2007, "97804402381", "The Golden Compass", false, "");
        books[7] = new Book(2008, "97888691831", "Harry Potter and the Sorcerer's Stone", false, "");
        books[8] = new Book(2009, "97888310001", "Harry Potter and the Chamber of Secrets", true, "Andre");
        books[9] = new Book(2010, "97808072831", "Harry Potter and the Prisoner of Azkaban", false, "");
        books[10] = new Book(2011, "97884983899", "Harry Potter and the Goblet of Fire", true, "Elizabeth");
        books[11] = new Book(2012, "97801410477", "The Help", false, "");
        books[12] = new Book(2013, "97800067167", "The Lion, the Witch & the Wardrobe", true, "Daniel");
        books[13] = new Book(2014, "97800608459", "Charlotte's Web", true, "Charlotte");
        books[14] = new Book(2015, "97886073110", "The Power of Now", false, "");
        books[15] = new Book(2016, "97801403500", "Little Women", false, "");
        books[16] = new Book(2017, "97801928228", "Frankenstein", false, "");
        books[17] = new Book(2018, "97801400124", "The Catcher in the Rye", true, "Will");
        books[18] = new Book(2019, "97801400489", "Of Mice and Men", false, "");
        books[19] = new Book(2020, "97805820601", "1984", true, "Joseph");

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("What would you like to do? ");
            System.out.println("Show Available Books Select 1");
            System.out.println("Show Checked Out Books Select 2");
            System.out.println("Exit - Close out this application Select 3");
            System.out.println("Enter your command: ");
            int command = scanner.nextInt();

            if (command == 1) {
                listAllAvailableBooks();
            } else if (command == 3){
                flag = false;
            }

            if (command == 2) {
                listAllCheckedOutBooks();
            } else if (command == 3){
                flag = false;
            }
        }
    }

    public static void listAllAvailableBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("All Available Books: ");
        for (int i = 0; i < books.length; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle());
            }
        }
        System.out.println("Would you like to check out a book? Y or N: ");
        String value = scanner.nextLine();

        if (value.equalsIgnoreCase("Y")) {
            CheckingOut();
        } else {
            System.out.println("Go back to the main menu.");
        }
    }

    public static void CheckingOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Checking out successful!");


    }

    public static void listAllCheckedOutBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("All Available Books: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle() + " | " + books[i].getCheckedOutTo());
            }
        }
        System.out.println("Would you like to check out a book? Y or N: ");
        String value = scanner.nextLine();

        if (value.equalsIgnoreCase("Y")) {
            CheckingOut();
        } else {
            System.out.println("Go back to the main menu.");
        }
    }
}
