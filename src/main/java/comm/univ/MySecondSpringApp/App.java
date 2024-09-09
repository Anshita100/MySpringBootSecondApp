package comm.univ.MySecondSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Employee;
import com.univ.config.EmployeeConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext apx=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee s1=(Employee) apx.getBean("getData");
        System.out.print(s1);
        
    }
}
