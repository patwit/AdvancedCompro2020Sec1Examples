class Student{
 protected String name;

    Student(){
        this.name = "Superman";
    }

    Student(String name){
        this.name = name;
    }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 @Override
 public String toString() {
     // TODO Auto-generated method stub
     return "Name : " + getName();
 }

}