
package Activity1_and_2;


public class Person {
    private String name;
    Address a = new Address();
    public Person(){
        
    }
    
    public Person(String name, Address a){
        this.name = name;
        this.a = a;
    }
    public void setName(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void Display(){
        System.out.println("The per son with the name "+name+" has the following Address:");
        System.out.println("Street: "+a.getStreet());
        System.out.println("House Number: "+a.getHouse());
        System.out.println("postal Code: "+a.getCode());
        System.out.println("City: "+a.getCity());
        System.out.println("------------------------");
        
    
    }
}
