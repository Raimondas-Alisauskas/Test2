package _80_utils;

import _10_model.input.RequestInput;
import _50_request.Request;
import _50_request.RequestScope;
import _50_request.RequestTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class RequestFiller {

    public Request fillRequest(RequestInput requestInput, Request request) {
        try {
            request.setClientId(requestInput.getClientName());

            long maxFootprintDimensionMM = Long.valueOf(requestInput.getMaxFootprintDimensionMM());
            long maxHeightMM = Long.valueOf(requestInput.getMaxHeightMM());
            long volumeCM3 = Long.valueOf(requestInput.getVolumeCM3());
            LocalDateTime deadline = (LocalDateTime.of(LocalDate.parse(requestInput.getDeadline()), LocalTime.MIDNIGHT));

            request.setRequestScope(new RequestScope(maxFootprintDimensionMM, maxHeightMM, volumeCM3));
            request.setRequestTime(new RequestTime(deadline));

        } catch (NumberFormatException e) {
            System.out.println("Please do not leave empty requestInput data");
            throw e;
        } catch (DateTimeParseException e) {
            System.out.println("Please fill right date format in requestInput");
            throw e;
        }

        return request;
    }

}
