package com.pharmacy.PharmacyManager.Login;

public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {

        this.loginRepository = loginRepository;
    }


    public boolean authenticate(LoginDTO loginDTO) {
        LoginModel loginModel = loginRepository.findByEmail(loginDTO.getEmail());
        if (loginModel != null && loginModel.getPassword().equals(loginDTO.getPassword())) {
            return true;
        }
        return false;
    }
}
