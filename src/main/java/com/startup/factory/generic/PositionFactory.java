package com.startup.factory;

import com.startup.entity.Position;
import com.startup.util.ValidationHelper;

public class PositionFactory {
    public static Position createPosition(String positionCode, Position.PositionStatus status){
        if(ValidationHelper.isEmptyOrNullString(positionCode)|| ValidationHelper.isEmptyOrNullString(String.valueOf(status)))
            return null;
        return new Position.Builder()
                .setPositionCode(positionCode)
                .setPositionStatus(status)
                .build();

    }
}
