package additional.dto;

/**
 * Only contains the data we want to transfer to clients. This is a simple
 * object we wish to transfer to a client, we can hide data and complexity
 * from the client.
 */
public class DomainObjectDTO {
    private String aProperty;

    public DomainObjectDTO(DomainObject domainObject) {
        aProperty = domainObject.getaProperty();
    }

    public String getaProperty() {
        return aProperty;
    }
}
