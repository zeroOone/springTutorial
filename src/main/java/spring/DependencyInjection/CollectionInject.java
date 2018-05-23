package spring.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 注入集合类型
 * <list>一列值，允许重复</list>
 * <set>一组值，不允许重复</set>
 * <map>健值对集合， 键不能重复，值可以，而且类型不限定</map>
 * <props>键值对集合，键不能重复，值可以，并且类型限定为字符串类型</props> //props就是properties
 */
public class CollectionInject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressMap();
        jc.getAddressProp();
        jc.getAddressSet();
    }
}

class JavaCollection{
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProp;

    // a setter method to set List
    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }
    // prints and returns all the elements of the list.
    public List getAddressList() {
        System.out.println("List Elements :"  + addressList);
        return addressList;
    }
    // a setter method to set Set
    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }
    // prints and returns all the elements of the Set.
    public Set getAddressSet() {
        System.out.println("Set Elements :"  + addressSet);
        return addressSet;
    }
    // a setter method to set Map
    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }
    // prints and returns all the elements of the Map.
    public Map getAddressMap() {
        System.out.println("Map Elements :"  + addressMap);
        return addressMap;
    }
    // a setter method to set Property
    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
    // prints and returns all the elements of the Property.
    public Properties getAddressProp() {
        System.out.println("Property Elements :"  + addressProp);
        return addressProp;
    }
}
