package com.hova.mails;

public class Thief implements MailService {

    private int minPrice;

    private int sum = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= this.minPrice) {
                this.sum += ((MailPackage) mail).getContent().getPrice();

                Package p = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
                MailPackage stub = new MailPackage(mail.getFrom(), mail.getTo(), p);
                return stub;
            }

        }
        return mail;
    }

    public int getStolenValue()
    {
        return this.sum;
    }
}
