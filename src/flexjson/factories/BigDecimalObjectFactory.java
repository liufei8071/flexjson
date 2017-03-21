package flexjson.factories;

import flexjson.ObjectFactory;
import flexjson.ObjectBinder;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class BigDecimalObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
    	if(null==value || "[]".equals(value) || "".equals(value)){
    		return null;
    	}
    	
    	BigDecimal rtn = new BigDecimal(value.toString());
        return rtn;
    }
}
