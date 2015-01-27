
/**
 * Calculates the price of a custom made desk 
 * 
 * @author Rodnie Rutterbush
 * @version 2015.26.1
 */
public class DeskPriceCalculator {

    public int price;
    private final int MIN_PRICE = 200;
    private final int MAX_SURFACE = 750;
    private final int WOOD_TYPE2 = 125; //PRICE FOR OAK
    private final int WOOD_TYPE3 = 150; //PRICE FOR MAHOGANY
    private final int WOOD_TYPE1 = 0; //PRICE FOR PINE
    private final int OVERSIZE = 50;
    private final int PER_DRAWER = 30;
    private int numDrawers;
    public int width;
    public int length;
    public int area;
    private int orderNum;
    private int woodType;
    public char name;

    /**
     * Constructor for objects of class DeskPriceCalculator
     */
    public DeskPriceCalculator() {
        price = 0;
        width = 0;
        length = 0;
        area = 0;
        
    }
    
     /**
     * Sets the Order Number
     */
    public void setOrderNum() {
        this.orderNum = orderNum;
        
    }
    
     /**
     * Sets the Customer name on the order
     */
    public char setOrderName(char name) {
        this.name = name;
        return name;
        
    }
     /**
     * Sets the length for the top of the desk
     */
    public int setLength() {
        this.length = length;
        
    }
    
     /**
     * Returns length value
     */
    public int getLength(int length) {
        return length;
        
    }
    
    /**
     * Sets the width for the top of the desk
     */
    public int setWidth() {
        this.width = width;
        
    }
    
     /**
     * Returns width value
     */
    public int getWidth(int width) {
        return width;
        
    }
    
    /**
     * Sets value for wood type
     * woodType MAHOGANY = 3
     * woodtype OAK = 2
     * woodType PINE = 1
     */
    public int setWoodType (){
        this.woodType = woodType;
    }
    /**
     * Returns Wood Type
     */
    public int getWoodType (int woodType){
        return woodType;
    }
    
    /**
     * Sets value for number of drawers
     */
    public int setNumDrawers () {
        this.numDrawers = numDrawers;
    }
    
    /**
     * Returns number of drawers
     */
    public int getNumDrawers (int numDrawers){
        return numDrawers;
    }
    
    /**
     * Calculates price for desk
     */
    public int calcPrice (int price) {
        price = MIN_PRICE;
        if ((length * width) > MAX_SURFACE){
            price += OVERSIZE;
        }
        if (woodType == 3){
            price += WOOD_TYPE3;
        }
        else if (woodType == 2){
            price += WOOD_TYPE2;
        }
        else price += WOOD_TYPE1;
        price += (numDrawers * PER_DRAWER);
        
        return price;
       
    }
    /**
     * Prints Sales Form
     */
    public void printForm () {
        // Simulate the printing of a ticket.
        System.out.println("#########################");
        System.out.println("# Rick Hammer Carpentry #");
        System.out.println("# Desk Reciept #");
        System.out.println("# The name on the order is" + name + "#");
        System.out.println("# Your Price is " + price + "Dollars #");
        System.out.println("##################");
        System.out.println();
    }
    
}

