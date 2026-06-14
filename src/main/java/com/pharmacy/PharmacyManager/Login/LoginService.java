package com.pharmacy.PharmacyManager.Login;

public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public boolean authenticate(String username, String password) {
        // Implement authentication logic here
        // For example, you can check the username and password against the database
        return loginRepository.existsByUsernameAndPassword(username, password);
    }}{
}
