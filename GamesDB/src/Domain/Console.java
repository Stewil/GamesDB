package Domain;

/**
 *
 * @author Stefan
 */
public class Console implements Comparable {
    private final String name;
    private final String manf;
    private int price;
    
    /**
     * Constructor to make a console object
     * @param name name of the console to be constructed
     * @param manf name of the manufacturor to be constructed
     * @param price name of the price to be constructed
     */
    public Console(String name, String manf, int price){
        this.name = name;
        this.manf = manf;
        this.price = price;
         
    }
    /*getName returns name of the console*/
    public String getName(){
        return this.name;
    }
    //getManf returns manufacturor of the console
    public String getManf(){
        return this.manf;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    @Override
    public String toString(){
        String s = "";
        s.concat("The name of the console is " + name);
        s += " and the manufacturor is " + manf;
        return s;
    }

    public int compareTo(Console c) {
        int i = 0;
        if (this.price > c.getPrice()){
            i = 1;
            
        }
        else if (this.price < c.getPrice()){
            i = -1;
        }
        else {
            i = 0;
    }
        
        return i;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
