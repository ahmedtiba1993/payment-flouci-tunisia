package com.ahmedtiba.flouci.flouci;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class PayementController {

    private final PayementService payementService;

    @GetMapping("/payment/success")
    public String paymentSuccess(@RequestParam("payment_id") String paymentId) throws IOException {
        boolean verifPayment = payementService.verifyPayment(paymentId);
        if (verifPayment) {
            return "paymentSuccess";
        }else{
            return "paymentError";
        }
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/payment/error")
    public String paymentError(){
        return "paymentError";
    }

    @PostMapping("/payment/create")
    public ModelAndView createPayment(@RequestParam("amount") Integer amount) throws IOException {
        ResponsePayment responsePayment = payementService.generatePayment(amount);
        return new ModelAndView("redirect:" + responsePayment.getLink());
    }
}
