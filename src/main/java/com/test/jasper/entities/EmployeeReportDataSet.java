package com.test.jasper.entities;

public class EmployeeReportDataSet {

    private Integer id;
    private String name;
    private String birthday;
    private String departament;
    private Double salary;

    public EmployeeReportDataSet() {
    }

    public EmployeeReportDataSet(Integer id, String name, String birthday, String departament, Double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.departament = departament;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
