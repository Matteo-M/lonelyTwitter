package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by mmackinn on 1/17/17.
 */

public class NewNormalTweet extends Tweet {
    public NewNormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public NewNormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;

    }


}


