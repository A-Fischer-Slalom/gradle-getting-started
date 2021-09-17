package com.example.heroku;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HerokuApplicationTests {

	@Test public void someLibraryMethodReturnsTrue() {
        HerokuApplication classUnderTest = new HerokuApplication();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

}

