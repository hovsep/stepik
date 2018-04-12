package com.hova.mails;

public class UntrustworthyMailWorker implements MailService {

    private RealMailService rms;

    private MailService[] thirdParties;

    public UntrustworthyMailWorker(MailService[] thirdParties) {
        this.thirdParties = thirdParties;
        this.rms = new RealMailService();
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for(MailService ms: this.thirdParties) {
            mail = ms.processMail(mail);
        }

        return this.getRealMailService().processMail(mail);
    }

    public RealMailService getRealMailService()
    {
        return this.rms;
    }
}
