package com.phillipapa.analytics.stream;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@EnableKafkaStreams
@Configuration
public class OrderStream {

    @Bean
    public KStream<String, String> kStream(StreamsBuilder builder) {
        KStream<String, String> orders = builder.stream("orders");
        orders
            .groupBy((key, value) -> value.substring(0, 10))
            .count(Materialized.as("jumlah-order-harian"))
            .toStream()
            .foreach((date, count) -> System.out.println(date + " -> " + count));
        return orders;
    }
}
