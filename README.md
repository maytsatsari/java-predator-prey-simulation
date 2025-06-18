# Java Predator-Prey Simulation

A simulation of an evolving ecosystem with predators (foxes) and prey (rabbits), implemented in Java using object-oriented design and a 2D grid-based environment.

Developed as part of a university assignment for practicing OOP, inheritance, random behavior, and step-based logic.

---

##  Features

- Grid-based 20x20 simulation
- Rabbits:
  - Move randomly
  - Reproduce every 3 steps
- Foxes:
  - Hunt adjacent rabbits
  - Reproduce every 8 steps
  - Die after 3 steps without food
- Foxes act before rabbits on each step
- Displayed through ASCII grid

---

##  Class Structure

```
src/
├── Animal.java             // Abstract class for all animals
├── Rabbit.java             // Rabbit behavior
├── Fox.java                // Fox behavior
├── Cell.java               // Grid cell with neighbors and animal
├── Grid.java               // The 20x20 board and logic
├── PopulationSimulator.java // Simulation loop and animal management
└── Simulation.java         // Main class with entry point
```

---

## How to Compile & Run

```bash
javac src/*.java
java -cp src Simulation
```

---

## About the Project

This simulation was implemented for the course **“Object-Oriented Programming Techniques”** at the University of Ioannina.

The objective was to practice:
- Inheritance & abstract classes
- Randomness and simulation logic
- Grid management
- Data structures (`HashSet`, `ArrayList`)



---

##  Author

[maytsatsari](https://github.com/maytsatsari)
