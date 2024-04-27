/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.he170077.mathutil.core;

/**
 *
 * @author sinan
 */
public class MathUtility {

    // trong class này cung cấp rất nhiều hàm xử lí toán học 
    //clone class của java, của jdk
    // hàm thư viện dùng chung và không lưu lại giá trị , ta chọn thiết kế là hàm static 
    // hàm tính giai thừa
    //n!=1.2.3.4....n
    // không có giai thùa âm , 0!=1!=1
    // 20 giai thừa là 18 con số 0 , vừa đủ kiểu long , nhiều hơn sẽ tràn 
    // quy ước : tính giai thừa trong khoảng từ 1....20.
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Argument.N must"
                    + " between 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; // tích nhân dồn 
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
