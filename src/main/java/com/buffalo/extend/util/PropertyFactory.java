package com.buffalo.extend.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ChrisChen on 2015/10/31.
 */
public class PropertyFactory {

    private Logger logger;

    protected PropertyFactory() {
        logger = Logger.getLogger(PropertyFactory.class);
    }

    /**
     * 通过properties文件名获取properties
     * propFileName不需要后缀名
     * @param propFileName
     * @return properties
     */
    protected Properties getPropertiesByFileName(String propFileName) {

        Properties properties = new Properties();

        InputStream inputStream = PropertyFactory.class.getResourceAsStream("properties/" + propFileName + ".properties");

        if(inputStream == null) { return null; }

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            logger.info(e.getMessage());
            return null;
        }

        return properties;
    }

}
