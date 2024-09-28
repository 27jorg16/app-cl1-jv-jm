package pe.edu.cibertec.proyecto_mq.enqueue.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final String EXCHANGE = "order_exchange";
    private static final String ROUTING_KEY = "order_routing";

    public void enviarPedido(String pedido){
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, pedido);
        log.info("Pedido construido y enviado a RabbitMQ: " + pedido);
    }
}
