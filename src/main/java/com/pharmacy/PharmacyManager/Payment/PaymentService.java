package com.pharmacy.PharmacyManager.Payment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<PaymentModel> getAllPayments() {
        return paymentRepository.findAll();
    }

     public PaymentModel getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }


     public PaymentModel savePayment(PaymentModel payment) {
        return paymentRepository.save(payment);
    }

     public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
