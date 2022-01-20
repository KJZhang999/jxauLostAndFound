public class User{
 private int id;
 private String name;
 int getId(){
   return id;
 } 
 void setId(int id){
 this.id=id;
 }
 String getName(){
 return name;
 }
 void setName(String name){
 this.name=name;
 }
 public User(int id,String name){
 this.id=id;
 this.name=name;
 }
 public User(){}
}
