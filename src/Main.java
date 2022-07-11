
public class Main {
	public static void main(String[] args) {
		//HelloWorldを出力
		System.out.println("①　HelloWorldを出力");
		System.out.println("HelloWorld");
		System.out.println("");
		
        //HelloWorldを10回出力
		System.out.println("②　HelloWorldを10回出力");
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("");
		
		//11回目はHelloだけ出力
		System.out.println("③　11回目はHelloだけ出力");
		for (int i = 0; i < 11; i++) {
			if(i < 10) {
				System.out.println("HelloWorld");
			} else {
				System.out.println("Hello");
			}
		}
	}
}
