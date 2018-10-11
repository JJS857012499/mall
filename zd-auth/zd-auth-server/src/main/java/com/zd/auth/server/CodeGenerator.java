package com.zd.auth.server;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * Created by 江俊升 on 2018/10/11.
 */
public class CodeGenerator {

    public static void main(String[] args) throws Exception {

        //生成代码的表名
        String[] tables = new String[]{"client_service","client"};

        // 模板地址
        String templatePath = "./zd-auth/zd-auth-server/code_template";
        GeneratorFacade g = new GeneratorFacade();
        g.getGenerator().addTemplateRootDir(templatePath);
        g.getGenerator().setOutRootDir("./zd-auth/zd-auth-server");
        // 删除生成器的输出目录//
        //g.deleteOutRootDir();
        // 通过数据库表生成文件
        g.generateByTable(tables);

        // 自动搜索数据库中的所有表并生成文件,template为模板的根目录
        // g.generateByAllTable();
        // 按table名字删除文件
        //g.deleteByTable("table_name", "template");
    }
}
