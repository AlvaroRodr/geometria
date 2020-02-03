import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testArea7() {
		Circulo_ARM c1=new Circulo_ARM(7,"circulo");
		assertEquals(7*7*3.1416,c1.area(),0.01);
	}

	@Test
	void testPerimetro7() {
		Circulo_ARM c1=new Circulo_ARM(7,"circulo");
		assertEquals(7*2*3.1416,c1.perimetro(),0.01);
		
	}
	
	@Test
	void testArea0() {
		Circulo_ARM c1=new Circulo_ARM(0,"circulo");
		assertEquals(0*0*3.1416,c1.area(),0.01);
	}

	@Test
	void testPerimetro0() {
		Circulo_ARM c1=new Circulo_ARM(0,"circulo");
		assertEquals(0*2*3.1416,c1.perimetro(),0.01);
		
	}
	
	@Test
	void testArea3() {
		Circulo_ARM c1=new Circulo_ARM(-3,"circulo");
		assertEquals(-3*-3*3.1416,c1.area(),0.01);
		
		
	}

	@Test
	void testPerimetro3() {
		Circulo_ARM c1=new Circulo_ARM(-3,"circulo");
		assertEquals(-18.8796,c1.perimetro(),0.001);
		
	}
}
