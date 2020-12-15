package org.example.spring.Example9.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component // stereo annotations
public class Address implements InitializingBean, DisposableBean {

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set: "+this.getClass());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("pre-destroy :"+this.getClass());
    }
}
