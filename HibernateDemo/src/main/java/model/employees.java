package model;

import java.util.Date;
import java.util.Set;

public class employees {
	private String Address;
	private Date BirthDate;
	private String City;
	private String Country;
	private int EmployeeID;
	private String Extension;
	private String FirstName;
	private Date HireDate;
	private String HomePhone;
	private String LastName;
	private String Notes;
	private byte[] Photo;
	private String PhotoPath;
	private int PostalCode;
	private String Region;
	private int ReportsTo;
	private float Salary;
	private String Title;
	private String TitleOfCourtesy;
	private Set employees;
	private employees manager;

	public employees() {
	}

	public employees(String firstName, String lastName, String notes) {

		FirstName = firstName;
		LastName = lastName;
		Notes = notes;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getExtension() {
		return Extension;
	}

	public void setExtension(String extension) {
		Extension = extension;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}

	public String getHomePhone() {
		return HomePhone;
	}

	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public byte[] getPhoto() {
		return Photo;
	}

	public void setPhoto(byte[] photo) {
		Photo = photo;
	}

	public String getPhotoPath() {
		return PhotoPath;
	}

	public void setPhotoPath(String photoPath) {
		PhotoPath = photoPath;
	}

	public int getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(int postalCode) {
		PostalCode = postalCode;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public int getReportsTo() {
		return ReportsTo;
	}

	public void setReportsTo(int reportsTo) {
		ReportsTo = reportsTo;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getTitleOfCourtesy() {
		return TitleOfCourtesy;
	}

	public void setTitleOfCourtesy(String titleOfCourtesy) {
		TitleOfCourtesy = titleOfCourtesy;
	}

	public Set getEmployees() {
		return employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

	public employees getManager() {
		return manager;
	}

	public void setManager(employees manager) {
		this.manager = manager;
	
	}

}
