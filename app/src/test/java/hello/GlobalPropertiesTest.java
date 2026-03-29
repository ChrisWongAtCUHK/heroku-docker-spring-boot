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
@EnableConfigurationProperties(GlobalProperties.class)
public class GlobalPropertiesTest {

  @Autowired
  private GlobalProperties globalProperties;

  @Test
  public void testBinding() {
    assertNotNull("test@mkyong.com", globalProperties.getEmail());
  }
}