package carshowroom;

public class Rent_Cars extends Cars implements State{

	
	    //Declaring Variables    
	    private double perDay;
	    private double Days;
	    private Customer CustomerData;

	    //No Parameterized Constructor
	    public Rent_Cars() {
	    }
	        
	    //Fully Parameterized Constructor
	    
	    public Rent_Cars(double perDay, double Days, Customer CustomerData, String name,
	            double number, double model, String city, String color) {
	        super(name, number, model, city, color);
	        this.perDay = perDay;
	        this.Days = Days;
	        this.CustomerData = CustomerData;
	    }

	    //Setters and Getters
	    public double getPerDay() {
	        return perDay;
	    }

	    public void setPerDay(double perDay) {
	        this.perDay = perDay;
	    }

	    public double getDays() {
	        return Days;
	    }

	    public void setDays(double Days) {
	        this.Days = Days;
	    }

	    public Customer getCustomerData() {
	        return CustomerData;
	    }

	    public void setCustomerData(Customer CustomerData) {
	        this.CustomerData = CustomerData;
	    }

	    //Overriding Method for Calculating Amount
	    
	    @Override
	    public double calculateAmount(double Days, double perDay) {
	        return  Days * perDay;
	    }

	    @Override
	    public void Avialable() {
	    
	        System.out.println("This Car is Now Avialable! ");
	        
	    }

	    @Override
	    public void Not_Available() {
	    
	        System.out.println("This Car is Not Avialable Yet! ");
	        
	    }

	    @Override
	    public void Not_Saved() {
	        super.Not_Saved(); }

	    @Override
	    public void Saved() {
	        super.Saved(); 
	    }
}
