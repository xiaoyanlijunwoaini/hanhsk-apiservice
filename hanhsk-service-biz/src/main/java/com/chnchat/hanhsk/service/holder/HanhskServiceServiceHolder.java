package com.chnchat.hanhsk.service.holder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HanhskServiceServiceHolder implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private static HanhskServiceServiceHolder serviceHolder;

    @Override
    public void afterPropertiesSet() throws Exception {
        serviceHolder=(HanhskServiceServiceHolder) applicationContext.getBean("hanhskServiceServiceHolder");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext= applicationContext;
    }

    public static HanhskServiceServiceHolder getInstance() {
        return serviceHolder;
    }

}
