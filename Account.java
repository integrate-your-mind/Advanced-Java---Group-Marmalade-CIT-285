/*
 * Roman Mondello
 */

package sample;

import com.oracle.tools.packager.Log;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;


public abstract class Account implements Serializable {
    protected UUID mAccountNumber;
    protected String mFirstName;
    protected String mLastName;
    protected String mPhoneNumber;
    protected String mEmailAddress;
    protected String mPassword;
    protected String secretQuestion;
    protected Message[] mMessages;
    Boolean mNotificationsOn;

    public UUID getAccountNumber() {
        return mAccountNumber;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getEmailAddress() {
        return mEmailAddress;
    }

    public Boolean getNotificationsOn() {
        return mNotificationsOn;
    }

    public Message[] getMessages() {
        return mMessages;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        //hash = 53 * hash + Integer.parseInt(mAccountNumber.toString());
        hash = 53 * hash + (mFirstName == null ? 0 :mFirstName.hashCode());
        hash = 53 * hash + (mLastName == null ? 0 :mLastName.hashCode());
        Log.info("hashCode() called: " + hash);
        return hash;
    }

    static class AccountBuilder<C extends Account,
            B extends AccountBuilder <C, B>> {
        C obj;

        AccountBuilder(C constructedObj) {
            this.obj = constructedObj;
        }

        B setNotificationsOn(Boolean notificationsOn) {
            obj.mNotificationsOn = notificationsOn;
            return (B) this;
        }

        B setAccountNumber(UUID id) {
            obj.mAccountNumber = id;
            return (B) this;
        }

        B setFirstName(String firstName) {
            obj.mFirstName = firstName;
            return (B) this;
        }

        B setLastName(String lastName) {
            obj.mLastName = lastName;
            return (B) this;
        }

        B setCellPhoneNumber(String cellPhoneNumber) {
            obj.mPhoneNumber = cellPhoneNumber;
            return (B) this;
        }

        B setEmailAddress(String emailAddress) {
            obj.mEmailAddress = emailAddress;
            return (B) this;
        }

        B setPassword(String password) {
            obj.mPassword = password;
            return (B) this;
        }

        B setMessages(Message[] messages) {
            obj.mMessages = messages;
            return (B) this;
        }

        B setSecretQuestion(String secretQuestion) {
            obj.secretQuestion = secretQuestion;
            return (B) this;
        }

        C build() {
            return obj;
        }

    }
}
