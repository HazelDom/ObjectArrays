package objectArrays;

class Cocoa {
	
	String type = "Cocoa butter";
	
	public static void sayMmmmelting() {
		System.out.println("Mmmmelting");
	}
}


public class ObjectArrays {

	public static void main(String[] args) {
		
        Cocoa c1 = new Cocoa();
        Cocoa c2 = new Cocoa();
        Cocoa c3 = new Cocoa();
		
        Cocoa[] Cocoas = {c1,c2,c3};
        
        for(Cocoa c : Cocoas) {
        	c.sayMmmmelting();
        }
		
		int[] nums = {1,4,5};
	}

}
