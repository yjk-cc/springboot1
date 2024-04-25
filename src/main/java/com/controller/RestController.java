package com.controller;

import java.lang.annotation.*;

@Target(ElementType.METHOD)//字写的注解
@Retention(RetentionPolicy.RUNTIME)
@interface IgnoreAuth {
}

public @interface RestController {
}
