public class RectangleParameter {
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
		}
   void calculateParameter() {
	   System.out.println(2*(length+width)); }
   }
class RectangleParameter1{
public static void main(String[] args) {
  RectangleParameter r1=new RectangleParameter();
  r1.insert(25,27);
  r1.calculateParameter();
 
	}
}