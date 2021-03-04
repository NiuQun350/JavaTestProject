package mySeHomework.homework1;

public class Triangle {
	public String triangle(int a, int b, int c) {

		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c) {
				if (a == b || b == c || a == c) {
					if (a == b && b == c) {
						return "等边三角形";
					}
					return "等腰三角形";
				} else {
					return "不等边三角形";
				}
			} else {
				return "不是三角形";
			}
		} else {
			return "不是三角形";
		}
	}
}