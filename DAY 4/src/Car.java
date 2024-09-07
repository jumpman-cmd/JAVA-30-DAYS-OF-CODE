public class Car
{
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Bentley";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car()
    {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn)
    {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    // Getters and Setters
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed)
    {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMixSpeed()
    {
        return this.minSpeed;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public boolean getIsTheCarOn()
    {
        return this.isTheCarOn;
    }

    public void printVariables()
    {
        System.out.println("This is the max speed: " + maxSpeed);
        System.out.println("This is the min speed: " + minSpeed);
        System.out.println("This is the Car weight: " + weight);
        System.out.println("This is the Car state: " + isTheCarOn);
        System.out.println("This is the Car condition: " + condition);
        System.out.println("This is the Car name: " + nameOfCar);
        System.out.println("Number of people in Car: " + numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed()
    {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn()
    {
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar)
        {
            numberOfPeopleInCar = numberOfPeopleInCar + 1; // or we can use: numberOfPeopleInCar++;
            System.out.println("Someone got in the car");
        }

        else
        {
            System.out.println("The car is full. People in the car: " + numberOfPeopleInCar );
            System.out.println("Maximum number of people in the car: " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut()
    {
        if(numberOfPeopleInCar > 0)
        {
            numberOfPeopleInCar--; // or we can use: numberOfPeopleInCar = numberOfPeopleInCar - 1;
        }

        else
        {
            System.out.println("No one is in the car, " + numberOfPeopleInCar + " people in the car.");
        }
    }

    public  double howManyMilesTillOutOfGas()
    {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp()
    {
        return maxFuel * maxSpeed;
    }

    public void turnTheCarOn()
    {
        if(!isTheCarOn)
        {
            isTheCarOn = true;
        }

        else
        {
            System.out.println("The car is already on, " + isTheCarOn);
        }
    }


    public static void main(String args[])
    {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
    }
}