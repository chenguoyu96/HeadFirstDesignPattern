# 模板方法模式

**定义**

模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤

# 要点

1. "模板方法"定义了算法的步骤，把这些步骤的实现延迟到子类
2. 模板方法模式为我们提供了一种代码复用的重要技巧
3. 模板方法的抽象类可以定义具体方法，抽象方法和钩子
4. 抽象方法由子类实现
5. 钩子是一种方法，它在抽象类中不做事，或者只做了默认的事情，子类可以选择要不要覆盖它。
6. 为了防止子类改变模板方法中的算法，可以将模板方法声明为final。
7. 好莱坞原则告诉我们，将决策权放在高层模块中，以便决定如何及何时调用低层模块。
8. 在真实世界代码中可以看到模板方法的许多变体，不要期待它们全是一眼就可以被认出
9. 策略模式和模板方法模式都封装算法，一个中组合，一个用继承
10. 工厂方法是模板方法的一个特殊版本。