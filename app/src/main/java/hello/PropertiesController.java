package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.AppProperties.Menu;

@RestController
public class PropertiesController {
  @Autowired
  private AppProperties appProperties;
  
  @Autowired
  private GlobalProperties globalProperties;

  @GetMapping("/properties/app")
  public String app() {
    StringBuilder sb = new StringBuilder("&nbsp;&nbsp;menus:<br/>");
    List<Menu> menus = appProperties.getMenus();
    for(Menu menu: menus){
      sb.append("&nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;title:&nbsp;" + menu.getTitle() + "<br/>");
      sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;name:&nbsp;" + menu.getName() + "<br/>");
      sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;path:&nbsp;" + menu.getPath() + "<br/>");
    }
    
    return "app:<br/>" + sb.toString() + "<br/>" + 
            "&nbsp;&nbsp;compiler:<br/>" +
              "&nbsp;&nbsp;&nbsp;&nbsp;timeout:&nbsp;" + appProperties.getCompiler().getTimeout() + "<br/>" + 
              "&nbsp;&nbsp;&nbsp;&nbsp;output-folder:&nbsp;" + appProperties.getCompiler().getOutputFolder() + "<br/>" + 
            "&nbsp;&nbsp;error:&nbsp;" + appProperties.getError();
  }

  @GetMapping("/properties/global")
  public String global() {
    return "email:&nbsp;" + globalProperties.getEmail() + "<br/>" +
          "thread-pool:&nbsp;" + globalProperties.getThreadPool() + "<br/>";

  }
}
