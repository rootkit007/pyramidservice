package net.zeltins.pyramid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PyramidLogicTest {

	@Test
	void testIsPyramidWord() {
		
		assertIsPyramidWord("banana");
		assertIsPyramidWord("");
		assertIsPyramidWord("b");
		assertIsPyramidWord("abbcccdddd");	
		
		assertIsNotPyramidWord("cup");
		assertIsNotPyramidWord("asjkdjhcq	32890c749ry3x9udzoawjdzpoahsduipoqnhwuidxhqinxhdqxgrnq73o8xtrynofdisfgnoafxgoayfgxoazxgfagfzxgxfdzgukyfgukyganxukyagsfukyagukyafgxbudygduasgdfksfdxkasxgubkybdxjdgjasdxgauk");
	}
	
	private void assertIsPyramidWord(String s) {
		assertTrue(PyramidLogic.IsPyramidWord(s), s + " is not pyramid word, but should be!");
	}

	private void assertIsNotPyramidWord(String s) {
		assertFalse(PyramidLogic.IsPyramidWord(s), s + " is a pyramid word, but should not be!");
	}
}
