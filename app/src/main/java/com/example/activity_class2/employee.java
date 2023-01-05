package com.example.activity_class2;

public class employee {
    private String name;
    private String salary;
    private String time;

    public employee(){}
    public employee (String name, String salary,String time){
        this.name = name;
        this.salary = salary;
        this.time=time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String slary) {
        this.salary = salary;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
