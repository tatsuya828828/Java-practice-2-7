public class Main {
	public static void main(String[] args) {
		long f = Runtime.getRuntime().freeMemory()/ 1024/ 1024;
		System.out.println(f);
	}
}
