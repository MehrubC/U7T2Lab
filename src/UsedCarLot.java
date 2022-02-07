import java.util.ArrayList;

/**
 * This class represents a UsedCarLot object
 *
 * @author Mehrub Chowdhury
 */
public class UsedCarLot
{
    /** The cars within the UsedCarLot */
    private ArrayList<Car> inventory;

    /**
     * initializes inventory as an empty ArrayList
     * Creates a UsedCarLot object
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the inventory of the used car lot
     *
     * @return the inventory
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * adds a car to the inventory
     *
     * @param carToAdd the car to add
     */
    public void addCar(Car carToAdd)
    {
        inventory.add(carToAdd);
    }

    /**
      * Swaps the Car at index1 with the Car at index2 in inventory and returns true;
      * If either index1 or index2 exceed the bounds of the inventory or is negative,
      * no changes are made to the inventory and false is returned.
      *
      * @param index1 The index of the first Car to swap
      * @param index2 The index of the second Car to swap
      * @return True if the swap was successful, false if the swap was not successful
      */
    public boolean swap(int index1, int index2)
    {
        if(index1 < inventory.size() && index2 < inventory.size() && index1 >= 0 && index2 >= 0)
        {
            Car car1 = inventory.get(index1);
            Car car2 = inventory.get(index2);
            inventory.set(index2, car1);
            inventory.set(index1, car2);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Adds a Car to the inventory list at the index specified
     * with indexToAdd; this method increases the size of inventory by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index in the inventory to add the new Car
     * @param carToAdd The Car to add
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Removes a sold car from the inventory of the lot and shifts other cards to fill the space
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell index of car being sold
     * @return the sold car
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car car = inventory.remove(indexOfCarToSell);
        return car;
    }

    /**
     * Removes one sold car from the inventory of the lot
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell index of  car being sold
     * @return the sold car
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car car = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return car;
    }

    /**
     * Moves a car at one index to a new index specified by destinationIndex
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size() destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove current index of the car being moved
     * @param destinationIndex new index of the car
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }

}
