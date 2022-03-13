/**
 * 【重要总结】：==和equals的区别
 * 1、==可以比基础数据类型也可以比较引用数据类型，比较基础数据类型时比较的是具体的值，比较引用数据类型实际上比较的是内存地址。
 * 2、equals是Object的一个方法，默认的实现就是 ==。
 * 3、我们可以重写equals方法，是我们的特性需求，比如String就重写了equals方法，所以字符串调用equals比较的是每一个字符。
 * 4、finalize()
 * java提供finalize()方法，垃圾回收器准备释放内存的时候，会先调用finalize()。其实我们无法保证fnalize什么时候执行，执行的是否符合预期。使用不当会影响性能，导致程序死锁、挂起等。 垃圾回收和finalize()都是靠不住的，只要JVM还没有快到耗尽内存的地步，它是不会浪费时间进行垃圾回收的。
 * 对于fnalize，我们要明确它是不推荐使用的，业界实践一再证明它不是个好的办法，在Java 9中，甚至明确将Object.fnalize()标记为过时！如果没有特别的原因，不要实现fnalize方法，也不要指望利用它来进行资源回收。
 * 5、clone()
 * 克隆就是在内存里边赋值一个实例对象。但是Object的克隆方法只能浅拷贝。同时必须实现Cloneable接口。深拷贝我们以后会讲解。
 **/
package com.ykk;

public class Teacher {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Teacher teacher = (Teacher) o;

        return teacher.getId() == this.getId() && teacher.getName().equals(this.getName());
        //return teacher.getId() == this.getId() && teacher.getName() == this.getName();
        //return teacher.getId() == this.getId() && teacher.getName().equals(this.name);
    }

    //重写toString方法
    @Override
    public String toString() {

        return "Teacher:" + "{id:+" + this.getId() + ";name:" + this.getName() + "}";
    }

}
