
package org.convey.example.model;

import org.springframework.stereotype.Component;

/**
 * $LastChangedDate:  $
 * $LastChangedBy:  $
 * $LastChangedRevision:  $
 */
@Component
public class EmailMessage {

    private String senderEmailAddress;
    private String receiverEmailAddress;
    private String subject;
    private String messageBody;


    public void setMessageBody(String messageBody){

        this.messageBody=messageBody;
    }

    public String getMessageBody(){

        return this.messageBody;
    }

    public void setReceiverEmailAddress(String receiverEmailAddress){

        this.receiverEmailAddress=receiverEmailAddress;
    }

    public String getReceiverEmailAddress(){

        return this.receiverEmailAddress;
    }

    public void setSenderEmailAddress(String senderEmailAddress){

        this.senderEmailAddress=senderEmailAddress;
    }

    public void setSubject(String subject) {

        this.subject=subject;
    }

    public String getSubject(){

        return this.subject;
    }


    public String getSenderEmailAddress() {
        return senderEmailAddress;
    }
}
