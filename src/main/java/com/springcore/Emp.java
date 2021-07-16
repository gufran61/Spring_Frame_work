package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Emp {
private List<String>friends;
private Map<String, Integer>feesStructure;
private Properties prop;


@Override
public String toString() {
	return "Emp [friends=" + friends + ", feesStructure=" + feesStructure + ", prop=" + prop + "]";
}

public Properties getProp() {
	return prop;
}

public void setProp(Properties prop) {
	this.prop = prop;
}

public Map<String, Integer> getFeesStructure() {
	return feesStructure;
}

public void setFeesStructure(Map<String, Integer> feesStructure) {
	this.feesStructure = feesStructure;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

}
