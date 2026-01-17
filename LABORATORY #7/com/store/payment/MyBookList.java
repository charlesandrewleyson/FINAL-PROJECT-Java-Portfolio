public class MyBookList {
        // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
        public static Book[] Books = new Book[5];
       
        

        // 2.) Display the details of each book using the displayDetails method. Below is the sample output
        //     Title: Rich Dad Poor Dad, Author: Robert Kiyosaki, Year: 1997, Current Page: 0
        //     Title: The Power of Habit, Author: Charles Duhigg, Year: 2012, Current Page: 0
        //     Title: Atomic Habits, Author: James Clear, Year: 2018, Current Page: 0
        //     Title: Java Programming, Author: John Doe, Year: 2020, Current Page: 0
public static void displayDetails(){

for (int i = 0; i< Books.length;i++){
        System.out.println("\nTitle: " + Books[i].title 
         +  ", Author: " + Books[i].author 
         +  ", Year: " + Books[i].yearPublished 
         + ", Current Page: " + Books[i].currentPage );

}
System.out.println("---------------------------------------------------------------------------");
}

        // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
 public static void changePage() {
        Books[0].currentPage = 50;
        Books[2].currentPage = 100;
       System.out.println("Change current page of Rich Dad Poor Dad and Atomic Habits: ");
        System.out.println("\nTitle: " + Books[0].title 
         +  ", Author: " + Books[0].author 
         +  ", Year: " + Books[0].yearPublished 
         + ", Current Page: " + Books[0].currentPage );

        System.out.println("\nTitle: " + Books[2].title 
         +  ", Author: " + Books[2].author 
         +  ", Year: " + Books[2].yearPublished 
         + ", Current Page: " + Books[2].currentPage );
       System.out.println("---------------------------------------------------------------------------");

        // 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.
 Books[4].currentPage = 74;
       System.out.println("Change current page of favorite book: ");
        System.out.println("\nTitle: " + Books[4].title 
         +  ", Author: " + Books[4].author 
         +  ", Year: " + Books[4].yearPublished 
         + ", Current Page: " + Books[4].currentPage );
        System.out.println("---------------------------------------------------------------------------");
 
    
    
        // 5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.
 Books[3].author = "Jane Smith";
       System.out.println("Change the author of Java Programming to Jane Smith: ");
       System.out.println("\nTitle: " + Books[3].title 
         +  ", Author: " + Books[3].author 
         +  ", Year: " + Books[3].yearPublished 
         + ", Current Page: " + Books[3].currentPage );
       System.out.println("---------------------------------------------------------------------------");
 
        // 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of the books published after 2010.
 }
  public static void main(String[]args){
       
Books[0]=new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0);
       Books[1]=new Book("The Power of Habit", "Charles Duhigg", 2012, 0);
       Books[2]=new Book("Atomic Habits", "James Clear", 2018, 0);
       Books[3]=new Book("Java Programming", "John Doe", 2020, 0);
       Books[4]=new Book("The Lightning Thief", "Rick Riordan", 2005, 0);
displayDetails();
changePage();

        System.out.println("\nBooks published after year 2010: \n");
        for (int i = 0; i < Books.length; i++){
            if (Books[i].yearPublished > 2010) {
                System.out.println((i) + ". " + Books[i].title + "\n");

    }
}
 }

    public static Book[] getBooks() {
        return Books;
    }

}