# 外观模式

**定义**

外观模式提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用

# 设计原则

最少知识原则：只和你的密友谈话

**指导方针**

就任何对象而言，在该对象的方法内，我们只应该调用属于以下范围的方法：

 	1. 该对象本身
 	2. 被当做方法的参数而传递进来的对象
 	3. 此方法所创建或实例化的任何对象
 	4. 对象的任何组件(实例变量所引用的任何对象)

# 要点

1. 当需要简化并统一一个很大的接口或者一群复杂的接口时，使用外观
2. 外观将客户从一个复杂的子系统中解耦
3. 实现一个外观，需要将子系统组合进外观中，然后将工作委托给子系统执行
4. 外观模式，适配器模式的不同——写法差不多，更多的是意图的不同
   1. 外观的意图是简化接口
   2. 适配器的意图是将接口转化成不同