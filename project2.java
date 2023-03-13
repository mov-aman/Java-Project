import java.util.Scanner;

public class BookStoreManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        int option = 0;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            option = scanner.nextInt();
            scanner.nextLine();
        }
    }
}