public class Cashier extends Employee {

  public int registerNumber;

  public Cashier () {
    this.role = "cashier";
    this.salary = 35000;
  }

  public Cashier (String employeeName, String role, int salary, int registerNumber) {
    super(employeeName, role, salary);
    this.registerNumber = registerNumber;
  }

@Override
void doWork(){
  System.out.println(this.employeeName + " the " + this.role + ", rings out customers quickly at register #" + this.registerNumber + ". \n");
}
  
@Override
void getPaid(){
  System.out.println(this.employeeName + " makes " + this.salary + " every year as a " + this.role + ". \n"); 
  
}

@Override
void display(){
  System.out.println(this.employeeName + ", " + this.role + ", " +  "register #" + this.registerNumber + ", " + "salary: " + this.salary + "." );
}

  // setter for cashier name
  @Override
  void setName (String employeeName) {
    this.employeeName = employeeName;
  }

  // getter for cashier name
  @Override
  String getName () {
    return this.employeeName;
  }

  // setter for register #
  public void setRegister (int registerNumber) {
    this.registerNumber = registerNumber;
  }

  // getter for register #
  public int getRegister () {
    return this.registerNumber;
  }
  
  // end of cashier class
}