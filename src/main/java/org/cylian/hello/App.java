package org.cylian.hello;

/**
 * Hello world!
 *
 */
public class App {

	/**
	 * Une variable
	 */
	public static String ip = "localhost";

	/**
	 * Le point d'entrée
	 * @param args Les arguments
	 */
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

		String[] fields = { "a","z","e","r","t","y"};
		String out = "";

		for(int i=0; i<fields.length; i++){
			out = out + fields[i];
		}

			System.out.println( "Field said: " + out + " from "+ip);
    }
}