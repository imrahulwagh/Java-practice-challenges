// 76. Create an object with final fields and a constructor to initialize
//them.
class Car {
    final int noOfWheels;
    final String model;
    final String colour;

    Car(int noOfWheels,String model,String colour){
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift = new Car(4,"SWT85","white");
        System.out.println(swift);
    }
}
