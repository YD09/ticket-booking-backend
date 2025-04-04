package org.example.app.entities;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import java.util.Map;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)



public class Train
{
    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String , String > stationTimes;

    private List<String> stations;

    public Train(String trainId , String trainNo , List<List<Integer>> seats , Map<String , String> stationTimes,List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public List<String> getStations(){
        return stations;
    }
    public List<List<Integer>> getSeats() {
        return seats;
    }
    public void setSeats(List<List<Integer>> seats){
        this.seats = seats;
    }

    public String getTrainId(){
        return trainId;
    }

    public Map<String , String > getStationTimes(){
        return stationTimes;
    }
    public String getTrainNo(){
        return trainNo;
    }

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    public void setStationTimes(Map<String , String> stationTimes){
        this.stationTimes=stationTimes;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public String getStationInfo(){
        return String.format("Train ID : %s Train No : %s" , trainId , trainNo);
    }

}
