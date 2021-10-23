package carshowroom;

public class Bought_Cars extends Cars{
	    
	    //Declaring Variables
	    private double price;
	    private Customer CustomerData;

	    //No Parameterized Constructor
	    
	    public Bought_Cars() {
	    }

	    //Fully Parameterized Constructor
	    
	    public Bought_Cars(double price, String name, double number, 
	            double model, String city, String color,Customer CustomerData ) {
	        super(name, number, model, city, color);
	        this.price = price;
	        this.CustomerData = CustomerData;
	    }

	    //Setters and and Getters
	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public Customer getCustomerData() {
	        return CustomerData;
	    }

	    public void setCustomerData(Customer CustomerData) {
	        this.CustomerData = CustomerData;
	    }

	    //Overriding method for calculating Total Amount
	    
	    @Override
	    public double calculateAmount(double price, double i) {
	        return  price;
	    }

	    @Override
	    public void Not_Saved() {
	        super.Not_Saved(); }

	    @Override
	    public void Saved() {
	        super.Saved(); 
	    }

	    
	    
}
