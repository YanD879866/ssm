package yand.util.dyDataBase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * @author yanzz
 * datasource 
 * 
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)
public @interface DataSource {
	String value();
}
