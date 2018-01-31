package prototype;

public class Address {
	
	/**
	 * 国家
	 */
	private String country;
	
	/**
	 * 地区
	 */
	private String area;

	public Address(String country, String area) {
		super();
		this.country = country;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", area=" + area + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
