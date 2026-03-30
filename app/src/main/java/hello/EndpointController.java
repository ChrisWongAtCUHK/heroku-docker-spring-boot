package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

  // http://localhost:8080/endpoint
  @GetMapping("/endpoint")
  public Endpoint getEndpoint() {
    Endpoint endpoint = new Endpoint();
    endpoint.setName("hello world");
    return endpoint;
  }
}
