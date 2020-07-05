
public class Main {
	public static void main(String[] args) {
		// データが正しくない時
		int a = 3;
		int b = 2;
		int c = a-b;
		if(c == 8) {
			System.out.println("答えが間違っています。異常終了します");
			System.exit(1);
		}
		System.out.println("正常終了しました");
	}
}
