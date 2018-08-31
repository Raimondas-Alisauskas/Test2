package _80_utils;

import _10_model.input.RequestInput;
import _50_request.Request;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class RequestFiller {

    public Request fillRequest(RequestInput requestInput, Request request) {
        try {
            request.setClientName(requestInput.getClientName());
            request.setMaxDimensionsMM(Long.valueOf(requestInput.getMaxDimensionMM()));
            request.setVolumeCM3(Long.valueOf(requestInput.getMaxDimensionMM()));
            request.setDeadline(LocalDateTime.of(LocalDate.parse(requestInput.getDeadline()), LocalTime.MIDNIGHT));
        }catch (NumberFormatException e){
            System.out.println("Please do not leave empty requestInput data");
            throw e;
        }catch (DateTimeParseException e){
            System.out.println("Please fill right date format in requestInput");
            throw e;
        }

        return request;
    }

}
