/*Name: Om G. Panchwate
ID Code: 19CM044
Practical No: 11
AIM: Write a Program to demonstrate the use of Introspection in Java Bean
*/
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
class P11
{
public static void main(String[] args) {
	try
	{
		BeanInfo info = Introspector.getBeanInfo(P11.class);
		String[] s= Introspector.getBeanInfoSearchPath();
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		for (PropertyDescriptor x : pds) {
		System.out.println(x.getName());
		System.out.println(s);
	}
	}catch (Exception ex) {
	System.out.println(ex);
}
}
}