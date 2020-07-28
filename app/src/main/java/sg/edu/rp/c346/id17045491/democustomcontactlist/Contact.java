package sg.edu.rp.c346.id17045491.democustomcontactlist;

public class Contact {
    private String Name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Contact(String name, int countryCode, int phoneNum,char gender) {
        this.Name = name;
        this.countryCode=countryCode;
        this.phoneNum=phoneNum;
        this.gender=gender;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
