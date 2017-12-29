package com.ninggc.factory;

import cn.ninggc.util.Instance;
import org.apache.logging.log4j.Logger;

public class InstanceTest {
    Logger logger;

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getLoggerInstance() throws Exception {
        logger = Instance.getLoggerInstance(this.getClass().getName());
        logger.debug(getClass().getPackage());
    }

}