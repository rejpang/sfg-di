package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstrutorInjectedControllerTest {

    ConstrutorInjectedController construtorInjectedController;

    @BeforeEach
    void setUp() {
        construtorInjectedController = new ConstrutorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(construtorInjectedController.getGreeting());
    }
}