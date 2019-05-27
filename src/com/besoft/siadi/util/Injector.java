/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.util;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author NERIO
 */
public abstract class Injector {

    private static ApplicationContext getApplicationContext() {
        return SpringConfigUtil.ctx;
    }

    public static <T> T obtenerServicio(Class<T> clase) {
        return obtener(clase, getApplicationContext());
    }

    private static <T> T obtener(Class<T> clase,
            ApplicationContext applicationContext) {
        AutowireCapableBeanFactory beanFactory = applicationContext
                .getAutowireCapableBeanFactory();
        return beanFactory.getBean(clase);
    }
}
