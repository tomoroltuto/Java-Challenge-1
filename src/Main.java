
public class Main {
	public static void main(String[] args) {
		//HelloWorldを出力
		System.out.println("①　HelloWorldを出力");
		System.out.println("HelloWorld");
		System.out.println("");
		
		//HelloWorldを10回出力
		System.out.println("②　HelloWorldを10回出力");
		for (int i = 0; i <= 10; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("");
		
		//11回目はHelloだけ出力
		System.out.println("③　11回目はHelloだけ出力");
		for (int i = 0; i <= 10; i++) {
			if(i < 10) {
				System.out.println("HelloWorld");
			} else {
				System.out.println("Hello");
			}
		}
		System.out.println("");
		//三項演算子という記法を使って11回目はHelloだけ出力
		System.out.println("④　三項演算子を使用して11回目はHelloだけ出力");		
	    for(int i = 0; i <= 10; i++) {
	     System.out.println(i == 10 ? "Hello" : "Hello World"); 
	    }
	}
}
