package com.scubetesting.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsSpringBootApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(JenkinsSpringBootApplicationTests.class);

    @Test
    void contextLoads() {
        log.info("AAA Test case executing!");
        log.info("AAA Test case executing Second Log!");
        assertTrue(true);
    }

}
