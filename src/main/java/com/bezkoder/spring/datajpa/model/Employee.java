package com.bezkoder.spring.datajpa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

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
    private String sex;
    @Column(name = "maritalDesc")
    private String maritalDesc;
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
    @Column(name = "Department")
    private String department;
    @Column(name = "position")
    private String position;
    @Column(name = "payRate")
    private double payRate;
    @Column(name = "managerName")
    private String ManagerName;
    @Column(name = "empSource")
    private String empSource;
    @Column(name = "performanceScore")
    private String performanceScore;

    public Employee() {
    }

    public Employee(String name, int number, String state, String zip, Date DOB, int age, String sex, String maritalDesc, String citizenDesc, String hispanicLatino, String raceDesc, Date dateOfHire, Date dateOfTermination, String reasonOfTerm, String status, String department, String position, double payRate, String managerName, String empSource, String performanceScore) {
        this.name = name;
        this.number = number;
        this.state = state;
        this.zip = zip;
        this.DOB = DOB;
        this.age = age;
        this.sex = sex;
        this.maritalDesc = maritalDesc;
        this.citizenDesc = citizenDesc;
        this.hispanicLatino = hispanicLatino;
        this.raceDesc = raceDesc;
        this.dateOfHire = dateOfHire;
        this.dateOfTermination = dateOfTermination;
        this.reasonOfTerm = reasonOfTerm;
        this.status = status;
        this.department = department;
        this.position = position;
        this.payRate = payRate;
        ManagerName = managerName;
        this.empSource = empSource;
        this.performanceScore = performanceScore;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalDesc() {
        return maritalDesc;
    }

    public void setMaritalDesc(String maritalDesc) {
        this.maritalDesc = maritalDesc;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
