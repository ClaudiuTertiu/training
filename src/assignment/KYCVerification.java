package assignment;

public class KYCVerification {
    private String panNumber;
    private long adharNumber;
    private String documentType;
    private String documentNumber;

    public KYCVerification(String panNumber, long adharNumber, String documentType, String documentNumber) {
        this.panNumber = panNumber;
        this.adharNumber = adharNumber;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public long getAdharNumber() {
        return adharNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
}
