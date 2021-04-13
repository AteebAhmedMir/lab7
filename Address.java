
package Activity1_and_2;

public class Address {
    private int streetNo, houseNo, code;
    private String city;
    public Address(){
        city = "Islamabad";
        streetNo = 1;
        houseNo = 1;
        code = 11111;
    }
    public Address(int streetNo, int houseNo, int code, String city){
        this.city = city;
        this.code = code;
        this.houseNo = houseNo;
        this.streetNo = streetNo;
    }
    public void setStreet(int s){
        streetNo = s;
    }
    public int getStreet(){
        return streetNo;
    }
    public void setHouse(int h){
        houseNo = h;
    }
    public int getHouse(){
        return houseNo;
    }
    public void setCode(int c){
        code = c;
    }
    public int getCode(){
        return code;
    }
    public void setCity(String m){
        city = m;
    }
    public String getCity(){
        return city;
    }
    
    
}
