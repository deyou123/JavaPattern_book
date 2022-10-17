package jdp3e.solid_principles.lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class PaymentHelper {
    List<PreviousPayment> previousPayments = new
            ArrayList<PreviousPayment>();
    List<NewPayment> newPayments = new ArrayList<NewPayment>();
    public void addPreviousPayment(PreviousPayment
                                           previousPayment){
        previousPayments.add(previousPayment);
    }
    public void addNewPayment(NewPayment newPaymentRequest){
        newPayments.add(newPaymentRequest);
    }
    public void showPreviousPayments() {
        for (PreviousPayment payment: previousPayments) {
            payment.previousPaymentInfo();
            System.out.println("------");
        }
    }
    public void processNewPayments() {
        for (NewPayment payment: newPayments) {
            payment.newPayment();
            System.out.println("***********");
        }
    } }