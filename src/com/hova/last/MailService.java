package com.hova.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public  class MailService<T> implements Consumer<Sendable<T>> {

    private MailboxMap<String, List<T>> mailBox = new MailboxMap<>();

    public void accept(Sendable<T> tSendable) {

        if (this.mailBox.containsKey(tSendable.getTo())) {
            List<T> existingList = (List<T>) this.mailBox.get(tSendable.getTo());
            existingList.add((T) tSendable.getContent());
        } else {
            List<T> freshList =  new ArrayList<>(Arrays.asList(tSendable.getContent()));
            this.mailBox.put(tSendable.getTo(), freshList);
        }

    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
