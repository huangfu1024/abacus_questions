package com.hf.exercise;

import java.util.Random;

/**
 * 适用于幼儿园级别的儿童
 * 加减4则运算
 * 1. 每个数子在10以内
 * 2. 算法符限于+、-
 * 3. 每段运算结果不超过20，不低于0
 */
public class ExerciseForTen {

    public static void main(String[] args) {
        for (int page = 0; page < 5; page++) {
            for (int i = 0; i < 40; i++) {
                System.out.println((i + 1) + ". " + new ExerciseForTen().buildArithmetic());
            }
        }
    }

    /**
     * 公式生成
     */
    String buildArithmetic(){

        StringBuffer sb = new StringBuffer();
        // 1. 随机获取第一个数字
        int n1 = getInnerTen();
        sb.append(n1);
        // 2. 生成运算符、第二个数字
        int sTemp = n1;
        while (true){
            int temp = n1;
            String operator = getOperator();
            int n2 = getInnerTen();
            if(operator.equals("+")){
                temp += n2;
            }else {
                temp -= n2;
            }
            if (temp > 0 && temp < 20){
                sb.append(operator);
                sb.append(n2);
                sTemp = temp;
                break;
            }
        }
        // 3. 生成运算符、第三个数字
        while (true){
            int temp = sTemp;
            String operator = getOperator();
            int n2 = getInnerTen();
            if(operator.equals("+")){
                temp += n2;
            }else {
                temp -= n2;
            }
            if (temp > 0 && temp < 20){
                sb.append(operator);
                sb.append(n2);
                sTemp = temp;
                break;
            }
        }
        // 4. 生成运算符、第四个数字
        while (true){
            int temp = sTemp;
            String operator = getOperator();
            int n2 = getInnerTen();
            if(operator.equals("+")){
                temp += n2;
            }else {
                temp -= n2;
            }
            if (temp > 0 && temp < 20){
                sb.append(operator);
                sb.append(n2);
                sTemp = temp;
                break;
            }
        }
        sb.append("=");
        return sb.toString();
    }

    /**
     * 随机获取10以内的数字
     */
    int getInnerTen(){
        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }

    /**
     * 随机获取运算符
     */
    String getOperator(){
        Random rand = new Random();
        if (rand.nextInt(2) == 0){
            return "+";
        }else {
            return "-";
        }
    }
}
