package com.pharmacy.PharmacyManager.SingUp;

public class SingUpController {
        private final SingUpService singUpService;

        public SingUpController(SingUpService singUpService) {
            this.singUpService = singUpService;
        }

        public void registerUser(SingUpDTO singUpDTO) {
            // Validate the input data (e.g., check for null values, validate email format, etc.)
            if (singUpDTO == null || singUpDTO.getEmail() == null || singUpDTO.getPassword() == null) {
                throw new IllegalArgumentException("Invalid input data");
            }

            // Call the service layer to handle the registration logic
            singUpService.registerUser(singUpDTO);
        }
}
