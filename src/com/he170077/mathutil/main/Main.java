/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.he170077.mathutil.main;

import com.he170077.mathutil.core.MathUtility;

/**
 *
 * @author sinan
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm , coi hàm tính giai thừa có chạy đúng như thiết kế hay không 
        // ta phải đưa các tình huống sử dụng hàm trong thực tế 
        // VD : đưa vào 0, 21 ,20 ....
        //Test case : 1 tình huống app /màn hình / tính năng được đưa vào sử dụng 
        // hành vi xài giả lập của ai đó 
        //INPUT DATA đầu vào cự thể 
        //OUTPUT đầu ra ứng với xử lí của hàm / chức năng của app , dĩ nhiên dùng đầu vào xử lí 
        // So sánh để xem kết quả có như kì vọng hay không
        long expected =120; // kì vọng 120 nếu tính 5!
        int n = 5;  //input , 1 test case
        long actual =MathUtility.getFactorial(n);
        System.out.println("EXPECTED : 5! = "+expected);
        System.out.println("ACTUAL : 5! = "+actual);
    }
}
