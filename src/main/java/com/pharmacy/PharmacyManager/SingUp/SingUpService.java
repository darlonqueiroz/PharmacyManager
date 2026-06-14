package com.pharmacy.PharmacyManager.SingUp;

public class SingUpService {
    private SingUpRepository singUpRepository;
    private SingUpMapper singUpMapper;

    public SingUpService(SingUpRepository singUpRepository, SingUpMapper singUpMapper) {
        this.singUpRepository = singUpRepository;
        this.singUpMapper = singUpMapper;
    }

    public void registerUser(SingUpDTO singUpDTO) {
        // Map the DTO to the model
        SingUpModel singUpModel = singUpMapper.toModel(singUpDTO);

        // Save the user to the repository
        singUpRepository.save(singUpModel);
    }
}
