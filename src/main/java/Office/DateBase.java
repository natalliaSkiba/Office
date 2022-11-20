package Office;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DateBase {

  private String name;
  private int yearBegin;

  static int coefficient;

  public DateBase(String name,int yearBegin){
      this.name = name;
      this.yearBegin = yearBegin;
  }
  public DateBase(int yearBegin){
      this.yearBegin = yearBegin;

  }
  public static void createArray(){
      List <Employee> employeeList = new ArrayList<>();
      employeeList.add(new Employee("Oly",1999));
      employeeList.add(new Employee("Katy", 1900));
      employeeList.add(new Employee("Ivan", 2010));
      employeeList.add(new Employee("Kolyn", 2022));
      System.out.println(Arrays.toString(new List[]{employeeList}));


    }


  static int getCoefficient( int yearBegin) {
      int yearNow = LocalDate.now().getYear();
      int yearWork = yearNow - yearBegin;
      if (yearWork <= 3) {
          coefficient = 1;
      }
      if (yearWork > 3 & yearWork<= 5 ) {
          coefficient = 2;
      }
      if (yearWork > 5 & yearWork <= 10 ) {
          coefficient = 3;
      }
      if (yearWork > 10 ) {
          coefficient = 5;
      }

      return coefficient;
  }
}
