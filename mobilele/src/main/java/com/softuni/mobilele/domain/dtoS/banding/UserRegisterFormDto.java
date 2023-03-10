package com.softuni.mobilele.domain.dtoS.banding;

import com.softuni.mobilele.domain.enums.Role;
import com.softuni.mobilele.validations.matchingPasswords.PasswordMatch;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@PasswordMatch(password = "",confirmPassword = "",message = "")
public class UserRegisterFormDto {
    @NotNull
    @Size(min = 5, max = 20)
    private String username; // –  username of the user.
    @NotNull
    @Size(min = 5, max = 20)
    private String password; //– password of the user.
    @NotNull
    @Size(min = 5, max = 20)
    private String confirmPassword;
    @NotNull
    @Size(min = 5, max = 20)
    private String firstName; //–  first name of the user.
    @NotNull
    @Size(min = 5, max = 20)
    private String lastName; //–  last name of the user.
    @NotNull
    private Role role; //–  last name of the user.

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}