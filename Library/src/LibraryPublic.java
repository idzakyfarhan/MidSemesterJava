import java.util.Scanner;

public class LibraryPublic {



    public static void main(String [] args) {
        System.out.println("list of Books :\n1.Harry Potter \n2.Star Wars \n3.Eric Love \n4.Bulan \n5.Matahari");
        System.out.println("\nHarry Potter and Matahari are single chapter");
        System.out.println("\nStar Wars,Eric love,and Bulan has many chapters");
        System.out.println("\nTo find book, type the following book number \nfor example 1 for Harry Potter");

        Scanner bookCode = new Scanner(System.in);
        int input = Integer.parseInt(bookCode.nextLine());
        if (input == 1){
            Book book1 = new Book("Harry Potter", "Sci-Fi", "J.K Rowling", "2003", 100.00);
            System.out.println(book1.printValue());
        }
        if (input == 2){
            bookName bookName1 = new bookName("Star wars","Sci-Fi","Mark Hamil","1976", 150.00,"The First Saga");
            System.out.println(bookName1.printValue());
        }

        if (input == 3){
            bookName bookName2 = new bookName("Eric Love","Romance","Hanifi","2022",20.00,"Eric First Love");
            System.out.println(bookName2.printValue());
        }

        if (input == 4){
            bookName bookName3 = new bookName("Bulan","Romance","Ecky","2018",80.00,"Laut");
            System.out.println(bookName3.printValue());
        }

        if (input == 5){
            Book book1 = new Book("Matahari", "Fashion", "Tomy Baba", "2010", 100.00);
            System.out.println(book1.printValue());
        }

        if (input > 5){
            System.out.println("No Books found");
        }




    }
}
