package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary()); // Maaş güncellemesi yapılabilir
        System.out.println(getName() + " junior developer starts to working");
    }
}
