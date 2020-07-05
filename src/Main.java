import java.util.Iterator;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		System.setProperty("rpg.version", "0.3");
		System.setProperty("rpg.author", "たかし");
		String ver  = System.getProperty("rpg.version");
		String author = System.getProperty("rpg.author");
		System.out.println("RPG: スッキリ魔王征伐 ver" + ver);
		System.out.println("Developed by" + author);
		System.out.print("ご利用のJavaバージョン:");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("[システムプロパティ一覧]");
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + "=");
			System.out.println(System.getProperty(key));
		}
	}
}
