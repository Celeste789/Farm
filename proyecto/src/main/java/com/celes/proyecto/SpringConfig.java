package com.celes.proyecto;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.celes.proyecto")
@ComponentScan("com.celes.proyecto.entities")
@ComponentScan("com.celes.proyecto.controllers")
@ComponentScan("com.celes.proyecto.service")
@ComponentScan("com.celes.proyecto.repositories")
@ComponentScan("com.celes.proyecto.exceptions")
public class SpringConfig {
}
