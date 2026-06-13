package com.kadelcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    void appCanBeInstantiated() {
        App app = new App();

        assertNotNull(app);
    }
}
