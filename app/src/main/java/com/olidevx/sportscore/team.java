package com.olidevx.sportscore;

/**
 * Created by Armando on 17/04/2016.
 * This class defines the team and the methods applying to any team
 *
 */

// TODO: Document all items in "team" class

public class team {
    String mName;
    int mPoints;

    void increasePoint () {
        if (mPoints < 999) {
            mPoints++;
        }
    }

    void decreasePoint () {
        if (mPoints >= 0){
            mPoints--;
        }
    }

    String tellName () {
        return mName;
    }

    int tellPoints () {
        return mPoints;
    }

    void setTeamName (String strName){
        mName = strName;
    }

    void setTeamPoints (int Points) {
        mPoints = Points;
    }

}
