public class Main {



     static class Book {

          String title;

          String author;

          int pages;

          boolean isAvailable;



          public Book(String title, String author, int pages) {

               this.title = title;

               this.author = author;

               this.pages = pages;

               this.isAvailable = true;

               System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");

          }



          public void displayInfo() {

               System.out.println("\n~~ Book Information ~~");

               System.out.println("Title  : " + title);

               System.out.println("Author : " + author);

               System.out.println("Pages  : " + pages);

               System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));

          }



          public void borrowBook() {

               if (isAvailable) {

                    isAvailable = false;

                    System.out.println("You have successfully borrowed '" + title + "'.");

               } else {

                    System.out.println("'" + title + "' is currently not available.");

               }

          }



          public void returnBook() {

               if (!isAvailable) {

                    isAvailable = true;

                    System.out.println("Thank you for returning '" + title + "'.");

               } else {

                    System.out.println("'" + title + "' was not borrowed.");

               }

          }

     }



     public static void main(String[] args) {

          Book book1 = new Book("A Court of Thorn and Roses", "Sarah J. Maas", 325);

          Book book2 = new Book("The Housemaid", "Freida McFadden", 480);

          Book book3 = new Book("The Anxious Generation", "Jonathan Haidt", 667);



          book1.displayInfo();

          book2.displayInfo();

          book3.displayInfo();



          book1.borrowBook();

          book1.displayInfo();

          book1.borrowBook();

          book1.returnBook();

          book1.displayInfo();

     }

}