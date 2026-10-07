package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;



    public HRManager(long id, String name, double salary, int juniorCapacity, int midCapacity, int seniorCapacity) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorCapacity];
        this.midDevelopers = new MidDeveloper[midCapacity];
        this.seniorDevelopers = new SeniorDeveloper[seniorCapacity];
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR manager starts to working");
    }

    public void addEmployee(JuniorDeveloper developer) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                added = true;
                System.out.println("Junior developer added successfully to index: " + i);
                break;
            }
        }
        if (!added) {
            System.out.println("Junior developers array is full!");
        }
    }

    public void addEmployee(MidDeveloper developer) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                added = true;
                System.out.println("Mid developer added successfully to index: " + i);
                break;
            }
        }
        if (!added) {
            System.out.println("Mid developers array is full!");
        }
    }

    public void addEmployee(SeniorDeveloper developer) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                added = true;
                System.out.println("Senior developer added successfully to index: " + i);
                break;
            }
        }
        if (!added) {
            System.out.println("Senior developers array is full!");
        }
    }
}
