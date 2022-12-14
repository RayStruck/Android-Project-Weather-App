package com.example.androidgroupprojectf22;

import android.util.Log;

import java.sql.Array;
import java.util.ArrayList;

public class WeeklyModel {
    private WeeklyModel() {
        this.weeklyData = new ArrayList<WeeklyData>();
        loadModel();
    }
    public static class WeeklyData{
        private double low;
        private double high;
        private String condition;

        public WeeklyData(double low, double high, String condition){
            this.low = low;
            this.high = high;
            this.condition = condition;
        }

        public double getLow(){
            return low;
        }
        public double getHigh(){ // puff puff pass
            return high;
        }
        public String getCondition(){
            return condition;
        }
    }
    public ArrayList<WeeklyData> getWeeklyData(){return weeklyData;}
    private ArrayList<WeeklyData> weeklyData = null;

    public void addWeeklyData(double low, double high, String condition, int location){
        if(this.weeklyData.size() != 5){
            this.weeklyData.add(new WeeklyData(low,high,condition));
        }else{
            this.weeklyData.set(location, new WeeklyData(low,high,condition));
        }

    }


    private static WeeklyModel model = null;
    public static WeeklyModel getModel(){
        if(model == null){
            model = new WeeklyModel();
        }
        return model;
    }

    private void loadModel(){
    }
}
