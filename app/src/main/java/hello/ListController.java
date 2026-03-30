package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

  // http://localhost:8080/list
  @GetMapping("/list")
  public List<String> getList() {
    return new ArrayList<>(Arrays.asList("Java", "React", "JavaScript"));
  }
}

