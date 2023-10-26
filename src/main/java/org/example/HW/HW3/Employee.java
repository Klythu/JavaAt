package org.example.HW.HW3;

public class Employee implements Comparable<Employee>{
    public String name;
    public Integer age;
    public Double salary;
    public String department;
    public Employee(String name,Integer age,Double salary,String department){
        this.age=age;
        this.salary=salary;
        this.department=department;
        this.name=name;
    }
    public Employee(){
        this.name="Name";
        this.age=0;
        this.salary=0.0;
        this.department="department?";
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
    public void show(){
        StringBuilder showEmployee=new StringBuilder();
        showEmployee.append("Name: ").append(getName()).append(", Age: ").append(getAge()).append(", Salary: ").append(getSalary()).append(", Department: ").append(getDepartment());
        System.out.println(showEmployee);
    }

    @Override
    public int compareTo(Employee o) {
        if (this.department.compareTo(o.department)<0) {
            return (-1);
        } else if (this.department.compareTo(o.department)>0) {
            return (1);
        }
        return (0);

    }
}
