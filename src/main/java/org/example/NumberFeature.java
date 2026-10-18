package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        //你的代码逻辑
        int pos = 1; 
        int temp = inputNumber;
        result = 0;
        while(temp > 0){
            int digit = temp % 10; 
            if( (digit % 2) == (pos % 2) ){
                result += (1 << (pos - 1)); // 2的(pos-1)次方
            }
            temp = temp / 10; 
            pos++; 
}

        result = inputNumber;

        System.out.println(result);
    }
}
