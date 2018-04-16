package com.wyy.factory;


/**
 * 为创建一组相关或者是相互依赖的对象提供的一个接口，而不需要指定它们的具体类。
 *
 *   （1）多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。
 *   （2）一个抽象工厂类，可以派生出多个具体工厂类。
 *   （3）并且每个具体工厂类可以创建多个具体产品类的实例。
 */



/**
 * 产品类
 */
//产品engine接口（发动机）
 interface Engine {}

 class EngineA implements Engine{
    public EngineA(){
        System.out.println("制造-->EngineA");
    }
}
 class EngineB implements Engine{
    public EngineB(){
        System.out.println("制造-->EngineB");
    }
}

//产品aircondition接口（空调）
interface Aircondition {}
 class AirconditionA implements Aircondition{
    public AirconditionA(){
        System.out.println("制造-->AirconditionA");
    }
}
 class AirconditionB implements Aircondition{
    public AirconditionB(){
        System.out.println("制造-->AirconditionB");
    }
}


/**
 * 工厂类
 */

//创建工厂的接口
 interface AbstractFactoryy {
    //制造engine
    public abstract Engine createEngine();
    //制造aircondition
    public Aircondition createAircondition();
}

//为宝马320系列生产配件
 class FactoryBMW320 implements AbstractFactoryy{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
//为宝马523系列生产配件
 class FactoryBMW523 implements AbstractFactoryy {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}


//客户
public class App {
    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
    }
}