package com.hova.last;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public  class MailService<T> implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox;

    public void accept(Sendable<T> tSendable) {

        if (this.mailBox.containsKey(tSendable.getTo())) {
            this.mailBox.get(tSendable.getTo()).add((T) tSendable.getContent());
        } else {
            List<T> freshList = Arrays.asList(tSendable.getContent());
            //this.mailBox.put(tSendable.getTo(), freshList);
        }

    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
