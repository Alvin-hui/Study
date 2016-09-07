package com.company;
import java.util.*;
import com.company.Print.*;
/**
 * Created by kingdee on 2016/8/22.
 */
class Rock {
    Rock(int i)
    {
        System.out.println("rock" + i + ' ');
    }
}

public class SimpleConstructor{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            new Rock(i);
        }
    }
}

