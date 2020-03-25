public class Book {
    private String bookName;
    private int bookPrice;
    private String authorname;
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
    public String getAuthorname() {
        return authorname;
    }
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
    public Book(String bookName, int bookPrice,String authorname){
        setBookName(bookName);
        setBookPrice(bookPrice);
        setAuthorname(authorname);
    }
    public void display(){
        System.out.println("Book Details");
        System.out.println("Book Name:"+getBookName());
        System.out.println("Book Price:"+getBookPrice());
        System.out.println("Author Name:"+getAuthorname());
    }
}
