# Coffee Ordering System

This project represents a simple implementation of a coffee selection and ordering system. It was created as part of a task to practice working with files and structuring a project.

## How It Works

1. **Choosing a Coffee**  
   - Users can browse and select different coffee types.  
   - Each selection includes a name and price.  

2. **Ordering Process**  
   - After selection, an order is confirmed.  
   - The system processes the order and prepares it for further use.  

## Project Structure

The project consists of the following key files:

### Java Files (Back-End Logic)

- **`MidtermProject.java`** – The main entry point of the program, where coffee selection and payment processing occur.  
- **`Coffee.java`** – Represents a basic coffee object with a description and price.  
- **`Espresso.java`** – A specific type of coffee extending the base class.  
- **`CoffeeDecorator.java`** – Implements a decorator pattern to add additional features to coffee (e.g., milk, sugar).  
- **`MilkDecorator.java`** – Extends `CoffeeDecorator` to add milk functionality.  
- **`CoffeeFactory.java`** – Implements a factory pattern to create different coffee objects.  
- **`PaymentMethod.java`** – An interface for different payment methods.  
- **`CreditCardPayment.java`** – Implements credit card payment processing.  
- **`PayPalPayment.java`** – Implements PayPal payment processing.  
- **`PaymentFactory.java`** – A factory class to create different payment method instances.  



## Where It Can Be Used

- **For Learning and Practice** – A structured project to improve coding skills.  
- **As a Base for Further Development** – Can be extended with new features.  
- **To Demonstrate File Handling and Project Organization** – Useful for understanding how to structure files and manage code efficiently.  

## Future Enhancements

- Expanding the coffee menu with more options.  
- Improving user interaction with additional details and features.  
- Enhancing the structure for better scalability and readability.  


