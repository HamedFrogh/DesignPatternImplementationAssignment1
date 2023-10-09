package com.interview.questions.factorytest;

public class CommunicationFactory {

    public Communication getProcess(String modeOfComm) {

        if("Email".equalsIgnoreCase (modeOfComm)) {
            return new EmailCommunication();
        }
        else if("Mobile".equalsIgnoreCase(modeOfComm)) {
            return new MobileCommunication();

        }
        return null;
    }
}
