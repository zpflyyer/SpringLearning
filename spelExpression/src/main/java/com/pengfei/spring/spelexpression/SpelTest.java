package com.pengfei.spring.spelexpression;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaopengfei on 2017/1/15.
 */
class SpelTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'HelloSpring!'");
        System.out.println("'HelloSpring' : " + exp.getValue());
        System.out.println("'HelloSpring.concat(!)' : " + parser.parseExpression("'HelloSpring'.concat('!')").getValue());

        Person p =new Person(15,"Jack");
        StandardEvaluationContext ectx = new StandardEvaluationContext();
        ectx.setRootObject(p);
        exp = parser.parseExpression("getName()=='Jack'||age==6");
        System.out.println(exp.getValue(ectx, Boolean.class));

        System.out.println(exp.getValue(p,Boolean.class));

        List<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        ectx.setVariable("list",list);
        StandardEvaluationContext ectx2 = new StandardEvaluationContext();
        ectx2.setVariable("list",list);
        parser.parseExpression("#list[0]").setValue(ectx,false);
        System.out.println(parser.parseExpression("#list[0]").getValue(ectx));
        System.out.println(parser.parseExpression("#list[0]").getValue(ectx2));
    }
}
