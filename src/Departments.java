import java.io.Serializable;

public class Departments implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5443694187006304476L;
	private String Id;
	private String Name;
	private String Location;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Departments() {
		super();
	}

	public Departments(String id, String name, String location) {
		super();
		Id = id;
		Name = name;
		Location = location;
	}

}
