package com.pharmacy.PharmacyManager.Login;

public class LoginMapper {
    public static LoginDTO toDTO(LoginModel loginModel) {
        return new LoginDTO(loginModel.getEmail(), loginModel.getPassword());
    }

    public static LoginModel toEntity(LoginDTO loginDTO) {
        return new LoginModel(loginDTO.getEmail(), loginDTO.getPassword());
    }
}
