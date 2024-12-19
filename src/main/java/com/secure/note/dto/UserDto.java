package com.secure.note.dto;

import com.secure.note.model.Role;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class UserDto {
    private Long userId;
    private String userName;
    private String email;
    private boolean accountNonLocked;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;
    private boolean enabled;
    private LocalDate credentialExpiryDate;
    private LocalDate accountExpiryDate;
    private String twoFactorSecret;
    private boolean isTwoFactorEnabled;
    private String signUpMethod;
    private Role role;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    public UserDto(Long userId, String userName, String email, boolean accountNonLocked, boolean accountNonExpired, boolean credentialsNonExpired, boolean enabled, LocalDate credentialExpiryDate, LocalDate accountExpiryDate, String twoFactorSecret, boolean isTwoFactorEnabled, String signUpMethod, Role role, LocalDateTime createdDate, LocalDateTime updateDate) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.accountNonLocked = accountNonLocked;
        this.accountNonExpired = accountNonExpired;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
        this.credentialExpiryDate = credentialExpiryDate;
        this.accountExpiryDate = accountExpiryDate;
        this.twoFactorSecret = twoFactorSecret;
        this.isTwoFactorEnabled = isTwoFactorEnabled;
        this.signUpMethod = signUpMethod;
        this.role = role;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }

    public UserDto() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public LocalDate getCredentialExpiryDate() {
        return credentialExpiryDate;
    }

    public void setCredentialExpiryDate(LocalDate credentialExpiryDate) {
        this.credentialExpiryDate = credentialExpiryDate;
    }

    public LocalDate getAccountExpiryDate() {
        return accountExpiryDate;
    }

    public void setAccountExpiryDate(LocalDate accountExpiryDate) {
        this.accountExpiryDate = accountExpiryDate;
    }

    public String getTwoFactorSecret() {
        return twoFactorSecret;
    }

    public void setTwoFactorSecret(String twoFactorSecret) {
        this.twoFactorSecret = twoFactorSecret;
    }

    public boolean isTwoFactorEnabled() {
        return isTwoFactorEnabled;
    }

    public void setTwoFactorEnabled(boolean twoFactorEnabled) {
        isTwoFactorEnabled = twoFactorEnabled;
    }

    public String getSignUpMethod() {
        return signUpMethod;
    }

    public void setSignUpMethod(String signUpMethod) {
        this.signUpMethod = signUpMethod;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", accountNonLocked=" + accountNonLocked +
                ", accountNonExpired=" + accountNonExpired +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", enabled=" + enabled +
                ", credentialExpiryDate=" + credentialExpiryDate +
                ", accountExpiryDate=" + accountExpiryDate +
                ", twoFactorSecret='" + twoFactorSecret + '\'' +
                ", isTwoFactorEnabled=" + isTwoFactorEnabled +
                ", signUpMethod='" + signUpMethod + '\'' +
                ", role=" + role +
                ", createdDate=" + createdDate +
                ", updateDate=" + updateDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return accountNonLocked == userDto.accountNonLocked && accountNonExpired == userDto.accountNonExpired && credentialsNonExpired == userDto.credentialsNonExpired && enabled == userDto.enabled && isTwoFactorEnabled == userDto.isTwoFactorEnabled && Objects.equals(userId, userDto.userId) && Objects.equals(userName, userDto.userName) && Objects.equals(email, userDto.email) && Objects.equals(credentialExpiryDate, userDto.credentialExpiryDate) && Objects.equals(accountExpiryDate, userDto.accountExpiryDate) && Objects.equals(twoFactorSecret, userDto.twoFactorSecret) && Objects.equals(signUpMethod, userDto.signUpMethod) && Objects.equals(role, userDto.role) && Objects.equals(createdDate, userDto.createdDate) && Objects.equals(updateDate, userDto.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, email, accountNonLocked, accountNonExpired, credentialsNonExpired, enabled, credentialExpiryDate, accountExpiryDate, twoFactorSecret, isTwoFactorEnabled, signUpMethod, role, createdDate, updateDate);
    }
}
