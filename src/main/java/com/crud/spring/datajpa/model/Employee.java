package com.crud.spring.datajpa.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

enum Sex {
    MALE, FEMALE;
}

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private int number;

    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "DOB")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date DOB;
    @Column(name = "age")
    private int age;
    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(name = "citizenDesc")
    private String citizenDesc;
    @Column(name = "hispanicLatino")
    private String hispanicLatino;
    @Column(name = "raceDesc")
    private String raceDesc;
    @Column(name = "dateOfHire")
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfHire;
    @Column(name = "dateOfTermination")
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfTermination;
    @Column(name = "reasonOfTerm")
    private String reasonOfTerm;
    @Column(name = "status")
    private String status;


    @Column(name = "payRate")
    private double payRate;
    @Column(name = "managerName")
    private String ManagerName;
    @Column(name = "empSource")
    private String empSource;
    @Column(name = "performanceScore")
    private String performanceScore;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maritalstatus_id", nullable = false)
    private MaritalStatus maritalStatus;

    public Employee() {
    }

    public Employee(String name, int number, String state, String zip,
                    Date DOB, int age, Sex sex, MaritalStatus maritalStatus, String citizenDesc,
                    String hispanicLatino, String raceDesc, Date dateOfHire, Date dateOfTermination,
                    String reasonOfTerm, String status, Position position, double payRate,
                    String managerName, String empSource, String performanceScore, Department department) {
        this.name = name;
        this.number = number;
        this.state = state;
        this.zip = zip;
        this.DOB = DOB;
        this.age = age;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.citizenDesc = citizenDesc;
        this.hispanicLatino = hispanicLatino;
        this.raceDesc = raceDesc;
        this.dateOfHire = dateOfHire;
        this.dateOfTermination = dateOfTermination;
        this.reasonOfTerm = reasonOfTerm;
        this.status = status;
        this.position = position;
        this.payRate = payRate;
        this.ManagerName = managerName;
        this.empSource = empSource;
        this.performanceScore = performanceScore;
        this.department = department;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex   sex) {
        this.sex = sex;
    }


    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCitizenDesc() {
        return citizenDesc;
    }

    public void setCitizenDesc(String citizenDesc) {
        this.citizenDesc = citizenDesc;
    }

    public String getHispanicLatino() {
        return hispanicLatino;
    }

    public void setHispanicLatino(String hispanicLatino) {
        this.hispanicLatino = hispanicLatino;
    }

    public String getRaceDesc() {
        return raceDesc;
    }

    public void setRaceDesc(String raceDesc) {
        this.raceDesc = raceDesc;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public Date getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(Date dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public String getReasonOfTerm() {
        return reasonOfTerm;
    }

    public void setReasonOfTerm(String reasonOfTerm) {
        this.reasonOfTerm = reasonOfTerm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String managerName) {
        ManagerName = managerName;
    }

    public String getEmpSource() {
        return empSource;
    }

    public void setEmpSource(String empSource) {
        this.empSource = empSource;
    }

    public String getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(String performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Override
    public String toString() {
//        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
        return "Employee [id="+id+
        ", name="+name+
        ", number="+number+"]";
    }
}
