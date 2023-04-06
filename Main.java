import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // ArrayList seeds for employeeList
    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    Cashier cashier1 = new Cashier("LUCY HALE", "cashier", 35000, 1);
    Custodian custodian1 = new Custodian("JOHNNY SILVERHAND", "custodian", 40000, "broom");
    Manager manager1 = new Manager("AURTHUR MORGAN", "manager", 65000, "sales");

    employeeList.add(cashier1);
    employeeList.add(custodian1);
    employeeList.add(manager1);

    // ///////
    // for each loop to print elements in arrayList
    System.out.println("\nCurrent employees in roster: ");

    for (Employee employee : employeeList) {
      employee.display();
    }

    // ///////
    // using while loop and checking input for valid name with no numbers
    System.out.println("\nPlease enter the new employees name:");

    while (!input.hasNext("[A-Za-z ]+")) {
      System.out.println("Invalid input! Only use letters! \n");
      input.nextLine();
    }
    String employeeName = input.nextLine().toUpperCase();
    System.out.println();
    System.out.println("Thank you. " + employeeName + " is now entered. ");

    // ///////
    // switch statement to select role of new hire
    System.out.println("\nPlease select the role of the new hire:\n" + "1) Cashier\n" + "2) Custodian\n"
        + "3) Manager\n" + " # only, any other input will be invalid.");

      int roleSelection = input.nextInt();

    boolean selectionMade = true;

    do {
      selectionMade = true;

      switch (roleSelection) {
        case 1:
          Cashier cashier3 = new Cashier();

          System.out.println("\nWhat will be the register # this employee will be stationed at? ");
          int registerNumber = input.nextInt();

          cashier3.setName(employeeName);
          cashier3.setRegister(registerNumber);
          employeeList.add(cashier3);

          System.out.println();
          cashier3.doWork();
          cashier3.getPaid();
          break;

        case 2:
          Custodian custodian3 = new Custodian();

          System.out.println("\nWhat equipment will this employee use? ");
          String equipment = input.next();

          custodian3.setName(employeeName);
          custodian3.setEquipment(equipment);
          employeeList.add(custodian3);

          System.out.println();
          custodian3.doWork();
          custodian3.getPaid();
          break;

        case 3:
          Manager manager3 = new Manager();

          System.out.println("\nWhat department will this employee oversee? ");
          String department = input.next();

          manager3.setName(employeeName);
          manager3.setDepartment(department);
          employeeList.add(manager3);

          System.out.println();
          manager3.doWork();
          manager3.getPaid();
          break;

        default:
          System.out
              .println("\nPlease choose a valid input to register the role for the new hire! \nTry again, # only.");
          selectionMade = false;
          roleSelection = input.nextInt();
          break;
        // switch statement end
      }
      // end of do block
    } while (!selectionMade);
    System.out.println("\nCurrent employees in roster: ");
    for (Employee employee : employeeList) {
      employee.display();
    }

    // ///////
    // remove employee and update arrayList
    System.out.println("\nWould you like to remove an employee? Please input: \n" + "1) Yes\n" + "2) No\n"
        + " # only, any other input will be invalid.");

    int removeMenu = input.nextInt();
    // consumes extra line from weird nextInt behavior so following input is read
    input.nextLine();

    boolean removeSelection = true;

    do {
      switch (removeMenu) {
        case 1:
          System.out.println("\nPlease enter the full name of the employee you would like to remove from the roster.");
          String removeEmployee = input.nextLine().toUpperCase();

          // looping arrayList using iterator
          Iterator<Employee> it = employeeList.iterator();

          // .hasNext(): return true if iterator has more elements, else it returns false (when reaching end of list or error)
          while (it.hasNext()) {

            // .next(): return the next element in the loop
            Employee nextEmployee = it.next();

            if (removeEmployee.equals(nextEmployee.getName())) {
              it.remove();

              System.out.println("\n" + removeEmployee + " was successfully removed from the roster.");

              System.out.println("\nCurrent employees in roster: ");

              for (Employee employee : employeeList) {
                employee.display();
              }
              System.exit(0);
              // end of if block
            } 
            // end of while iterator block
           } 
          // if user input doesn't match element in arrayList, print exception message to user
           try { 
             while (it.hasNext()) {
               Employee nextEmployee = it.next();
              if (!removeEmployee.equals(nextEmployee.getName())) {
                throw new NoSuchElementException(); 
              // end if block
              }
              // end of while loop
             }
             // end try block
            } 
           catch (NoSuchElementException e) {
             System.out.println("No employee bye that name exists. Goodbye.");
            }
          finally {
            System.out.println("\nNo employee bye that name exists. Goodbye.");
          }
          break;

        case 2:
          System.out.println("\nNo employees were removed. Here is the current roster:\n");
          for (Employee employee : employeeList) {
            employee.display();
          }
          break;

        default:
          System.out.println("\nPlease choose a valid input from the menu. \nTry again. \n");
          System.out.println("Remove an employee from the roster? \n" + "1) Yes\n" + "2) No\n"
              + " # only, any other input will be invalid. \n");
          removeMenu = input.nextInt();
          // consumes extra line from weird nextInt behavior so following input is read
          input.nextLine();
          removeSelection = false;
          break;
        // switch statement end
      }
      // do while loop ends
    } while (!removeSelection);

    // close scanner object
    input.close();
    
    // end of method
  }
  // end of class
}
