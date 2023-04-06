abstract class Employee {

  public String employeeName; 
  public String role;
  public int salary;

  public Employee () {

  }

  public Employee (String employeeName, String role, int salary) {
    this.employeeName = employeeName;
    this.role = role;
    this.salary = salary; 
  }

abstract void doWork();

abstract void getPaid();

abstract void display();

abstract String getName();

abstract void setName(String employeeName);

  // end of employee class
}