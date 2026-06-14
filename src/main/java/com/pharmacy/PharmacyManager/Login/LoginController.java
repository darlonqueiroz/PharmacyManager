package com.pharmacy.PharmacyManager.Login;

public class LoginController {
        private final LoginService loginService;

        public LoginController(LoginService loginService) {
            this.loginService = loginService;
        }

        public void login(LoginDTO loginDTO) {
            // Validate the input data (e.g., check if email and password are not empty)
            if (loginDTO.getEmail() == null || loginDTO.getEmail().isEmpty() ||
                loginDTO.getPassword() == null || loginDTO.getPassword().isEmpty()) {
                throw new IllegalArgumentException("Email and password must not be empty");
            }

            // Call the service layer to perform the login logic
            boolean isAuthenticated = loginService.authenticate(loginDTO);

            if (!isAuthenticated) {
                throw new IllegalArgumentException("Invalid email or password");
            }

            // If authentication is successful, you can return a response or perform further actions
            System.out.println("Login successful for user: " + loginDTO.getEmail());
        }
}
