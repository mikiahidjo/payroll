package com.startup.entity;

public class Race {
    private String raceId, raceDescription;

    private Race(Builder builder){
        this.raceId = builder.raceId;
        this.raceDescription = builder.raceDescription;
    }

    public String getraceId() {
        return raceId;
    }

    public String getRaceDescription() {
        return raceDescription;
    }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + raceId + '\'' +
                ", description='" + raceDescription + '\'' +
                '}';
    }

    public static class Builder{
        private String raceId, raceDescription;

        public Builder setRaceId(String raceId){
            this.raceId = raceId;
            return this;
        }
        public Builder setRaceDesciption(String raceDescription){
            this.raceDescription = raceDescription;
            return this;
        }
        public Builder copy(Race race){
            this.raceId = race.raceId;
            this.raceDescription = race.raceDescription;
            return this;
        }
        public Race build(){
            return new Race(this);
        }
    }
}
