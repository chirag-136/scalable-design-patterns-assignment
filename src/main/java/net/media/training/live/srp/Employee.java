package net.media.training.live.srp;



class Leaves{
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int[] leavesLeftPreviously;

    public Leaves(){}

    public Leaves(int totalLeaveAllowed,  int leavesTaken, int[] leavesLeftPreviously){
        this.totalLeaveAllowed = totalLeaveAllowed;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public void setTotalLeaveAllowed(int totalLeaveAllowed) {
        this.totalLeaveAllowed = totalLeaveAllowed;
    }

    public int getLeavesLeftPreviously(int yearIndex) {
        return leavesLeftPreviously[yearIndex];
    }

    public void setLeavesLeftPreviously(int yearIndex, int leaves) {
        this.leavesLeftPreviously[yearIndex] = leaves;
    }
}

class Address{
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public Address() {
    }

    public Address(String addressStreet, String addressCity, String addressCountry){
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
    }
}

class Manager extends Employee {
    public Manager(){
        super();
    }

    public Manager(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously){
        super(empId, monthlySalary, name, addressStreet, addressCity, addressCountry, leavesTaken, leavesLeftPreviously);
    }
}

public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;

    public String getName() {
        return name;
    }

    private String name;
    private Address address;

    private Leaves leaves;

    public int getEmpId() {
        return empId;
    }

    public static int getTotalLeavesAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public Address getAddress() {
        return address;
    }

    public Leaves getLeaves() {
        return leaves;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public int getThisYeard() {
        return thisYeard;
    }

    private int yearsInOrg;
    private int thisYeard;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = new Address(addressStreet, addressCity, addressCountry);
        this.leaves = new Leaves(TOTAL_LEAVES_ALLOWED, leavesTaken, leavesLeftPreviously);
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }


    //other method related to customer
}
