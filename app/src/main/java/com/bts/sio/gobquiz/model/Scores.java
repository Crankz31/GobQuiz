package com.bts.sio.gobquiz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michaël SAGOT on 22/02/2018.
 */

public class Scores implements Serializable{

   private List<User> mScoresTab;

    public Scores() {

        mScoresTab = new ArrayList<User>();
    }

    public Scores(ArrayList<User> scoresTab) {
        mScoresTab = scoresTab;
    }

    public List<User> getScoresTab() {
        return mScoresTab;
    }

    public void setScoresTab(List<User> scoresTab) {
        mScoresTab = scoresTab;
    }

    // Addition a new score
    public void addScore(User user){
        mScoresTab.add(user);
    }
}
