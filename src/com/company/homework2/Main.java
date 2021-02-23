package com.company.homework2;

import com.company.homework2.animal.Animal;
import com.company.homework2.car.Cab;
import com.company.homework2.car.Car;
import com.company.homework2.car.Helm;
import com.company.homework2.car.Wheel;
import com.company.homework2.robot.CoffeeRobot;
import com.company.homework2.robot.Robot;
import com.company.homework2.robot.RobotCoocker;
import com.company.homework2.robot.RobotDancer;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();
        System.out.println(robot.work());
        System.out.println(coffeeRobot.work());
        System.out.println(robotDancer.work());
        System.out.println(robotCoocker.work());

        Robot [] robots = {robot, coffeeRobot, robotDancer, robotCoocker};
        System.out.println();
        for (int i = 0; i < robots.length; i++) {
            System.out.println(robots[i].work());
        }

        Car car = new Car("audi", 2400,
                new Helm(42, "wood"),
                new Wheel(16, 7),
                new Cab(3.5,2.2, "Red"));

        car.setCab(new Cab(2.9,1.8,"Black"));
        System.out.println(car.getCab());
        car.setModel("Mercedes");
        System.out.println(car.getModel());
        car.changeModel("BMW");
        System.out.println(car.getModel());
        car.setWeight(2100);
        System.out.println(car.getWeight());
        car.changeWeight(2500);
        System.out.println(car.getWeight());
        car.setWheel(new Wheel(14,6));
        System.out.println(car.getWheel());
        car.setHelm(new Helm(38,"plastic"));
        System.out.println(car.getHelm());

        Animal animal = new Animal("Elephant",5,24);
        System.out.print("Назва тварини = " + animal.getName() + ", ");
        System.out.print("Швидкість тварини = " + animal.getSpeed() + " км/год, ");
        System.out.print("Вік тварини = " + animal.getAge() + " роки.");
        System.out.println();
        animal.setName("Eagle");
        animal.setSpeed(60);
        animal.setAge(23);

        System.out.print("Назва тварини = " + animal.getName() + ", ");
        System.out.print("Швидкість тварини = " + animal.getSpeed() + " км/год, ");
        System.out.print("Вік тварини = " + animal.getAge() + " роки.");
    }


}
