package by.bokiy.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Created with IntelliJ IDEA.
 * AbstractUser: kiryl
 * Date: 10/4/13
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "abstractuser")
public class AbstractUser implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "authname", nullable = false)
    String authName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }
}
