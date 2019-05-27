/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author NERIO
 */
public class SpringConfigUtil {
    public static AnnotationConfigApplicationContext ctx;

    public SpringConfigUtil() {
        ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.besoft");
        ctx.refresh();
    }

    public ApplicationContext getApplicationContext() {
        return ctx;
    }
}
