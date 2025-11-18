package com.lcl.第十二章.复合模式;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
        AbstractGooseFactory abstractGooseFactory = new GooseFactory();
        duckSimulator.simulate(abstractDuckFactory, abstractGooseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
        Quackable mallDuck = duckFactory.createMallarDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = gooseFactory.createGoose();

        Flock flock = new Flock();

        flock.add(mallDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(mallDuck);
        flock.add(rubberDuck);
        flock.add(gooseAdapter);

        Flock flockMallards = new Flock();

        Quackable mallarDuck = duckFactory.createMallarDuck();
        Quackable mallarDuck1 = duckFactory.createMallarDuck();
        Quackable mallarDuck2 = duckFactory.createMallarDuck();
        Quackable mallarDuck3 = duckFactory.createMallarDuck();

        flockMallards.add(mallarDuck);
        flockMallards.add(mallarDuck1);
        flockMallards.add(mallarDuck2);
        flockMallards.add(mallarDuck3);

        flock.add(flockMallards);
        System.out.println("\nDuck Simulator:Whole Flock Simulation");
        simulate(flock);
        System.out.println("\nDuck Simulator:Mallard Flock Simulation");
        simulate(flockMallards);


        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
