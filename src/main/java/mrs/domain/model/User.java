package mrs.domain.model;

import sun.jvm.hotspot.debugger.cdbg.EnumType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usr")
public class User implements Serializable {

    @Id
    private String userId;
    private String password;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
