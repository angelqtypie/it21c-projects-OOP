
package Student;
class student {
    String name;
    String section;
    String motto;
    
  public String getName(){
      return name;
  }
  public void setName(String name){
      this.name=name;
      
  }
    public String getSection(){
      return section;
  }
    public void setSection(String section){
    this.section=section;
    }
    public String getMotto(){
    return motto;
    }
  public void setMotto(String motto){
  this.motto=motto;
  }
  }

class Main {
    
public static void main(String[] args){

    student s = new student();
    
s.setName("Angel Justine Ballaso");
s.setSection("IT24C");
s.setMotto("Follow your heart and do what makes you happy");
System.out.println("Name: " + s.getName());
System.out.println("Section: " + s.getSection());
System.out.println("Motto: " + s.getMotto());
}
}