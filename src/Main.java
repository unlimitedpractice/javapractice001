/**
 * メインクラス。
 * エントリー(アプリ実行時、はじめに実行されるメソッド)を内包するクラス
 * @author unlimitedpractice
 */
public class Main {
	/**
	 * メインメソッド。
	 * アプリ実行時、エントリーとなるメソッド(はじめに実行されるメソッド)
	 * @param args String[] コマンドライン引数(複数可)
	 */
	public static void main(String[] args) {
		// 表示メッセージ
		String displayMessage = "Hello, Java";

		// コマンドライン引数の文字列を追加メッセージとして連結する
		String externalMessage = "";
		for (String arg: args) {
			externalMessage += " " + arg;
		}

		// コンソールにメッセージ表示
		System.out.print(displayMessage + externalMessage);
	}
}
