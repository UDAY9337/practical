public class Parametercons {  // creating a class
	 String name;  // declaring string
     Parametercons (String name){
         this.name = name;   
     System.out.println("cons called");

     }
     public static void main(String [] args) {
         Parametercons obj=new Parametercons ("java");  // creating object
         Parametercons obj1=new Parametercons ("c++");  // creating object
         Parametercons obj2=new Parametercons ("c");    // creating object
     System.out.println("The name is" +  obj.name);
     System.out.println("The name is" +  obj1.name);
     System.out.println("The name is" +  obj2.name);
     }
     
}