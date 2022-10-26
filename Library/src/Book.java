public class Book {
    public String bookName;
    public String bookType;
    public String authorName;
    public String publishYear;
    public double bookPrice;

    public Book (String bookName, String bookType, String authorName, String publishYear, double boookPrice){
        this.bookName = bookName;
        this.bookType = bookType;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.bookPrice = boookPrice;
    }

    public String printValue (){
        return("Book name = " + this.bookName +"\nBook type = " + this.bookType + "\nThe Author = " + this.authorName
        + "\nPublished year = " + this.publishYear + "\nBook Price = " + this.bookPrice);
    }


}
