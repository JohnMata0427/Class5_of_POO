public class Autos {
    String color, model, fuel, plate, brand;
    int age;

    public Autos(String newBrand){
        brand = newBrand;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public String getFuel(){
        return fuel;
    }

    public String getPlate(){
        return plate;
    }

    public int getAge(){
        return age;
    }

    public String getBrand(){
        return brand;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public void setFuel(String newFuel){
        this.fuel = newFuel;
    }

    public void setPlate(String newPlate){
        this.plate = newPlate;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
}
