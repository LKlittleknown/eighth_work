package eighth_work;
public class Student {
    String id;
    String name;
    int year;
    Student(String id,String name,int year){
        this.id=id;
        this.name=name;
        this.year=year;
    }

    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }

    public int compareTo(Object s) {
        if(!(s instanceof Student)){
            throw new RuntimeException("不是Student对象");
        }
        Student stu = (Student)s;
        if(this.year > stu.year){
            return 1;
        }else if(this.year == stu.year){
            return this.name.compareTo(stu.name);
        }else{
            return -1;
        }
    }
}