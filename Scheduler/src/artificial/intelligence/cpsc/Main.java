package artificial.intelligence.cpsc;

public class Main {

	final static String INPUTFILENAME = "TestInput.txt";
	
	public static void main(String[] args) {
		Parser p = new Parser(INPUTFILENAME);
		
		System.out.println(p.getCourseSlots().toString());
		System.out.println(p.getLabSlots().toString());
		System.out.println(p.getCourses().toString());
		System.out.println(p.getLabs().toString());
	}
}
