public class Employee{
  private  int id;
    private  String name;
    private double salary;
    private String gender;
    private String[] taskList;


    Employee(){
        id=-1;
        name="Not defined";
        salary=-1;

        gender="not defined";
        taskList=new String[5];
    }

    Employee(String name,double salary,String gender){

        this(123,name,salary,gender);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTaskList() {
        return String.join(",",taskList);

    }

    public void setTaskList(String[] taskList) {
        this.taskList = taskList;
    }

    Employee(int id, String name, double salary, String address){
        this.id=id;
        this.name=name;

        this.salary=salary;
        this.gender=gender;
        taskList=new String[5];

    }

    public void doSomething(){
        System.out.println("Employee is doing some tasks");
    }
  public String printEmployeeDetails(){
        return "id:-->"+id+" name:-->"+name+" gender:-->"+gender+" salary:-->"+salary;
  }
   public static void raiseSalary(Employee emp,int percentage){
      
      double newSalary=emp.getSalary();
      newSalary+=newSalary*(percentage/100);
      emp.setSalary(newSalary);

   }

}
