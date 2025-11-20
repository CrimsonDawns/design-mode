package com.lcl.第十二章.复合模式.例子;

/**
 * 鹅工厂模式
 */
public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
