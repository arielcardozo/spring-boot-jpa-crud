package com.crud.spring.datajpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "testEmployee")
public class TestEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private int number;

    @Column(name = "state")
    private String state;
    @Column(name = "Zip")
    private int zip;
    @Column(name = "DOB")
    private Date DOB;
    @Column(name = "Age")
    private int age;
    @Column(name = "Sex")
    private String sex;
    @Column(name = "MaritalDesc")
    private String maritalDesc;
    @Column(name = "CitizenDesc")
    private String citizenDesc;
    @Column(name = "HispanicLatino")
    private String hispanicLatino;
    @Column(name = "RaceDesc")
    private String raceDesc;
    @Column(name = "dateOfHire")
    private Date dateOfHire;
    @Column(name = "dateOfTermination")
    private Date dateOfTermination;
    @Column(name = "ReasonOfTerm")
    private String reasonOfTerm;
    @Column(name = "active")
    private boolean active;
    @Column(name = "Department")
    private String department;
    @Column(name = "Position")
    private String position;
    @Column(name = "PayRate")
    private String payRate;
    @Column(name = "ManagerName")
    private String ManagerName;
    @Column(name = "EmpSource")
    private String empSource;
    @Column(name = "PerformanceScore")
    private String performanceScore;

    protected TestEmployee() {
    }

    private TestEmployee(String name, int number, String state, int zip, Date DOB, int age, String sex, String maritalDesc, String citizenDesc, String hispanicLatino, String raceDesc, Date dateOfHire, Date dateOfTermination, String reasonOfTerm, boolean active, String department, String position, String payRate, String managerName, String empSource, String performanceScore) {
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
        this.active = active;
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

    public int getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public Date getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getMaritalDesc() {
        return maritalDesc;
    }

    public String getCitizenDesc() {
        return citizenDesc;
    }

    public String getHispanicLatino() {
        return hispanicLatino;
    }

    public String getRaceDesc() {
        return raceDesc;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public Date getDateOfTermination() {
        return dateOfTermination;
    }

    public String getReasonOfTerm() {
        return reasonOfTerm;
    }

    public boolean isActive() {
        return active;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getPayRate() {
        return payRate;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public String getEmpSource() {
        return empSource;
    }

    public String getPerformanceScore() {
        return performanceScore;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    //Builder
    public static class EmployeeBuilder {
        private String name;
        private int number;
        private String state;
        private int zip;
        private Date DOB;
        private int age;
        private String sex;
        private String maritalDesc;
        private String citizenDesc;
        private String hispanicLatino;
        private String raceDesc;
        private Date dateOfHire;
        private Date dateOfTermination;
        private String reasonOfTerm;
        private boolean active;
        private String department;
        private String position;
        private String payRate;
        private String managerName;
        private String empSource;
        private String performanceScore;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public EmployeeBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public EmployeeBuilder setZip(int zip) {
            this.zip = zip;
            return this;
        }

        public EmployeeBuilder setDOB(Date DOB) {
            this.DOB = DOB;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public EmployeeBuilder setMaritalDesc(String maritalDesc) {
            this.maritalDesc = maritalDesc;
            return this;
        }

        public EmployeeBuilder setCitizenDesc(String citizenDesc) {
            this.citizenDesc = citizenDesc;
            return this;
        }

        public EmployeeBuilder setHispanicLatino(String hispanicLatino) {
            this.hispanicLatino = hispanicLatino;
            return this;
        }

        public EmployeeBuilder setRaceDesc(String raceDesc) {
            this.raceDesc = raceDesc;
            return this;
        }

        public EmployeeBuilder setDateOfHire(Date dateOfHire) {
            this.dateOfHire = dateOfHire;
            return this;
        }

        public EmployeeBuilder setDateOfTermination(Date dateOfTermination) {
            this.dateOfTermination = dateOfTermination;
            return this;
        }

        public EmployeeBuilder setReasonOfTerm(String reasonOfTerm) {
            this.reasonOfTerm = reasonOfTerm;
            return this;
        }

        public EmployeeBuilder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public EmployeeBuilder setPayRate(String payRate) {
            this.payRate = payRate;
            return this;
        }

        public EmployeeBuilder setManagerName(String managerName) {
            this.managerName = managerName;
            return this;
        }

        public EmployeeBuilder setEmpSource(String empSource) {
            this.empSource = empSource;
            return this;
        }

        public EmployeeBuilder setPerformanceScore(String performanceScore) {
            this.performanceScore = performanceScore;
            return this;
        }

        public TestEmployee build(){
            return new TestEmployee(name, number, state, zip, DOB, age, sex, maritalDesc, citizenDesc, hispanicLatino, raceDesc, dateOfHire,
                    dateOfTermination, reasonOfTerm, active, department, position, payRate, managerName, empSource, performanceScore);
        }
    }
}
