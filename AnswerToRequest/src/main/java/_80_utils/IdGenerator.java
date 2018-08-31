package _80_utils;

import java.time.Instant;

public class IdGenerator {



    public String generateIdKey(String prefix) {

        return  prefix + Instant.now();
    }


}

