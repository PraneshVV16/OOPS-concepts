# OOPS-concepts
## Abstraction

Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.

A powerful way to manage abstraction is through the use of hierarchical
classifications. This allows you to layer the semantics of complex systems,
breaking them into more manageable pieces. From the outside, the car is a
single object. Once inside, you see that the car consists of several subsystems:
steering, brakes, sound system, seat belts, heating, cellular phone, and so on. In
turn, each of these subsystems is made up of more specialized units. For
instance, the sound system might consist of a radio, a CD player, and/or MP3
player. The point is that you manage the complexity of the car (or any other
complex system) through the use of hierarchical abstractions.
Hierarchical abstractions of complex systems can also be applied to
computer programs. The data from a traditional process-oriented program can
be transformed by abstraction into its component objects. A sequence of
process steps can become a collection of messages between these objects. Thus,
each of these objects describes its own unique behavior. You can treat these
objects as concrete entities that respond to messages telling them to do
something. 

## Encapsulation

Encapsulation is the mechanism that binds together code and the data it
manipulates, and keeps both safe from outside interference and misuse.
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
* Declare class variables/attributes as private
* Provide public get and set methods to access and update the value of a private variable

consider the automatic transmission on an automobile. It encapsulates hundreds of bits of
information about your engine, such as how much you are accelerating, the
pitch of the surface you are on, and the position of the shift lever. You, as the
user, have only one method of affecting this complex encapsulation: by moving
the gear-shift lever. You can’t affect the transmission by using the turn signal
or windshield wipers, for example. Thus, the gear-shift lever is a well-defined
(indeed, unique) interface to the transmission. Further, what occurs inside the
transmission does not affect objects outside the transmission. For example,
shifting gears does not turn on the headlights! Because an automatic
transmission is encapsulated, dozens of car manufacturers can implement one
in any way they please. However, from the driver’s point of view, they all work
the same. This same idea can be applied to programming. The power of
encapsulated code is that everyone knows how to access it and thus can use it
regardless of the implementation details—and without fear of unexpected side
effects.

## Inheritance

In Java, it is possible to inherit attributes and methods from one class to another. To inherit from a class, use the extends keyword. We group the "inheritance concept" into two categories:
* subclass (child) - the class that inherits from another class
* superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

## Polymorphism
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.)

Extending the dog analogy, a dog’s sense of smell is polymorphic. If the dog
smells a cat, it will bark and run after it. If the dog smells its food, it will
salivate and run to its bowl. The same sense of smell is at work in both
situations. The difference is what is being smelled, that is, the type of data
being operated upon by the dog’s nose!
