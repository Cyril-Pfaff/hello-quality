package org.cylian.hello;

/**
 * Hello world!
 *
 */
public class App 
{

	private int secure1;
	//private int secure2;
 private int secure3;
	
	/**
	 * Une variable
	 */
	public static String ip = "127.0.0.1";
	public static String local = "10.0.0.1";
	String enum = "foo";

	private static void buz(String x) {}

	/**
	 * Le point d'entrée
	 * @param args Les arguments
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
System.out.println( "Hello World!" );
		
		String[] fields = { "a","z","e","r","t","y", };
		String out = "";
		
		buz("Howdy");
		buz("Howdy");
		buz("Howdy");
		buz("Howdy");
		buz("Howdy");
		buz("Howdy");
		buz("Howdy");
		buz("Howdy");
	  
		try {

			for(int i=0; i<fields.length; i++)
			{
				out = out + fields[i];
			}
					} catch (NullPointerException e) {
            e.printStackTrace();
			e = new NullPointerException(); // not recommended
        }

System.out.println( "Field said: " + out + " from "+ip);
    }
}
