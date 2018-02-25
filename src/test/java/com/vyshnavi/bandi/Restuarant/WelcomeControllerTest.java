package com.vyshnavi.bandi.Restuarant;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class WelcomeControllerTest {

    @Test
    public void testHello() {
        WelcomeController welcomeController = new WelcomeController("Hello message from test");
        assertThat(welcomeController.sayHello()).isEqualTo("Hello message from test");
    }
}
