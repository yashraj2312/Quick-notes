/**
 * Test Class
 * @author Nitinkumar Gove
 *
 */
public class Test {
	public static void main(String a[]){
		
		HexConverter toHex = new HexConverter();
		OctalConverter toOctal = new  OctalConverter();
		
		toHex.setSuccessor(toOctal);
		toOctal.setSuccessor(toHex);
		
		toHex.convertNumber(104,"octal");
		toOctal.convertNumber(50, "hex");
	}
}
