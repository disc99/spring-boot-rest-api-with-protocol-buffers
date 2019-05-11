package com.example.demo;

import com.google.protobuf.Timestamp;
import io.disc99.example.Book.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static org.springframework.http.MediaType.*;

@SpringBootApplication
@RestController
@RequestMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

	@PostMapping("/")
	BookResponse book(@RequestBody BookRequest request) {
		return BookResponse.newBuilder()
				.setId(request.getId())
				.setTitle("Title " + request.getId())
				.setPrice(2_000)
				.setReleaseDate(Timestamp.newBuilder().setSeconds(new Date().getTime()))
				.build();
	}
}
