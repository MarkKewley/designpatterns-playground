package additional.dto;

public class DomainService {

    public DomainObjectDTO getData() {
        // assume we have a back-end that loads the DomainObject
        // we will just transfer our DomainObject into a DomainObjectDTO
        DomainObject domainObject = getObject();

        return new DomainObjectDTO(domainObject);
    }

    private DomainObject getObject() {
        return new DomainObject("Cool Property", "confidentialData");
    }
}
