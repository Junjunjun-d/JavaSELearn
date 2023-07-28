package com.dp.java.learn.log.jul;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

/**
 * JUL日志框架使用方式总结（原理解析）
 * 1.初始化LogManager
 * LogManager加载logging.properties配置文件
 * 添加Logger到LogManager
 * 2.从单例的LogManager获取Logger
 * 3.设置日志级别Level，在打印的过程中使用到了日志记录的LogRecord类
 * 4.Filter作为过滤器提供了日志级别之外更细粒度的控制
 * 5.Handler日志处理器，决定日志的输出位置，例如控制台、文件...
 * 6.Formatter是用来格式化输出的
 */
public class JULDemo001 {

    @Test
    public void test01() {
        Logger logger = Logger.getLogger("com/dp/java/learn/log/jul/JULDemo001.java");
        logger.info("logger.info");
        logger.log(Level.INFO, "INFO");
        logger.log(Level.WARNING, "WARNING");


        String name = "JULTest";
        int length = 7;

        logger.log(Level.INFO, "name: {0}, length: {1}", new Object[]{name, length});
    }


    /**
     * 日志级别(高->低)：SEVERE,WARNING,INFO(默认级别),CONFIG,FINE,FINER,FINEST
     * 只会显示默认级别以上的日志
     */
    @Test
    public void test02() {
        Logger logger = Logger.getLogger("com/dp/java/learn/log/jul/JULDemo001.java");

        logger.severe("severe信息");
        logger.warning("warning信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");

    }

    /**
     * 自定义日志级别
     */
    @Test
    public void test03() throws IOException {
        Logger logger = Logger.getLogger("com/dp/java/learn/log/jul/JULDemo001.java");

        //1、关闭默认级别
        logger.setUseParentHandlers(false);

        //2、创建处理器Handler
        //日志输出到控制台
        ConsoleHandler consoleHandler = new ConsoleHandler();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);

        //日志输出到本地  Logger可以持有多个处理器Handler
        FileHandler fileHandler = new FileHandler("E:\\logs\\JULDemo001.log");
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);

        //3、设置日志的打印级别:此处必须将日志记录器和处理器的级别进行统一的设置，才会达到日志显示相应级别的效果
        // 日志界别以logger为准，向上显示
        consoleHandler.setLevel(Level.INFO);
        logger.setLevel(Level.ALL);
        fileHandler.setLevel(Level.FINE);

        logger.severe("severe信息");
        logger.warning("warning信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");

    }

}
