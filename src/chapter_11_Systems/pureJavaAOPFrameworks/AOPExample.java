package chapter_11_Systems.pureJavaAOPFrameworks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AOPExample {
    public static void main(String[] args) {
        OrderService target = new OrderServiceImpl();

        OrderService proxy = (OrderService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                new Class[]{OrderService.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before calling: " + method.getName());
                        Object result = method.invoke(target, args);
                        System.out.println("After calling: " + method.getName());
                        return result;
                    }
                }
        );

        proxy.placeOrder();
    }
}
