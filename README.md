# Java Abstract Class Example (Animals)

A small Java program that demonstrates **abstract classes**, **inheritance**, and **method overriding** using animals.

## What It Demonstrates

- An abstract class (`AbstractAnimal`) with an abstract method `eat()` and a regular method `dance()`
- A concrete subclass (`ConcreteDog`) that must implement `eat()`
- A method that exists only in the subclass (`move()`)
- Why an abstract class cannot be instantiated directly

## Code Overview

| Class | Role |
|-------|------|
| `AbstractAnimal` | Abstract class with abstract `eat()` and concrete `dance()` |
| `ConcreteDog` | Extends `AbstractAnimal`, implements `eat()`, adds `move()` |
| `AbstractDemo` | Contains `main` and runs the demo |

```java
ConcreteDog d = new ConcreteDog();
d.eat();    // overridden abstract method
d.dance();  // inherited concrete method
d.move();   // method of the child class
```

`new AbstractAnimal()` would not compile, because abstract classes cannot be instantiated.

## Output

```
Dog can eat
Animals can dance
Dog can move
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac AbstractDemo.java
java AbstractDemo
```

## Project Structure

```
.
├── AbstractDemo.java
└── README.md
```

## Next Steps

- Add another subclass such as `ConcreteCat` with its own `eat()`
- Add a second abstract method
- Compare abstract classes with interfaces
