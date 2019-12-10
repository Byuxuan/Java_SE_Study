package day18;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MyAnnocation {
//    String value() default "hello";
//
//    EnumTest value2();

    String hello() default "shengsiyuan";

    String world();

}
enum EnumTest{
    Hello,World,Welcome;
}