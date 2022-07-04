public class Problemthiskeyword {
	int rollno;
    String name;
    float fee;
    Problemthiskeyword(int rollno,String name, float fee){
   	 this.rollno=rollno;
   	 this.name=name;
   	 this.fee=fee;
    }
    void display() {
   	 System.out.println(rollno+" "+name+" "+fee  );
    }
    public class Problemthiskeyword1{
   	 public static void main(String[] args) {
   		Problemthiskeyword s1 = new Problemthiskeyword(10,"Jaita",5000);
   		Problemthiskeyword s2 = new Problemthiskeyword(11,"Rupa",4000);
   		 s1.display();
   		 s2.display();
   		 }
   	 }
}