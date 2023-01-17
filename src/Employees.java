import java.io.Serializable;

public class Employees implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4125768759904184151L;
	private String Id;
	private String Name;
	private String BirthDate;
	private String DeptNo;
	private Integer Phone;
	private String Email;

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

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getDeptNo() {
		return DeptNo;
	}

	public void setDeptNo(String deptNo) {
		DeptNo = deptNo;
	}

	public Integer getPhone() {
		return Phone;
	}

	public void setPhone(Integer phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Employees() {
		super();
	}

	public Employees(String id, String name, String birthDate, String deptNo, Integer phone, String email) {
		super();
		Id = id;
		Name = name;
		BirthDate = birthDate;
		DeptNo = deptNo;
		Phone = phone;
		Email = email;
	}

	@Override
	public String toString() {
		return "Employees [Id=" + Id + ", Name=" + Name + ", BirthDate=" + BirthDate + ", DeptNo=" + DeptNo + ", Phone="
				+ Phone + ", Email=" + Email + "]";
	}

}
