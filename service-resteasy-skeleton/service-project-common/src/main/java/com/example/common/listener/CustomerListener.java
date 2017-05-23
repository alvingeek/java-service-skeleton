package com.example.common.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author qinwen
 * @version V1.0
 * @date 2017/5/23 20:05
 */
public class CustomerListener implements ServletContextListener {

    public static final Logger LOGGER = LoggerFactory.getLogger(CustomerListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        // Set up a simple configuration that logs on the console.

        LOGGER.trace("Entering application.");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            LOGGER.error("Didn't do it.");
        }
        LOGGER.trace("Exiting application.");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
