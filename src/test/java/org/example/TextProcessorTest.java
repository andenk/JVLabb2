package org.example;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TextProcessorTest {


    @Test
    public void VersialetTest(){

        TextProcessor textProcessor = new TextProcessor();

        assertTrue("AIK".equals(textProcessor.versialer("Aik")));
    }
    @Test
    public void GemenertTest(){

        TextProcessor textProcessor = new TextProcessor();
        assertTrue("aik".equals(textProcessor.gemener("Aik")));
        assertNotNull(textProcessor.gemener("Aik"));
    }
    @Test
    public void vendTest(){

        TextProcessor textProcessor = new TextProcessor();
        assertFalse("dif".equals(textProcessor.vend("AIK")));
    }

}
