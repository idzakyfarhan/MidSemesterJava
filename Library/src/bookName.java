public class bookName extends Book{
    private String bookChapter;
    public bookName(String bookName, String bookType, String authorName, String publishYear, double bookPrice,String bookChapter) {
        super(bookName, bookType, authorName, publishYear, bookPrice);
        this.bookChapter = bookChapter;
    }

    public String getBookChapter() {
        return bookChapter;
    }

    public void setBookChapter(String bookChapter) {
        this.bookChapter = bookChapter;
    }



    public String printValue (){
        return("Book name = " + super.bookName +"\nBook Chapter = " + this.bookChapter + "\nBook type = " + super.bookType + "\nThe Author = " + super.authorName
                + "\nPublished year = " + super.publishYear + "\nBook Price = " + super.bookPrice);
    }

}
