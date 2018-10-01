public class Person{
  private String getName = null;
  private int age = 0;

  public Person(){}


  public Person(String name,int age){
	this.getName = name;
	this.age =age;
  }
  public String getName(){
	  return this.getName;
  }
  public void setName(String name){
	  this .getName =name;
  }
}

