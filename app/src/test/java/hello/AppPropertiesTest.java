package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableConfigurationProperties(AppProperties.class)
public class AppPropertiesTest {

  @Autowired
  private AppProperties appProperties;

  @Test
  public void testBinding() {
    assertNotNull("/error/", appProperties.getError());
  }
}