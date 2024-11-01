package com.example.demo2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
  @Id//기본키
  private int id;
  private String name;
  private int age;
  private String address;
//Getter와 Setter는 어노테이션이 있으면 만들지 않아도 된다.
  //이유:Lombok 라이브러리를 사용하면, @Getter와 @Setter 어노테이션을 통해
  // 해당 클래스의 필드에 대한 getter와 setter 메서드를 자동으로 생성할 수 있습니다.
  // 이 어노테이션들이 적용되면, 컴파일 시점에 실제 메서드가 생성되기 때문에
  // 개발자는 코드에서 수동으로 메서드를 작성할 필요가 없습
  //코드의 간결성, 유지보수성, 가독성
}
