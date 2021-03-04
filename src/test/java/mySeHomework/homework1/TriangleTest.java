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

}
