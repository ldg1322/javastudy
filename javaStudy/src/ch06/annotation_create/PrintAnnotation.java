package ch06.annotation_create;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})	// 어노테이션이 적용 범위 : 메서드
@Retention(RetentionPolicy.RUNTIME)	// 어노테이션이 유지되는 기간 : Runtime까지 유지
public @interface PrintAnnotation {
	String value() default "-";	// default로 '-'를 출력
	int number() default 15;	// 주의 : 필드명에 ()를 사용 -> 15개를 출력
}
