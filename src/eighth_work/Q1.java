package eighth_work;
import java.util.*;

public class Q1 {
	static class BOOK{
		private String index;
		private String name;
		private double price;
		private String press;
		public BOOK(String index, String name, double price, String press) {
			this.index = index;
			this.name = name;
			this.price = price;
			this.press = press;
		}
		public String getIndex() {
			return this.index;
		}
		public String getName() {
			return this.name;
		}
		public double getPrice() {
			return this.price;
		}
		public String getPress() {
			return this.press;
		}
		public void setIndex(String index) {
			this.index = index;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void setPress(String press) {
			this.press = press;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		List<BOOK> books = new ArrayList<BOOK>();
		Map<String,BOOK> book_map = new HashMap<String, BOOK>();
		System.out.print("请输入书本数量：");
		int n = input.nextInt();
		for(int i = 0;i < n; i++) {
			String name, index, press, str;
			double price;
			System.out.print("编号：");
			index = input.next();
			System.out.print("书名：");
			name = input.next();
			System.out.print("价格：");
			price = input.nextDouble();
			System.out.print("出版社：");
			press = input.next();
			BOOK x = new BOOK(index, name, price, press);
			books.add(x);
			book_map.put(index, x);
		}
		Iterator it = books.iterator();
		while(it.hasNext()) {
			BOOK book = (BOOK) it.next();
			System.out.println("index:" + book.getIndex() + " name:"+ book.getName());
		}
		Iterator it1 = book_map.entrySet().iterator();
		while(it1.hasNext()) {
			Map.Entry entry = (Map.Entry)it1.next();
			System.out.println("index:" + entry.getKey() + " name:" 
			+ ((BOOK)entry.getValue()).getName()+ " price:" + 
					((BOOK)entry.getValue()).getPrice() + " press:"+
			((BOOK)entry.getValue()).getPress());
		}
	}
}
