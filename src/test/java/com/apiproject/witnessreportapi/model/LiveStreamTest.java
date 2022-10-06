package com.apiproject.witnessreportapi.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.management.ImmutableDescriptor;

import org.junit.jupiter.api.Test;

public class LiveStreamTest {
    
    @Test
    void create_new_mutable_live_stream (){
        MutableLiveStream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Building RESTful API");
        stream.setDescription("");
        stream.setUrl("www.apitest.com");
        stream.setStartDate(LocalDateTime.of(year:2022,month:2,dayOfMonth: 3, hour:5, minute: 3));
        stream.setEndDate(LocalDateTime.of(year:2022,month:2, dayOfMonth: 3, hour: 7, minute: 4));
    
    assertNotNull(stream);
    assertEquals(expected: "Building RESTful API", stream.getTitle(),message("works"));
    }

    @Test

    void create_new_immutable_live_stream() {
        ImmutableLiveStream stream = new ImmutableLiveStream(
            UUID.randomUUID().toString(),
        )
    }
}
