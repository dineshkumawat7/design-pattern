package main.java.patterns.creational.builder;

/**
 * The Builder Design Pattern is a creational design pattern that helps construct
 * complex objects step by step. It separates the construction process from the
 * object's representation, allowing different types of objects to be created
 * using the same construction process.
 *
 * <p>This pattern is especially useful when a class has many optional parameters
 * and you want to avoid large, messy constructors.</p>
 *
 * <p><b>Problems it solves:</b></p>
 * <ul>
 *   <li>Large constructors with many parameters (telescoping constructors).</li>
 *   <li>Multiple setter calls that make object creation error-prone.</li>
 * </ul>
 *
 * <p><b>Solution:</b></p>
 * <ul>
 *   <li>Use a Builder class that provides methods to set properties.</li>
 *   <li>Call a {@code build()} method to create the final object.</li>
 * </ul>
 *
 * <p><b>Result:</b></p>
 * <ul>
 *   <li>Cleaner, more readable, and more flexible object creation.</li>
 * </ul>
 */
public class House {
    private final int rooms;
    private final int bathrooms;
    private final int floors;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;
    private final boolean hasBasement;
    private final String roofType;
    private final String wallColor;
    private final String flooring;

    private House(Builder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.floors = builder.floors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
        this.hasBasement = builder.hasBasement;
        this.roofType = builder.roofType;
        this.wallColor = builder.wallColor;
        this.flooring = builder.flooring;
    }

    @Override
    public String toString() {
        return "House [rooms=" + rooms + ", bathrooms=" + bathrooms + ", floors=" + floors +
                ", garage=" + hasGarage + ", swimmingPool=" + hasSwimmingPool +
                ", garden=" + hasGarden + ", basement=" + hasBasement +
                ", roofType=" + roofType + ", wallColor=" + wallColor +
                ", flooring=" + flooring + "]";
    }

    public static class Builder {
        private int rooms;
        private int bathrooms;
        private int floors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;
        private boolean hasBasement;
        private String roofType;
        private String wallColor;
        private String flooring;

        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setBathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setBasement(boolean hasBasement) {
            this.hasBasement = hasBasement;
            return this;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public Builder setWallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public Builder setFlooring(String flooring) {
            this.flooring = flooring;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
