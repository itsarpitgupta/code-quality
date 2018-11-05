#Problem Statement
Design a small ATM printing application which can generate multiple types of statements of the transaction including Mini Statement, Detailed statement etc. However the customer should be aware of the creation of these statements. Ensure that the memory consumption is minimized.

#Design Solution:
The above requirement can be addressed using two core Gang of four design pattern – Factory design pattern and Singleton design pattern. In order to generate multiple types of statements for the ATM transactions in the ATM machine we can create a Statement Factory object which will have a factory method of createStatements(). The createStatements will create DetailedStatement or MiniStatement objects.

The client object will be completely unware of the object creation since it will interact with the Factory interface only. We will also create an interface called StatementType. This will allow further statement type objects e.g. Credit card statement etc to be added. So the solution is scalable and extensible following the object oriented Open/Closed design principle.

The second requirement of reducing the memory consumption can be achieved by using Singleton design pattern. The Statement Factory class need not be initiated multiple times and a single factory can create multiple statement objects. Singleton pattern will create a single instance of the StatementFactory class thus saving memory.


#ATM Example
- Factory: Factory is an abstract class which is a single point of contact for the client. All the concrete factory classes needs to implement the abstract factory method.

- StatementFactory: This is the Factory implementation class which consist of the creator method. This class extends from the Factory abstract class.This is the main creator class for all the products e.g. Statements.

- StatementType: This is a product interface which provides abstraction to the various types of products which needs to be created by the Factory class.

- DetailedStatement: This is a concrete implementation of the StatementType interface which will print the detailed statements.

- MiniStatement: This is a concrete implementation of the StatementType interface which will print the mini statements.

- Client: This is the client class which will call the StatementFactory and StatementType and request for object creation.

#Assumption
The design solution caters to only single ATM machine.