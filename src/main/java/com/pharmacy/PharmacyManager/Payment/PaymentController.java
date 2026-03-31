package com.pharmacy.PharmacyManager.Payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
public class PaymentController {

        @GetMapping("/getpayment")
        public String GetPayment() {
            return "<h1>Payment with Get</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
        }

        @PostMapping("/postpayment")
        public String PostPayment() {
            return "<h1>Payment with Post</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
        }

        @PutMapping("/putpayment")
        public String PutPayment() {
            return "<h1>Payment with Put</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
        }

        @DeleteMapping("/deletepayment")
        public String DeletePayment() {
            return "<h1>Payment with Delete</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
        }
}
