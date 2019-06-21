package com.cute.employeelist;

class Users {
    private String id;
    private String name;
    private String date;
    private String salary;

    public Users(){ }

    public Users(String id, String name, String date, String salary) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
