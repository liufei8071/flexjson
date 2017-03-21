/**
 * 
 */
package flexjson.test;

import java.util.HashMap;
import java.util.Map;

//import org.apache.commons.lang.builder.ToStringBuilder;

import flexjson.JSON;

public class TestClass2{
	private String name="testName2";
	private Map<String, TestClass3> mapOfJustice = new HashMap<String, TestClass3>();;
	
	public String getName() {
		return name;
	}

	@JSON
	public Map<String, TestClass3> getMapOfJustice() {
		return mapOfJustice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMapOfJustice(Map<String, TestClass3> mapOfJustice) {
		this.mapOfJustice = mapOfJustice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mapOfJustice == null) ? 0 : mapOfJustice.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClass2 other = (TestClass2) obj;
		if (mapOfJustice == null) {
			if (other.mapOfJustice != null)
				return false;
		} else if (!mapOfJustice.equals(other.mapOfJustice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	@Override
//	public String toString() {
//		return ToStringBuilder.reflectionToString(this);
//	}
	
}