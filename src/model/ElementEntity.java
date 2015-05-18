package model;

import javax.persistence.*;

/**
 * Created by O10 on 18.05.15.
 */
@Entity
@Table(name = "element", schema = "public", catalog = "soa")
public class ElementEntity {
    private Integer elementId;
    private String elementName;
    private String nameProperty;
    private Integer chargeProperty;
    private String attributeProperty;

    @Id
    @Column(name = "element_id")
    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    @Basic
    @Column(name = "element_name")
    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    @Basic
    @Column(name = "name_property")
    public String getNameProperty() {
        return nameProperty;
    }

    public void setNameProperty(String nameProperty) {
        this.nameProperty = nameProperty;
    }

    @Basic
    @Column(name = "charge_property")
    public Integer getChargeProperty() {
        return chargeProperty;
    }

    public void setChargeProperty(Integer chargeProperty) {
        this.chargeProperty = chargeProperty;
    }

    @Basic
    @Column(name = "attribute_property")
    public String getAttributeProperty() {
        return attributeProperty;
    }

    public void setAttributeProperty(String attributeProperty) {
        this.attributeProperty = attributeProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementEntity that = (ElementEntity) o;

        if (elementId != null ? !elementId.equals(that.elementId) : that.elementId != null) return false;
        if (elementName != null ? !elementName.equals(that.elementName) : that.elementName != null) return false;
        if (nameProperty != null ? !nameProperty.equals(that.nameProperty) : that.nameProperty != null) return false;
        if (chargeProperty != null ? !chargeProperty.equals(that.chargeProperty) : that.chargeProperty != null)
            return false;
        if (attributeProperty != null ? !attributeProperty.equals(that.attributeProperty) : that.attributeProperty != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = elementId != null ? elementId.hashCode() : 0;
        result = 31 * result + (elementName != null ? elementName.hashCode() : 0);
        result = 31 * result + (nameProperty != null ? nameProperty.hashCode() : 0);
        result = 31 * result + (chargeProperty != null ? chargeProperty.hashCode() : 0);
        result = 31 * result + (attributeProperty != null ? attributeProperty.hashCode() : 0);
        return result;
    }
}
