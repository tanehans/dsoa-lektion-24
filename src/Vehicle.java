public class Vehicle {
    // Deklarerar instansvariabeln med namnet "name"
    public String name;
    static int carsCreated = 0;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCarsCreated(){
        return carsCreated;
    }
}
