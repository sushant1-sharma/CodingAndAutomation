package DataStructuresAndAlgorithms.Mathematics;

import org.testng.annotations.Test;

public class sumOf {

    @Test
    public void myCode(){
        int x = 1;
        for(int i=1;i<=128;i+=i){
            x+=x;
        }

        System.out.println(x);
    }
}
