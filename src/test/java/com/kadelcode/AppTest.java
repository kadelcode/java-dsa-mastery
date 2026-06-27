package com.kadelcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void appCanBeInstantiated() {
    App app = new App();

    assertNotNull(app);
  }
}
