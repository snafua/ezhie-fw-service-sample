package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesReadTest {

	@Value("${test}")
	public String test;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath*:test/PropertiesReadTest.xml"
		});
		
		PropertiesReadTest test = context.getBean("propertiesReadTest", PropertiesReadTest.class);
		
		System.out.println(test.test);
		
		//test.readProperties();
	}

	public void readProperties() throws IOException {
		String properties = "src/main/resources/test.properties";
        FileInputStream fis = new FileInputStream(properties);
        
        Properties props = new Properties();
        props.load(new BufferedInputStream(fis));
        String msg = props.getProperty("test");
        
        System.out.println(msg);
	}
}
