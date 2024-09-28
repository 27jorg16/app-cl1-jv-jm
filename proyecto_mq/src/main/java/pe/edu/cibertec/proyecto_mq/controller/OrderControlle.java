package pe.edu.cibertec.proyecto_mq.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.proyecto_mq.enqueue.producer.OrderProducer;

@RequiredArgsConstructor
@RestController
public class OrderControlle {

    private final OrderProducer orderProducer;

    @GetMapping("/enviarPedido")
    public String enviarPedido(@RequestParam String pedido){
        orderProducer.enviarPedido(pedido);
        return "Pedido enviado a RabbitMQ: " + pedido;
    }

}
