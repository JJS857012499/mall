package com.zd.common.config.logger;

import org.slf4j.LoggerFactory;

/**
 * Created by 江俊升 on 2018/10/9.
 */
public class Logger {

    private org.slf4j.Logger logger;

    public static final String DEFAULT_PROJECT_NAME = "Zhidian-Cloud";

    private Class<?> clazz;
    private String moduleName;

    private Logger(Class<?> clazz) {
        this(clazz, DEFAULT_PROJECT_NAME);
    }

    private Logger(Class<?> clazz, String moduleName) {
        logger = LoggerFactory.getLogger(clazz);
        this.clazz = clazz;
        this.moduleName = moduleName;
    }

    /**
     * 获得一个日志对象
     *
     * @param clazz
     * @return
     */
    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz);
    }

    /**
     * 获得一个日志对象，同时指定此日志的输出前缀
     *
     * @param clazz
     * @param moduleName
     * @return
     */
    public static Logger getLogger(Class<?> clazz, String moduleName) {
        return new Logger(clazz, moduleName);
    }

    /**
     * 获得日志对象的名称
     *
     * @return
     */
    public String getName() {
        return this.logger.getName();
    }

    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }

    public void trace(String msg) {
        this.logger.trace(setMsg(msg));
    }

    public void trace(String format, Object... arguments) {
        this.logger.trace(setMsg(format), arguments);
    }

    public void trace(String msg, Throwable t) {
        this.logger.trace(setMsg(msg), t);
    }

    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    public void debug(String msg) {
        this.logger.debug(setMsg(msg));
    }

    public void debug(String format, Object... arguments) {
        this.logger.debug(setMsg(format), arguments);
    }

    public void debug(String msg, Throwable t) {
        this.logger.debug(setMsg(msg), t);
    }

    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    public void info(String msg) {
        this.logger.info(setMsg(msg));
    }

    public void info(String format, Object... arguments) {
        this.logger.info(setMsg(format), arguments);
    }

    public void info(String msg, Throwable t) {
        this.logger.info(setMsg(msg), t);
    }

    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }

    public void warn(String msg) {
        this.logger.warn(setMsg(msg));
    }

    public void warn(String format, Object... arguments) {
        this.logger.warn(setMsg(format), arguments);
    }

    public void warn(String msg, Throwable t) {
        this.logger.warn(setMsg(msg), t);
    }

    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }

    public void error(String msg) {
        this.logger.error(setMsg(msg));
    }

    public void error(String format, Object... arguments) {
        this.logger.error(setMsg(format), arguments);
    }

    public void error(String msg, Throwable t) {
        this.logger.error(setMsg(msg), t);
    }

    /**
     * 格式化日志信息
     *
     * @param msg
     * @return
     */
    private String setMsg(String msg) {
        return msg;
    }
}
