package test.java.equals;

public class Car {

    private String owner;
    private String model;
    private String color;

    public Car(String owner, String model, String color) {
        this.owner = owner;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // If same object, return true
        if (obj == null || getClass() != obj.getClass())
            return false; // Null check & class check

        Car other = (Car) obj; // Typecast to Car

        // Optimized order of comparisons: based on the likelihood of failing
        return owner.equals(other.owner) &&
                model.equals(other.model) &&
                color.equals(other.color);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + owner.hashCode();
        result = 31 * result + model.hashCode();
        return 31 * result + color.hashCode();
    }

}
