package com.sub.behavioral.interpreter;

import java.util.List;


public interface Expression {
    
    public List<String> interpret(Context ctx);

}
