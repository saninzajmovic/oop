package org.example.ExamPreparation.AdvancedRestaurantManagementAndOrderingSystem;
import java.util.*;

public class MainApplication {

    public static void main(String[] args) {
        // Create a Restaurant
        Restaurant restaurant = new Restaurant();
        restaurant.setCustomers(new ArrayList<>());
        restaurant.setMenuItems(new HashMap<>());

        // Create Menu Items
        Dish pasta = new Dish("D001", "Pasta", 12.99, CuisineType.ITALIAN, "Pasta");
        Dish tacos = new Dish("D002", "Tacos", 8.99, CuisineType.MEXICAN, "Beef");
        Drink cola = new Drink("B001", "Cola", 2.99, 500);
        Drink lemonade = new Drink("B002", "Lemonade", 3.49, 400);

        // Add items to the restaurant's menu
        restaurant.addMenuItem(pasta);
        restaurant.addMenuItem(tacos);
        restaurant.addMenuItem(cola);
        restaurant.addMenuItem(lemonade);

        // Display the menu
        System.out.println("Menu:");
        restaurant.displayMenu();
        System.out.println();

        // Create a TableReservation for Dishes
        TableReservation<Dish> dishReservation = new TableReservation<>("R001", new Date(), 5);
        dishReservation.addItemToOrder(pasta, 2);
        dishReservation.addItemToOrder(tacos, 3);

        // Create a TableReservation for Drinks
        TableReservation<Drink> drinkReservation = new TableReservation<>("R002", new Date(), 5);
        drinkReservation.addItemToOrder(cola, 4);
        drinkReservation.addItemToOrder(lemonade, 2);

        // Create a Customer
        Customer customer = new Customer("C001", "John Doe", "123-456-7890");
        customer.setReservations(new ArrayList<>());
        customer.addReservation(dishReservation);
        customer.addReservation(drinkReservation);

        // Add the customer to the restaurant
        restaurant.addCustomer(customer);

        // Display the customer's reservation history
        System.out.println("Customer Reservations:");
        for (TableReservation<? extends MenuItem> reservation : customer.getReservations()) {
            System.out.println("Reservation ID: " + reservation.getReservationId());
            System.out.println("Table Number: " + reservation.getTableNumber());
            for (Map.Entry<? extends MenuItem, Integer> entry : reservation.getOrderedItems().entrySet()) {
                System.out.println(entry.getValue() + " x " + entry.getKey().getName() + " - $" + entry.getKey().getPrice());
            }
            System.out.println("Total Amount: $" + reservation.calculateTotalAmount());
            System.out.println();
        }

        // Calculate and display total sales for the restaurant
        System.out.println("Total Sales for Restaurant: $" + restaurant.calculateTotalSales());
    }

}

enum CuisineType {
    ITALIAN, CHINESE, MEXICAN, INDIAN, FRENCH
}

interface Billable {
    double applyDiscount(double  discountRate);
    String getDescription();
}

abstract class MenuItem implements Billable {
    private String code;
    private String name;
    private double price;

    public MenuItem(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public double applyDiscount(double discountRate) {
        return this.price * (1-discountRate);
    }

    public String getDescription() {
        return "Name: " + this.name + ", Price: " + this.price;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Dish extends MenuItem {
    private CuisineType cuisineType;
    private String mainIngredient;

    public Dish(String code, String name, double price, CuisineType cuisineType, String mainIngredient) {
        super(code, name, price);
        this.cuisineType = cuisineType;
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cuisine type: " + this.cuisineType + ", Main ingredient: " + this.mainIngredient;
    }

    public CuisineType getCuisineType() {
        return this.cuisineType;
    }
    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }
    public String getMainIngredient() {
        return this.mainIngredient;
    }
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
}

class Drink extends MenuItem {
    private double volume;

    public Drink(String code, String name, double price, double volume) {
        super(code, name, price);
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Volume: " + this.volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class TableReservation<T extends MenuItem & Billable> {
    private String reservationId;
    private Date reservationDate;
    private HashMap<T, Integer> orderedItems;
    private int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.tableNumber = tableNumber;
        this.orderedItems = new HashMap<>();
    }

    public String getReservationId() {
        return this.reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReservationDate() {
        return this.reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public HashMap<T, Integer> getOrderedItems() {
        return this.orderedItems;
    }

    public void setOrderedItems(HashMap<T, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public int getTableNumber() {
        return this.tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItemToOrder(T item, int quantity) {
        orderedItems.put(item, quantity);
    }

    public double calculateTotalAmount() {
        double totalPrice = 0.0;
        for (Map.Entry<T, Integer> e : orderedItems.entrySet()) {
            // quantity puta price
            totalPrice += e.getValue() * e.getKey().applyDiscount(0);
        }
        return totalPrice;
        /// VRATI SE VAMO MSM DA JE PROBLEM SA OVIM DISCOUNT RATE HEPEKOM
    }
}


class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;
    private List<TableReservation<? extends MenuItem>> reservations;

    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void addReservation(TableReservation<? extends MenuItem> reservation) {
        reservations.add(reservation);
    }

    public String getCustomerId() {
        return this.customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List<TableReservation<? extends MenuItem>> getReservations() {
        return this.reservations;
    }
    public void setReservations(List<TableReservation<? extends MenuItem>> reservations) {
        this.reservations = reservations;
    }
}

class Restaurant {
    private String restaurantName;
    private List<Customer> customers;
    private Map<String, MenuItem> menuItems;

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addMenuItem(MenuItem item) {
        menuItems.put(item.getCode(), item);
    }

    public Customer getCustomer(String customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(customerId)) {
                return c;
            }
        }
        return null;
    }

    public void displayMenu() {
        for (Map.Entry<String, MenuItem> item : menuItems.entrySet()) {
            System.out.println(item.getValue().getDescription());
        }
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (Customer c : customers) {;
            for (TableReservation<? extends MenuItem> reservation : c.getReservations()) {
                totalSales += reservation.calculateTotalAmount();
            }
        }
        return totalSales;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public List<Customer> getCustomers() {
        return this.customers;
    }
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public Map<String, MenuItem> getMenuItems() {
        return this.menuItems;
    }
    public void setMenuItems(Map<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}