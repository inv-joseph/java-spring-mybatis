/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.innovaturelabs.spring.web.form;

import com.innovaturelabs.spring.validator.constraint.SpringAssert;
import java.com.innovaturelabs.spring.web.orm.entity.User;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author nirmal
 */
@SpringAssert(value = "password == password2", subPath = "password2")
public class UserForm {

    private String userName;
    @Length(min = 6, max = 18)
    private String password;
    @NotEmpty()
    private String password2;
    @Email
    private String email;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    public UserForm() {
    }

    public UserForm(User user) {
        userName = user.getUserName();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}