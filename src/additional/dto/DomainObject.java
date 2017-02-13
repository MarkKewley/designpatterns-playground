package additional.dto;

public class DomainObject {

    private String aProperty;

    // we don't want to transfer this to clients
    private String confidential;

    public DomainObject(String aProperty, String confidential) {
        this.aProperty = aProperty;
        this.confidential = confidential;
    }

    public String getaProperty() {
        return aProperty;
    }

    public void setaProperty(String aProperty) {
        this.aProperty = aProperty;
    }

    public String getConfidential() {
        return confidential;
    }

    public void setConfidential(String confidential) {
        this.confidential = confidential;
    }
}
