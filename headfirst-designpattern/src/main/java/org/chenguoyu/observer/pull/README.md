# 观察者模式中拉的方式
顾名思义拉的方式就是观察者从可观察者中主动获取数据，在本例中使用java内置的方式实现
## jdk中观察者模式的缺点
1. Observable是一个类
2. Observable将关键的方法setChanged()设置为protected