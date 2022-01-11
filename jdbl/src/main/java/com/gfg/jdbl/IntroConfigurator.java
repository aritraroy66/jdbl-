package com.gfg.jdbl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntroConfigurator {

    @Bean
    Multiplier multiplier()
    {

        return new MultiplierImpl();
    }
    @Bean
    Calculator calculator()
    {
        return new Calculator(multiplier());
    }
}
