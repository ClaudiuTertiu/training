package assignment;

public class ContactDetails {
    private String houseNumber;
    private String localityName;
    private String cityName;
    private String stateName;
    private String countryName;
    private long pinCode;
    private long mobileNumber;
    private long emailId;

    public ContactDetails(String houseNumber, String localityName, String cityName, String stateName, String countryName, long pinCode, long mobileNumber, long emailId) {
        this.houseNumber = houseNumber;
        this.localityName = localityName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
        this.pinCode = pinCode;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getLocalityName() {
        return localityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getPinCode() {
        return pinCode;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public long getEmailId() {
        return emailId;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmailId(long emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "houseNumber='" + houseNumber + '\'' +
                ", localityName='" + localityName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", pinCode=" + pinCode +
                ", mobileNumber=" + mobileNumber +
                ", emailId=" + emailId +
                '}';
    }
}
