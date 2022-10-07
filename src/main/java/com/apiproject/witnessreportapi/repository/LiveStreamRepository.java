package com.apiproject.witnessreportapi.repository;

import com.apiproject.witnessreportapi.model.LiveStream;

import java.util.ArrayList;
import java.util.UUID;

public class LiveStreamRepository {
    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository(){
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
        
        ));
    }

}
