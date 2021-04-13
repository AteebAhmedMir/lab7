
package Ass$;


public class Pizza {
    private String size;
    private int CheeseT, PepperoniT, ChickenT;
    public Pizza(){
        
    }
    public Pizza(String size, int CheeseT, int PepperoniT, int ChickenT ){
        this.size = size;
        this.CheeseT = CheeseT;
        this.PepperoniT = PepperoniT;
        this.ChickenT = ChickenT;
    }
    public void setSize(String size){
        this.size = size;        
    }
    public String getSize(){
        return size;
    }
    
    
    public void setCheeseT(int ct){
        CheeseT = ct;    
    }
    public int getCheeseT(){
        return CheeseT;
    }
    
    
    public void setPepperoniT(int pt){
        PepperoniT = pt;    
    }
    public int getPepperoniT(){
        return PepperoniT;
    }
    
    
    public void setChickenT(int cht){
        ChickenT = cht;    
    }
    public int getChickenT(){
        return ChickenT;
    }
    
    public double calcCost(){
        int cost = 0;
        int costT;
        if (size.equals("small")){
            cost = 10;
            
        }
        else if(size.equals("medium")){
            cost = 12;
            
        }
        else if(size.equals("large")){
            cost = 14;
        }
        else{
            cost = 0;
        }
        costT = cost + 2 * (CheeseT+PepperoniT+ChickenT);
        return costT;
                
    }
    public String getDescription(){
        System.out.println("Pizza size: "+size+"\nPrice: "+calcCost());
        return "Thank you for ordering";
    }
}
