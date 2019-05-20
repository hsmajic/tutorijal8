package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;

public class Driver {

  private Integer idDriver = null;
  private String firstName, lastName, jmb;
  private LocalDate birthdate, hireDate;


  public Driver() {
  }

  public Driver(String firstName, String lastName, String jmb, LocalDate birthdate, LocalDate hireDate){
    this.firstName = firstName;
    this.lastName = lastName;
    this.jmb = jmb;
    this.birthdate = birthdate;
    this.hireDate = hireDate;
  }

  public Driver(Integer idDriver, String firstName, String lastName, String jmb, LocalDate birthdate, LocalDate hireDate){
    this.idDriver = idDriver;
    this.firstName = firstName;
    this.lastName = lastName;
    this.jmb = jmb;
    this.birthdate = birthdate;
    this.hireDate = hireDate;
  }

  public Integer getIdDriver() {
    return idDriver;
  }

  public void setIdDriver(Integer idDriver) {
    this.idDriver = idDriver;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getJmb() {
    return jmb;
  }

  public void setJmb(String jmb) {
    this.jmb = jmb;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  @Override
  public String toString() {
    return " -> (" + this.getFirstName() + " " + this.getLastName() + " ( " + this.getJmb() + " ))";
  }

  public boolean equals (Driver driver){
    return (driver.getJmb().equals(this.getJmb()));
  }

}


