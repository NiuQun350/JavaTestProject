package mySeHomework.homework1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import cn.edu.ctgu.junitTest.Triangle;

class TriangleTest {

	@Test
	void testTriangle() {
		Triangle triangle = new Triangle();
		
		String type = triangle.classify(3, 4, 6);
		assertEquals("不等边三角形", type);
	}

	@Test
	void equallaterialTriangle() {
		Triangle triangle = new Triangle();
		
		String type = triangle.classify(3, 3, 3);
		assertEquals("等边三角形", type);
	}
	
	@Test
	void notTriangle() {
		Triangle triangle = new Triangle();
		
		String type = triangle.classify(3, 3, 6);
		assertEquals("非三角形", type);
	}
	
	@ParameterizedTest
	@CsvSource({
		"3,4,6,不等边三角形",
		"3,3,3,等边三角形",
		"3,3,6,非三角形"
	})
	void paramTriangle(int a, int b,int c,String expected) {
		Triangle triangle = new Triangle();
		
		String type = triangle.classify(a, b, c);
		
		assertEquals(expected, type);
	}
}
