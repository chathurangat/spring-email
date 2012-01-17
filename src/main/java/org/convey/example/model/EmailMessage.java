
package org.convey.example.model;

/**
 * $LastChangedDate:  $
 * $LastChangedBy:  $
 * $LastChangedRevision:  $
 */
public class EmailMessage {

    String senderEmailAddress;
    String receiverEmailAddress;
    String subject;
    String messageBody;


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


}
