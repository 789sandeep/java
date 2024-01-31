package class_practice;
class C{
	static int c=0;
	public C(){
		c++;
		System.out.println(c);
	}
}
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C cc=new C();
      C cc1=new C();
      C cc2=new C();
	}

}
