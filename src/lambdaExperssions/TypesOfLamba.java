package lambdaExperssions;

interface D{
	void noParameter();
}

interface B{
	void singleParameter(String s);
}
interface C{
	void multipleParameter(int a,int b);
}


public class TypesOfLamba {
	public static void main(String[] args) {
		D a=()->System.out.println("Lambda exrpession with no parameter");
		a.noParameter();
		
		B b=(msg)->System.out.println(msg);
		b.singleParameter("Lambda expression with single parameter");
		
		C c=( int x,int y)->System.out.println("lambda expression with multiple parametrs "+x*y);
		c.multipleParameter(10, 20);
	}
}
