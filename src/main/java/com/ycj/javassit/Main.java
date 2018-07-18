package com.ycj.javassit;

public class Main {


    public static void main(String[] args) {



        proxyTwo();

    }


    public static  void proxyTwo(){
        JavassistProxyFactory02 javassistProxyFactory02 = new JavassistProxyFactory02();
        try {
            Person proxy = javassistProxyFactory02.getProxy(Person.class);

            proxy.setAge(23234);
            proxy.setName("你好");
            System.out.println(proxy.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


    public static void proxyOne(){

        Person person = new Person();
        person.setAge(34243);
        person.setName("sdfsdf");
        JavassistProxyFactory<Person> javassistProxyFactory = new JavassistProxyFactory<Person>();

        javassistProxyFactory.setTarget(person);
        try {
            Person proxy = javassistProxyFactory.getProxy();
            proxy.setName("你好");
            System.out.println(proxy.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }



}
