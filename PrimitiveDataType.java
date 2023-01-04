
public class PrimitiveDataType {

	public void pdt() {
		
	byte b = 127;
	System.out.println("Byte range is " + b);
	
	short s = 32767;
	System.out.println("Short range is " + s);
	
	int i = 454545454;
	System.out.println("Int range is " + i);
	
	long l = 5185132215454557884L;
	System.out.println("Long range is " + l);
	
	float f = 45e5f;
	System.out.println("Float range is " + f);
	
	double d = 4777474.8745746665656565d;
    System.out.println("Double value is " + d);
    
    boolean w = true ; 
    System.out.println("Boolean value is " + w);
    
    char c = 'A';
    System.out.println("Char value is " + c);
	}
	

	public static void main(String[] args) {
	
		System.out.println("PRIMITIVE DATA TYPES:");
		PrimitiveDataType a = new PrimitiveDataType();
		a.pdt();
	}
}
