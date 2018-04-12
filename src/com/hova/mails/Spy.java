package com.hova.mails;

import java.util.logging.Logger;

public class Spy implements MailService {

    private Logger log;

    public Spy(Logger l) {
        this.log = l;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if ((mail.getFrom() == "Austin Powers") | (mail.getTo() == "Austin Powers")) {
                this.log.warning("Detected target mail correspondence: from " + mail.getFrom() +" to " + mail.getTo() + " \""+ ((MailMessage) mail).getMessage() +"\"");
            } else {
                this.log.info("Usual correspondence: from " + mail.getFrom() +" to " + mail.getTo());
            }
        }
        return mail;
    }
}
