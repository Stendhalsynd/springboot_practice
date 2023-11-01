package codingon.kdt.kdt9.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// getter, setter, 생성자 등을 자동으로 생성
record Person(String name, int age) {}
record Address(String address, int postcode) {}
record Information(String name, int age, Address address) {}
@Configuration
public class HelloWorldConfiguration {
  @Bean
  public String name() {
    return "KDT8";
  }

  @Bean
  public int age() {
    return 30;
  }

  @Bean
  public Person person() {
    return new Person("홍길동", 30);
  }

  @Bean
  public Person person2() {
    return new Person(name(), age());
  }

  @Bean
  public Address address() {
    return new Address("서울시", 1234556);
  }

  @Bean(name = "myaddress")
  @Primary
  public Address address2() {
    return new Address("서울시2", 987654);
  }

  @Bean
  public Information info() {
    return new Information(name(), age(), address());
  }

  @Bean
  @Primary
  public Information info2(String name, int age, Address myaddress) {
    return new Information(name, age, myaddress);
  }
}
