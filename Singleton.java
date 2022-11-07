package Task;

import java.sql.*;

class Single {

	private Single() {
	};
	static Single obj;

	static Single getobject() {

		return obj = new Single();

	}

	void display() {
		System.out.println("hello");
	}
}

class Main {
	public static void main(String[] args) {

		// s=obj;
		output o = new output();
		Single s = Single.getobject();
		s.display();
		o.me();
	}
}

class output {
	Single b = Single.getobject();

	void me() {
		b.display();
	}
}
