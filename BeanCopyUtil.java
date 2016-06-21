/**
 * 
 */

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 * taiyi.web.jason
 *
 * 2016年4月21日
 */
public class BeanCopyUtil {
	/**
	 * 复制sorce bean的属性到destination,bean需要符合javabean setter and getter规范
	 * @param source 
	 * @param destination
	 */
	public static void copy(Object source,Object destination) {
		Class<?> sourceClass = source.getClass();
		Method[] sourceMethods = sourceClass.getMethods();
		for (Method method : sourceMethods) {
			String methodName = method.getName();
			if ((methodName.startsWith("get") || methodName.startsWith("is")) && !methodName.equals("getClass")) {
				try{
					Class<?> returnType = method.getReturnType();
					Object value = method.invoke(source, null);
					Class<? extends Object> br = destination.getClass();
					Method destMethod;
					if (methodName.startsWith("g")) {
						destMethod = br.getDeclaredMethod(methodName.replaceFirst("get", "set"),returnType);
					} else {
						destMethod = br.getDeclaredMethod(methodName.replaceFirst("is", "set"),returnType);
					}
					destMethod.invoke(destination, value);
				} catch(Exception e){
					System.out.println("warning : "+ methodName + " 不存在相对应的方法");
				}
				
			}

		}
	}
}
