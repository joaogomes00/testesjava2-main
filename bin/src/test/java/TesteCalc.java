
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TesteCalc {
	
	public calculadora cal = new calculadora();
	@Test
	public void test() {
		
		double soma = cal.somar(2,3);
		assertEquals(56,soma);
	}

}
