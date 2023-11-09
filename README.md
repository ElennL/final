# Final-SDP
Final SDP


Our final project is about Ice Cream cafe. We used 6 patterns:
- Strategy pattern for reserving a table type;
- Factory pattern for choosing ice cream flavor;
- Decorator pattern for decorating ice cream object with different syrop and toppings;
- Adapter pattern for payment system;
- Observer pattern for notifying followers in SM;
- Singleton pattern for checking bonus balance


Strategy pattern realization:
ITableReservingStrategy interface has a method reserveTable(). RegularTable, VipTable and WithoutTable classes
implement methods by own. TableReserver has an object variable that holds an interfacr and has a default constructor
that chooses WithoutTable behavior if client forgot to choose table type.


Adapter pattern:
The IPayByBonus interface defines a pay method, and the PayByBonus class implements it using a bonus balance. 
The Payment class handles payments with a credit card. The PaymentAdapter acts as a bridge, enabling the use 
of IPayByBonus objects in the Payment context. It wraps an IPayByBonus object and delegates the pay call to it.


Factory pattern:
The IceCreamFactory class serves as the factory, providing a method createIceCream that creates instances 
of different ice cream flavors based on the provided type. Each ice cream flavor, such as ChocolateIceCream, 
StrawberryIceCream, and VanillaIceCream, implements the common ProductManagment interface, defining methods to
display information (displayInfo) and retrieve the cost (getCost). The factory method encapsulates the creation 
logic, allowing clients to create ice cream objects without specifying their concrete classes directly.


Decorator pattern:
Pattern has a abstract IceCreamDecorator class which implements productManagement. CherrySyrop, 
ChocolateSyrop, PeanutTopping and Sprinkles topping extends IceCreamDecorator and realize methods 
by own. The pattern holds an object created by Factory method and decorate it by wrapping.


Observer pattern:
The CafeNotificator notifies its followers (IObserver) about promotions managed by the PromotionManager. 
Followers, represented by the Follower class, react to promotions by displaying personalized messages. 
The structure enables flexible and decoupled communication between the subject and its observers.



Singleton pattern:
Singleton pattern is implemented in the BonusCheck class. The Singleton pattern 
ensures that a class has only one instance and provides a global point of access to that instance.


![UML_SDP](https://github.com/zhannaa0/Final-SDP/assets/143710787/4383f25d-39a9-47bd-a2df-da987b16d3a1)

