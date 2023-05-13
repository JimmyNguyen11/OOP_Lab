package hust.soict.globalict.garbage;

public class GarbageCreator {
	   public static void main(String[] args) {
	       while (true) {
	           String s = new String();
	           for (int i = 0; i < 10000; i++) {
	               s += "Garbage ";
	           }
	           System.out.println("Garbage created");
	       }
	   }
	}

