package mySeHomework.homework1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testTriangle() {
		Triangle triangle = new Triangle();
		
		String type = triangle.triangle(3, 4, 6);
		assertEquals("不等边三角形", type);
	}

	@Test
	void equallaterialTriangle() {
		Triangle triangle = new Triangle();
		
		String type = triangle.triangle(3, 3, 3);
		assertEquals("等边三角形", type);
	}
	
	@Test
	void notTriangle() {
		Triangle triangle = new Triangle();
		
		String type = triangle.triangle(3, 3, 6);
		assertEquals("不是三角形", type);
	}
	
}
