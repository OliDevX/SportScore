package com.olidevx.sportscore;

/**
 * Created by Armando on 17/04/2016.
 */
public class gamecontrol {
    team mTeam1;
    team mTeam2;
    Display mDisplay_1;
    Display mDisplay_2;

    public void setGame (int pointsTeam1, int pointsTeam2, String nameTeam1, String nameTeam2) {
        mTeam1.setTeamName(nameTeam1);
        mTeam2.setTeamName(nameTeam2);
        mTeam1.setTeamPoints(pointsTeam1);
        mTeam2.setTeamPoints(pointsTeam2);
    }

    public void change_score (team mTeam, boolean up_or_down) {
        if (up_or_down) {
            mTeam.increasePoint();
        } else {
            mTeam.decreasePoint();
        }
    }
}
