public class Manager extends Employee {

    public String department;

    public Manager () {
    this.role = "manager";
    this.salary = 65000;
  }

    public Manager (String employeeName, String role, int salary, String department) {
    super(employeeName, role, salary);
    this.department = department; 
  }

@Override
  void doWork(){
    System.out.println(this.employeeName + " is a " + this.role + " and is responsible for overseeing the employees in the " + this.department + " department. \n");
  }
  
@Override
void getPaid(){
  System.out.println(this.employeeName + " has a yearly salary of " + this.salary + " for being a " + this.role + ". \n"); 
  
}

@Override
void display(){
  System.out.println(this.employeeName + ", " + this.role + ", " +  "department: " + this.department + ", " + "salary: " + this.salary + "." );
}

  // setter for manager name
  @Override
  public void setName (String employeeName) {
    this.employeeName = employeeName;
  }

  // getter for manager name
  @Override
  public String getName () {
    return employeeName;
  }

  // setter for department
  public void setDepartment (String department) {
    this.department = department; 
  }

  // getter for department
  public String getDepartment () {
    return department;
  }

  // end of manager class
}