# 🎭 The State Design Pattern
The State design pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. It’s like having an object that adapts its behavior dynamically, based on its current state. 
State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.

## In other words
The State pattern suggests that you create new classes for all possible states of an object and extract all state-specific behaviors into these classes.

It transitions the context of state into another context. It replaces the active state object with another object that represents that new state but it is still the same object. This is possible only if all state classes follow the same interface and the context itself works with these objects through that interface.
