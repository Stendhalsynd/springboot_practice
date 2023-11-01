package codingon.kdt.kdt9.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@AllArgsConstructor
@Getter
class Person {
  private String name;
  private Integer age;

  static Person getInstance(String name, Integer age) {
    return new Person(name, age);
  }
}


@Controller
public class HelloController {
  // 해당 파일이 없을때 기본적으로는 static 의 정적파일을 열어준다.
  @GetMapping("/")
  public String getHello(Model model) {
//    model.addAttribute("msg", "<strong>hello</strong>");
//    model.addAttribute("name", "kim");
//    ArrayList<String> coffee = new ArrayList<>();
//    coffee.add("americano");
//    coffee.add("orange");
//    model.addAttribute("coffee", coffee);

//    model.addAttribute("age", 20);

    ArrayList<Person> person = new ArrayList<>();
    person.add(Person.getInstance("kim", 10));
    person.add(Person.getInstance("lee", 20));
    person.add(Person.getInstance("hong", 30));
    person.add(Person.getInstance("park", 40));
    person.add(Person.getInstance("shin", 50));

    model.addAttribute("person", person);

    return "hello"; // 컨트롤러 내 리턴은 파일명과 같아야 한다. 이 파일은 템플릿에서 찾는다.
  }
  @GetMapping("/hello")
  public String getHello2() {
    return "hello";
  }
}
