package com.bridgelabs;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validator {
    boolean verify(String regEx, String input);

    static void printResult(Validator fObj, String regEx, String input) {
        if (fObj.verify(regEx, input))
            System.out.println(input + " Verified :-)");
        else
            System.out.println(input + " Denied :-(");
    }
}

public class RegisThrLambda {

    public static void main(String[] args) {

        Validator inputVerification = (String regEx, String input) -> Pattern.matches(regEx, input);

        System.out.println(inputVerification.verify("^[A-Z][a-z]{2,}", "Aviral"));
        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "Aviral");
        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "aviral");

        System.out.println(inputVerification.verify("^[A-Z][a-z]{2,}", "Nimbekar" ));
        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "Nimbekar");
        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "Ni");

        Validator.printResult(inputVerification, "[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}", "abc@gmail.com");
        Validator.printResult(inputVerification, "\"[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}", "com.bl@");

        Validator.printResult(inputVerification, "^91 [1-9][0-9]{9}", "91 1112223344");
        Validator.printResult(inputVerification, "^91 [1-9][0-9]{9}", "1112223344");

        Validator.printResult(inputVerification, "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "@hoWaRe8you");
        Validator.printResult(inputVerification, "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "1112223344");
    }
}