package Traineespackage.Traineesproject;

import java.util.HashMap;

public class Trainee {

	String name;
	String vorname;
	HashMap<Integer, String> cars;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(String name, String vorname, HashMap<Integer, String> cars) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public HashMap<Integer, String> getCars() {
		return cars;
	}

	public void setCars(HashMap<Integer, String> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Trainee [" + (name != null ? "name=" + name + ", " : "")
				+ (vorname != null ? "vorname=" + vorname + ", " : "") + (cars != null ? "cars=" + cars : "") + "]";
	}

	
	
	
}
