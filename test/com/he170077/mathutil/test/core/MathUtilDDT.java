/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.he170077.mathutil.test.core;

import com.he170077.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author sinan
 */
//câu lệnh này chỉ chơi với JUnit báo hiệu rằng cần loop qua tập data để lấy các tập data Input expected nhồi vào hàm
@RunWith(value=Parameterized.class)
public class MathUtilDDT {
                                 //làm tham số
    @Parameterized.Parameters  //JUnit ngầm chạy loop qua từng dòng của mảng để lấy được cặp Data, biến mọi thứ trong hàm                
    public static Object[][] initdata() {
        return new Integer[][]{
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,4},
            {5,20},
    };
        //giả sử đã loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột vào biến tương ứng input  
        //ta vẫn cần gán từng value của cột vào biến tương ứng input ,expected để feed cho hàm 
        
    }
    @Parameterized.Parameter(value = 0)
    public int n;// biến map value của cột 0 của mảng 
    
    @Parameterized.Parameter(value = 1)
    public long expected; // kiểu long vì giá trị trả về là kiểu long 
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
    
    

}
