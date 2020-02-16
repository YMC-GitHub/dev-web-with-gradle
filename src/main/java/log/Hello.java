// my package name
package log;

// include some package
import org.apache.log4j.Logger;

// create my class
public class Hello {
  private static Logger logger = Logger.getLogger(Hello.class);

  public static void main(String[] args) {
    logger.info("hello,world. welcome to gradle");
  }
}