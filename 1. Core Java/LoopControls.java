import java.util.*;

// LOOP CONTROLS & DECISION MAKING
// A loop statement allows us to execute a statement or group of statements multiple times

// Types of Loops:
// 1. While Loops
// 2. For Loops
// 3. Do-While Loops
// 4. Enhanced For Loop (Advanced version of For Loop)

class LoopControls{
    public static void main(String args[])
    {
        // 1. While Loops in Java
        // When executing, if the boolean_expression result is true, then the actions inside the loop will be executed. This will continue as long as the expression result is true.
        int x = 10;
        while(x < 20)
        {
            System.out.println(x);
            x++; // Increment Operator
        }

        // 2. For Loop: for(initialization; Boolean_expression; update) 
        for(int i=20;i>=10;i--)
        {
            System.out.println(i);
        }

        // 3. Do-While Loop: A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
        int y = 10;
        do {
            System.out.println(y);
            y++;
        }while( y < 20 );

        // 4. Enhanced For Loop
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(Integer ele:list)
        {
            System.out.println(ele);
        }
        
        // ----------------------- DECISION MAKING ---------------------------
        // Java’s Decision Making  statements: 
        // a.if
        // b.if-else
        // c.nested-if
        // d.if-else-if
        // e.switch-case

        // 1. IF Statement
        int i = 10;
        if (i < 15)
            System.out.println("Inside If block");
        System.out.println("10 is less than 15");


        // 2. If-Else Statement 
        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");

        // 3. Nested-If Statement
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too");
        } else{
                System.out.println("i is greater than 15");
        }

        // 4. If-Else-If Statements
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");

        // 5. Switch-Case
        switch(i)
        {
            case 10:
            System.out.println("It's 10");
            break;

            case 20:
            System.out.println("It's 20");
            break;

            default:
            System.out.println("Some Random Number");
            break;
        }

    }
}


