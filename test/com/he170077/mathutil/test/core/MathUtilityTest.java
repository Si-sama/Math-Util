/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.he170077.mathutil.test.core;

import com.he170077.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author sinan
 */
public class MathUtilityTest {
    //đây là class sẽ sử dụng hàm thư viện /framwork JUNIT 
    // để kiểm thử / kiểm tra code chính - hàm tính giai thừa 
    //VIẾT CODE ĐỂ TEST CODE
    //có quy tắc đặt tên hàm kiểm thử, thường sẽ là nói lên mục đích của kiểm thử , của các case
    //tình huống kiểm thử , tính huống xài hàm theo kiểu thành công , thất bại
    // tình huống dưới đây là test hàm chạy thành công , trả về ngon 
    // có nhiều @Test để kiểm thử hàm tính giai thừa  

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;// test thử tình huống tử tế đầu vào mà ta phải chạy đúng 
        long expected = 1;
        long actual; // gọi hàm bên cần Test 
        actual = MathUtility.getFactorial(n);

        // so sánh dùng FRAMEWORK
        Assert.assertEquals(expected, actual);
        // hàm giúp so sánh 2 giá trị nào đó giống nhau không ? trong test case này
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(4, MathUtility.getFactorial(4));

    }
        //đưa data sai lệch --> kì vọng sai lệch xuất hiện
        // nếu hàm nhận n<0 và n>20  và ném ra ngoại lệ --> hàm chạy đúng như thiết kế
       // nếu hàm nhận n<0 và n>20  và ko  ném ra ngoại lệ --> hàm chạy sai kì vọng như thiết kế
       //tình huống bất thường, ngoài dự tính là những thứ không thể đo lường , so sánh trực tiếp bằng value
      //assertEquals là kĩ thuật dùng so sánh 2 ngoại lệ
      //equals là bằng nhau trên value
     // hàm có ném ngoại lệ nhưng không phải ngoại lệ ta kì vọng chứ không phải hàm ném sai 
    @Test  (expected = IllegalArgumentException.class)
     public void testGetFactorialGivenWrongArgumentThrowsException() {
         MathUtility.getFactorial(-5);// hàm @Test chạy , hay getF() chạy 
                                        // sẽ ném ngoại lệ numberFormat...
     }
     @Test
      public void testGetFactorialGivenWrongArgumentThrowsExceptionUsingLambda() {
         Assert.assertThrows(IllegalArgumentException.class, () -> { 
             MathUtility.getFactorial(-5);
             
         });
        
     }
       @Test
      public void testGetFactorialGivenWrongArgumentThrowsExceptionUsingTryCatch() {
           try {
               MathUtility.getFactorial(-5);// test vẫn pass vì đã chủ động bắt ngoại lệ r
           } catch (Exception e) {
              // Assert.assertEquals(e.getMessage(), "Invalid Argument.N must between 0 to 20");
           }
        
     }
      //CLEAN AND BUILD: gọi JDK hoặc MAVEN hoặc ANT đóng gói thành file jar
      //CLEAN 
      
      
     
     //cách khác để bắt ngoại lệ xuất hiện
    
    public MathUtilityTest() {
    }
   
}
