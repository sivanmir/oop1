public class Computer {
    String model;
    int price;
    int numberOfProcessors;
    float screenSize;
    boolean IsTurnedOn;

    public Computer(String model, int price, int numberOfProcessors, float screenSize, boolean isTurnedOn) {
        this.model = model;
        this.price = price;
        this.numberOfProcessors = numberOfProcessors;
        this.screenSize = screenSize;
        this.IsTurnedOn = isTurnedOn;
    }
    public String toString(){
        return " model: " + this.model + " price: "+ this.price + " processors Number "+ this.numberOfProcessors+ " size: " + this.screenSize+ " turned on? " + this.IsTurnedOn;
    }
}
