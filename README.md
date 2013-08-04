# Software design patterns, written in Java

## Strategy Pattern

Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

Folder: __Strategy Pattern__ 

## Observer Pattern

Object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes

Folders:
	
- __Observer Pattern__
	
	Custom pattern implementation

- __Observer Pattern (java.util)__ 

	Pattern implementation using _java.util_ library

- __Observer Pattern (swing)__ 

	Pattern implementation using _awt_ / _swing_ libraries

## Decoration Pattern

Allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class

Folders:

- __Decoration Pattern__ 
	
	Custom pattern implementation, I took “coffee-company” way to demonstrate
	
- __Decoration Pattern (decoration io)__

	Lower Case concrete __LowerCaseInputStream__ decorator class written under _FilterReader_ abstract class-decorator for _java.io.Reader_
	
	![buttons](https://raw.github.com/masterrr/Software-Patterns/master/assets/dp.png)
	
## Simple Factory Pattern

Simple Factory Pattern is just an object for creating other objects.

Folder: __Factory Simple Pattern__ 

## Factory Pattern

Factory pattern defines a creating objects interface, but gives ability to choose class of objects to its subclasses => factory pattern delegates creating objects to its subclasses.

Folder __Factory Pattern__

