package _80_utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class IdGenerator {


    public String generateIdKey(String prefix) {

        return prefix + LocalDateTime.now() + " " + new Random().nextInt(100);
    }


}

//UUID.randomUUID().toString()