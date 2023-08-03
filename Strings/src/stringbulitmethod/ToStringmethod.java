package stringbulitmethod;

public class ToStringmethod {
	String name;

	public ToStringmethod( String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ToStringmethod[name=" + name + "]";

	}
}
