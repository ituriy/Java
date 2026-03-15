package ru.ituriy.mypackage;

public class Main {
    public static void main(String[] args) {

        MutablePoint originalPoint = new MutablePoint(10, 20);

        ImmutableContainer container = new ImmutableContainer(originalPoint);

        System.out.println("До изменений: " + container);

        originalPoint.setX(100);
        originalPoint.setY(200);
        System.out.println("После изменения оригинала: " + container);

        MutablePoint pointFromContainer = container.getPoint();
        pointFromContainer.setX(999);
        pointFromContainer.setY(888);
        System.out.println("После попытки изменения через геттер: " + container);
    }
}
