package model;

import javax.persistence.*;

/**
 * Created by O10 on 18.05.15.
 */
@Entity
@Table(name = "category", schema = "public", catalog = "soa")
@NamedQueries({
        @NamedQuery(name="Category.findByName", query="select c from CategoryEntity c where c.categoryName = :name"),
        @NamedQuery(name="Category.findAll", query = "select c from CategoryEntity c"),
        @NamedQuery(name="Category.findNames", query = "select distinct c.categoryName from CategoryEntity c")
})
public class CategoryEntity {
    private Integer categoryId;
    private String categoryName;
    private Integer sizeProperty;

    @Id
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "size_property")
    public Integer getSizeProperty() {
        return sizeProperty;
    }

    public void setSizeProperty(Integer sizeProperty) {
        this.sizeProperty = sizeProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (sizeProperty != null ? !sizeProperty.equals(that.sizeProperty) : that.sizeProperty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (sizeProperty != null ? sizeProperty.hashCode() : 0);
        return result;
    }
}
