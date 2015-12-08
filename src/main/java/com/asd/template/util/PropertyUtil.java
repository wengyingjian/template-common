/**
 * 
 */
package com.asd.template.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author <a href="mailto:wengyingjian@foxmail.com">翁英健</a>
 * @version 1.1 2015年12月8日
 * @since 1.1
 */
public class PropertyUtil {

    /**
     * @param resource 文件名(classpath下)
     * @param key 属性的key
     * @return 属性的value
     * @throws IOException
     */
    public static String getProperty(String resource, String key) throws IOException {
        Properties prop = new Properties();
        prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(resource));
        return prop.getProperty(key);
    }
}
