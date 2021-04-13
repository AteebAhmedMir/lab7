
package Activity1_and_2;


public class RunnerBook {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        Book b1 = new Book();
        
        b1.setAuthor(p1);
        b1.getAddress().setHouse(36);        
        b1.getAddress().setCode(46000);       
        b1.getAddress().setStreet(20);
        b1.getAddress().setCity("Islamabad");
        
        b1.setBookName("Bum Bum Chao Chao");
        b1.setPublisher("Dont Mind ltd.");
              
        
        System.out.println("The name of the book is :"+b1.getBookName());
        System.out.println("The name of the author is :"+b1.getPublisher());
        System.out.println("The address of the author is:   ");
        System.out.println("House Number: "+b1.getAddress().getHouse()+"\nPostal Code: "+b1.getAddress().getCode()+"\nStreet: "+b1.getAddress().getStreet()+"\nCity: "+b1.getAddress().getCity());
    }
    
}
