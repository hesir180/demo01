package test;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czwj.domain.User;
import com.czwj.mapper.UserMapper;

/*@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatis {
	@Resource
	UserService userService;
	private static Logger logger = LoggerFactory.getLogger(TestMyBatis.class); 

	@Test
	public void testFindAll() {
		Gson gson=new Gson();
		User list = userService.getUserInformationById(66);
		logger.info(gson.toJson(list));
		
	}
	

}*/

public class TestMyBatis {
	
	public void sayHello(String name){
		System.err.println("hello"+name);
	}
	
	public static void main(String args[]) throws Exception
	{
		,
		Object service = Class.forName(TestMyBatis.class.getName()).newInstance();
		Method method = service.getClass().getMethod("sayHello", String.class);
		method.invoke(service, "zhangsan");
	}
	
	private ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(
				"bean.xml");
	}


	@Test
	public void testFindUserById() {
		UserMapper mapper = (UserMapper) ctx.getBean("UserMapper");
		
		User user = mapper.getUserInformationById(66);
		
		System.out.println(user);
	}

	
}
