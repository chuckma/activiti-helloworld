package cn.lucasma.activiti.helloworld;


import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/**
 * @Author Lucas Ma
 * @Date 2018/6/17 下午9:35
 * <p>
 * 启动类
 */
public class DemoMain {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DemoMain.class);

    public static void main(String[] args) {

        LOGGER.info("启动程序");
        // 创建流程引擎
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
        ProcessEngine processEngine = cfg.buildProcessEngine();
        String name = processEngine.getName();
        String version = ProcessEngine.VERSION;
        LOGGER.info("流程引擎名称{}，版本{}", name, version);
        // 部署流程定义文件
        // 启动运行流程
        // 处理流程任务
        LOGGER.info("结束程序");

    }
}
