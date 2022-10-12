package com.apiproject.witnessreportapi.repository;

import com.apiproject.witnessreportapi.model.LiveStream;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.UUID;
@Component

public class LiveStreamRepository {
    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository(){
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),title)"",

        );
    }

}
