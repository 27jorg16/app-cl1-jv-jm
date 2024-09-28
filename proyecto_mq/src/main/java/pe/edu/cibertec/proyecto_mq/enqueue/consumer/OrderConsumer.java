package pe.edu.cibertec.proyecto_mq.enqueue.consumer;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Slf4j
@Setter
public class OrderConsumer {

    @RabbitListener(queues = "order_queue")
    public void consumirPedido(String pedido){
        log.info("Pedido recibido: " + pedido + ", inicio de operación");
    }
}
