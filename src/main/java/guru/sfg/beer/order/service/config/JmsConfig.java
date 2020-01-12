package guru.sfg.beer.order.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.stereotype.Component;

/**
 * Created by Donald F. Coffin on 07/25/2019 at 21:30
 */
@Component
public class JmsConfig {
    public static final String  VALIDATE_ORDER_QUEUE = "validate_order";

    @Bean  // Serialize message content to Json using TextMessage
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
}
