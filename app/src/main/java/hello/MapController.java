package hello;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

  // http://localhost:8080/map
  @GetMapping("/map")
  public Map<String, String> getMap() {
    return Map.of("key1", "a", "key2", "b", "key3", "c");
  }
}

