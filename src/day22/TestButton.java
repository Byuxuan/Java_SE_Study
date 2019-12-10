package day22;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton {
    public static void main(String[] args) {
        Frame frame = new Frame("Test Button");
        // Button抽象的主题角色  button 具体的主题角色

        Button button = new Button("B1");
        button.addActionListener(new ButtonHandler()); //主题注册观察者也就是监听器
        frame.add(button);
        //增加事件处理器

        frame.pack();
        frame.setVisible(true);


    }
}

/**
 * addActionListener(ActionListener)
 * 给Button添加一个事件处理器，该处理器会自动调用actionPerformed方法
 *
 * 我们需要自定义一个处理器，实现ActionListener接口，同时重写该方法
 * 当事件发生时，实现ActionListener接口的对象获得此ActionEvent，而ActionEvent对象就是点击 Button自动生成的
 */


/**
 * 实际的观察者
 */
class ButtonHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand(); //返回事件源的名称

        System.out.println(str+" Button is pressed");
    }
}