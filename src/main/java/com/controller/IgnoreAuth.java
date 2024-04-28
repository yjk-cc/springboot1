package com.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//字写的注解
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreAuth {
}
