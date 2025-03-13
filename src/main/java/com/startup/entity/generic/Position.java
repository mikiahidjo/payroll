package com.startup.entity;

public class Position {
    private  String positionCode;
    private PositionStatus positionStatus; // Use enum instead of String

    // Enum for position status
    public enum PositionStatus {
        OPEN, CLOSED
    }

    // Private constructor
    private Position(Builder builder) {
        this.positionCode = builder.positionCode;
        this.positionStatus = builder.positionStatus;
    }

    // Getters
    public String getPositionCode() {
        return positionCode;
    }

    public PositionStatus getPositionStatus() { // Return enum instead of String
        return positionStatus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionCode='" + positionCode + '\'' +
                ", positionStatus=" + positionStatus + // Remove unnecessary single quotes
                '}';
    }

    // Builder Class
    public static class Builder {
        private String positionCode;
        private PositionStatus positionStatus = PositionStatus.OPEN; // Default to OPEN

        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder setPositionStatus(PositionStatus positionStatus) { // Accept enum instead of String
            this.positionStatus = positionStatus;
            return this;
        }

        public Builder copy(Position position) {
            this.positionCode = position.positionCode;
            this.positionStatus = position.positionStatus;
            return this;
        }

        public Position build() {
            return new Position(this);
        }
    }

}
