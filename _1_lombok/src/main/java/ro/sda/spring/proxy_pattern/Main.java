package ro.sda.spring.proxy_pattern;

public class Main {
    public static void main(String[] args) {
        MathOperator operator = new MathOperator();
        operator.add(2, 2);
    }
}