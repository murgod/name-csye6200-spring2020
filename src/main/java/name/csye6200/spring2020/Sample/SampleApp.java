package name.csye6200.spring2020.Sample;

public class SampleApp {

   public int sampleAdd(int a, int b) {
		return (a+b);
	}
	
    public static void main( String[] args )
    {
    	System.out.println( "This is a Sample code, For understanding purpose only" );
    	
    	SampleApp app = new SampleApp();
    	
    	int c = app.sampleAdd(2, 3);
    	
    	System.out.println("Sum ="+ c);
    }
}


