public class Custodian extends Employee {

    public String equipment;

    public Custodian () {
    this.role = "custodian";
    this.salary = 40000;
  }

    public Custodian (String employeeName, String role, int salary, String equipment) {
    super(employeeName, role, salary);
    this.equipment = equipment;
  }

@Override
  void doWork(){
    System.out.println(this.employeeName + " the " + this.role + " grabs the " + this.equipment + " from the storage closet and begins to clean the store. \n");
  }
  
@Override
void getPaid(){
  System.out.println(this.employeeName + " is paid " + this.salary + " yearly, working as a " + this.role + ". \n"); 
  
}

@Override
void display(){
  System.out.println(this.employeeName + ", " + this.role + ", " +  "equipment: " + this.equipment + ", " + " salary: " + this.salary + "." );
}

  // setter for custodian name 
  @Override
  public void setName (String employeeName) {
    this.employeeName = employeeName;
  }

  // getter for custodian name
  @Override
  public String getName () {
    return employeeName;
  }

  // setter for equipment
  public void setEquipment (String equipment) {
    this.equipment = equipment;
  }

  // getter for equipment
  public String getEquipment (String equipment) {
    return equipment; 
  }
  
  // end of custodian class
}