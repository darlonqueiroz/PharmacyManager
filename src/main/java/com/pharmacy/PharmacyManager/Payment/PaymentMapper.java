package com.pharmacy.PharmacyManager.Payment;

public class PaymentMapper {
    public PaymentModel mapPayment (PaymentDTO paymentDTO) {

        PaymentModel paymentModel = new PaymentModel();
        paymentModel.setClient(paymentDTO.getClient());
        paymentModel.setProduct(paymentDTO.getProduct());
        paymentModel.setTotalPrice(paymentDTO.getTotalPrice());
        return paymentModel;
    }

    public PaymentDTO mapPaymentDTO (PaymentModel paymentModel) {

        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setClient(paymentModel.getClient());
        paymentDTO.setProduct(paymentModel.getProduct());
        paymentDTO.setTotalPrice(paymentModel.getTotalPrice());
        return paymentDTO;
    }
}
