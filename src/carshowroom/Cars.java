package carshowroom;

public class Cars implements Factory,Observer{
    //Declaring Variables
    private String name;
    private double number;
    private double model;
    private String city;
    private String color;
    
    Saved_Data_Command saved;
    Not_Saved_Command Not_Saved;

    //No Parameterized Constructor
    public Cars() {
    }

    //Fully Parameterized Constructor
    public Cars(String name, double number, double model, String city, String color) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.city = city;
        this.color = color;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getModel() {
        return model;
    }

    public void setModel(double model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double displayModel(double model) {
    	return model;
    }
    
    //Overriding method for the usage of sub classes
    @Override
    public double calculateAmount(double i, double j) {
       return i*j;
    }

    //Observer Pattern 
    @Override
    public void Update_Data() {
     
    }

    public void Saved(){
        saved.Saved();
    }
    
    public void Not_Saved(){
        Not_Saved.Not_Saved();
    }
}
