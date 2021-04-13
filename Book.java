
package Activity1_and_2;

public class Book {
    private Person author = new Person();
    public Address address = new Address();
    private String bookName;
    private String publisher;       
    
    public Book(){
        
    }
    public Book(Person author, String bookName, String publisher, Address address){
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }
    public void setAuthor(Person n){
        author = n;
    }
    public Person getAuthor(){
        return author;
    }
    public void setBookName(String bn){
        bookName = bn;
    }
    public String getBookName(){
        return bookName;
    }
    public void setPublisher(String p){
        publisher = p;
    }
    public String getPublisher(){
        return publisher;
    }
   
}
