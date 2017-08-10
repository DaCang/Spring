#IOC (Inversion of Control) 控制反转
## 一、三种方式
- **构造方法注入**（constructor injection）
- **setter方法注入**（setter injection）
- **接口注入**（interface injection）
#####  1、1 三种方式的异同
- **构造方法注入**：因为它强制被注入对象实现不必要的接口，带有侵入性
- **构造方法注入**：这种注入方式的优点就是，对象在构造完成之后，即已进入就绪状态，
                  缺点是：当依赖对象比较多的时候，构造方法的参数列表会比较长
- **setter方法注入**： 缺点是对象无法在构造完成后马上进入就绪状态。    

* * *
# 构造方法注入xm配置 
 
*代码1-1* 

    <bean id="user" class="com.syl.ioc.constructor_injection.User">
          <!--构造方法注入-->
          <!--要通过构造方法注入方式，为当前业务对象注入其所依赖的对象，
              需要使用 <constructor-arg>  -->
          <constructor-arg  value="syl" type="java.lang.String"></constructor-arg>
          <constructor-arg ref="food" type="com.syl.ioc.constructor_injection.Food"></constructor-arg>
          <constructor-arg  value="001" type="int"></constructor-arg>
  
      </bean>
      <bean name="food" class="com.syl.ioc.constructor_injection.Food">
          <constructor-arg name="foodId" value="001"></constructor-arg>
          <constructor-arg name="foodName" value="炸酱面"></constructor-arg>
      </bean>     
> <constructor-arg>标签的name type 或者 index 属性  都可以指明构造参数的顺序 属性  

代码1-1也可以写成如下的形式：

> *index*属性可以指明参数的顺序

*代码1-2*

    <bean id="user" class="com.syl.ioc.constructor_injection.User">
          <!--构造方法注入-->
          <!--要通过构造方法注入方式，为当前业务对象注入其所依赖的对象，
              需要使用 <constructor-arg>  -->
           <constructor-arg index="0"  value="001"></constructor-arg>
           <constructor-arg index="1"   value="syl"></constructor-arg>
           <constructor-arg index="2" ref="food"></constructor-arg>
  
    </bean>
    <bean name="food" class="com.syl.ioc.constructor_injection.Food">
          <constructor-arg name="foodId" value="001"></constructor-arg>
          <constructor-arg name="foodName" value="炸酱面"></constructor-arg>
    </bean>
      
* * *
# setter方法注入xml配置


*代码1-3*
       
       <bean id="user01" class="com.syl.ioc.setter_injection.User">
       <!--set注入-->
                <property name="food" ref="food" ></property>
                <property name="userId" value="001"></property>
                <property name="userName" value="宋永利" ></property>
       </bean>
       <bean name="food" class="com.syl.ioc.setter_injection.Food">
                <property name="foodId" value="001"></property>
                <property name="foodName" value="炸酱面"></property>
       </bean>
       
#### 注入对象类型为 java.util.List 及其子类或者数组类型的依赖对象时用到 *list*属性。

*代码1-4*

    <bean id="user" class="com.syl.ioc.constructor_injection.list.User">
        <!--构造方法注入-->
        <!--要通过构造方法注入方式，为当前业务对象注入其所依赖的对象，
            需要使用 <constructor-arg>  -->
        <constructor-arg index="0"  value="001"></constructor-arg>
        <constructor-arg index="1"   value="syl"></constructor-arg>
        <constructor-arg index="2" ref="food"></constructor-arg>
    </bean>
    <bean name="food" class="com.syl.ioc.constructor_injection.list.Food">
        <constructor-arg name="foodId" >
            <!--list属性可以做很多好玩的事-->
            <list>
                <value>001</value>
                <value>002</value>
            </list>
        </constructor-arg>
        <constructor-arg name="foodName" >
            <list>
                <value>炸酱面</value>
                <value>饺子</value>
            </list>
        </constructor-arg>
    </bean>
    
#### 与列表（list）使用数字下标来标识元素不同，映射（map）可以通过指定的键（key）来获取相应的值
*代码1-5*

    <bean id="user" class="com.syl.ioc.constructor_injection.map.User">
            <!--构造方法注入-->
            <!--要通过构造方法注入方式，为当前业务对象注入其所依赖的对象，
                需要使用 <constructor-arg>  -->
            <constructor-arg index="0"  value="001"></constructor-arg>
            <constructor-arg index="1"   value="syl"></constructor-arg>
            <constructor-arg index="2" ref="food"></constructor-arg>
        </bean>
        <bean name="food" class="com.syl.ioc.constructor_injection.map.Food">
            <constructor-arg name="foodMap">
                <map>
                    <entry key="001">
                        <value>炸酱面</value>
                    </entry>
                    <entry key="002">
                        <value>饺子</value>
                    </entry>
                </map>
            </constructor-arg>
        </bean>