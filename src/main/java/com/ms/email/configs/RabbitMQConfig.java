package com.ms.email.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RabbitMQConfig {
	// Configuração do RabbitMQ
	// Queue para EmailRecordDTO
	@Value("${broker.queue.email.name}")
	private String queue;

	@Bean
	public Queue queue() {
		return new Queue(queue, true);
	}

	// Converter para EmailRecordDTo
	// Configuração do Jackson2JsonMessageConverter
	// Converter para EmailRecordDTO
	@Bean
	public Jackson2JsonMessageConverter messageConverter() {
		ObjectMapper objectMapper = new ObjectMapper();
		return new Jackson2JsonMessageConverter(objectMapper);
	}
}
