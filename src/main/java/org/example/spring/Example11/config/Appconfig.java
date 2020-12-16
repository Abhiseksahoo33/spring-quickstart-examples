package org.example.spring.Example11.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration// this is reuired to resolve $ symbols in @Value annotations, default values injected.
@PropertySource("person-data.properties")
public class Appconfig {
}
