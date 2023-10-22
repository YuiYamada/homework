package homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * HomeWork1020
 */
public class HomeWork1020 {
  public static void main(String[] args) {
    List<Employee> arr = new ArrayList<Employee>(
        Arrays.asList(
            new Employee(100, "田中マルクス闘莉王"),
            new Employee(30, "星野源"),
            new Employee(10, "諏訪尚也"),
            new Employee(20, "里木泰河")));

    System.out.println("ソート前：");
    arr.stream().forEach(
        employee -> System.out.println("社員番号:" + employee.empNo + " 名前:" + employee.name));

    //ラムダ式でComparatorクラスのcompareメソッドを実装
    Comparator<Employee> com = (Employee elm1, Employee elm2) -> {
      return elm1.empNo > elm2.empNo ? 1 : -1;
    };

    Collections.sort(arr, com);
    System.out.println("ソート後：");
    arr.stream().forEach(
        employee -> System.out.println("社員番号:" + employee.empNo + " 名前:" + employee.name));
  }

  private static class Employee {
    public int empNo;
    public String name;

    public Employee(int empNo, String name) {
      this.empNo = empNo;
      this.name = name;
    }
  }
}

// 実行結果
// ソート前：
// 社員番号:100 名前:田中マルクス闘莉王
// 社員番号:30 名前:星野源
// 社員番号:10 名前:諏訪尚也
// 社員番号:20 名前:里木泰河
// ソート後：
// 社員番号:10 名前:諏訪尚也
// 社員番号:20 名前:里木泰河
// 社員番号:30 名前:星野源
// 社員番号:100 名前:田中マルクス闘莉王
