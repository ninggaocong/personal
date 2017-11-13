package com.ninggc.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Instance {

    /**
     * 获取Logger实例
     * 日志路径为"Logs/debug.log"
     * @param name
     * @return org.apache.logging.log4j.Logger
     */
    public static Logger getLoggerInstance(String name) {
        return LogManager.getLogger(name);
    }
}
