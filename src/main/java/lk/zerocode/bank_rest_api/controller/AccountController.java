package lk.zerocode.bank_rest_api.controller;


import lk.zerocode.bank_rest_api.controller.request.AccountDepositRequest;
import lk.zerocode.bank_rest_api.model.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping(value = "/account-deposit")

    public void depositAccount(@RequestBody AccountDepositRequest accountDepositRequest){

        System.out.println("Deposit Account");

    }





}
