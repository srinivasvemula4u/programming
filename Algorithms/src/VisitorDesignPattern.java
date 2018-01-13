/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
interface ICarElement {

    void accept(final ICarElementVisitor visitor);
}

interface ICarElementVisitor {

    void visit(final Body body);

    void visit(final Car car);

    void visit(final Engine engine);

    void visit(final Wheel wheel);
}

class Body implements ICarElement {

    @Override
    public void accept(final ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}

class Car implements ICarElement {

    ICarElement[] carElements;

    public Car() {
        carElements = new ICarElement[]{new Wheel("Front Left"), new Wheel("Front Right"), new Wheel("Back Left"), new Wheel("Back Right"),
            new Body(), new Engine()};
    }

    @Override
    public void accept(final ICarElementVisitor visitor) {
        for (final ICarElement elem : carElements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }

}

class Wheel implements ICarElement {

    String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(final ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}

class Engine implements ICarElement {

    @Override
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }

}

class CarElementDoVisitor implements ICarElementVisitor {

    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(final Car car) {
        System.out.println("Starting my car");
    }

    @Override
    public void visit(final Engine engine) {
        System.out.println("Starting my engine");
    }

    @Override
    public void visit(final Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");

    }
}

class CarElementPrintVisitor implements ICarElementVisitor {

    @Override
    public void visit(final Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(final Car car) {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(final Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(final Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }

}

public class VisitorDesignPattern {

    public static void main(String[] agrs) {

        final ICarElement car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }

}
