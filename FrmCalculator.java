import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCalculator {
    private double Quantity1 = 0.0; // จำนวนที่ 1
    private double Quantity2 = 0.0; // จำนวนที่ 2
    private char Math_Operator; // ตรวจสอบค่าของตัวแปร สัญลักษณ์ + - * /

    private JPanel MainJPCalc;
    private JTextField TextDisplay;
    private JRadioButton rdON;
    private JRadioButton rdOFF;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnMultiply;
    private JButton btnBack;
    private JButton btnClear;
    private JButton btnDivine;
    private JPanel NumberJP;
    private JPanel ClearJP;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnMinus;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnPlus;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnEqual;
    ButtonGroup btnGroup = new ButtonGroup(); // Set rdON & rdOFF ให้ทำงานแค่ปุ่มเดียว
    private void Get_Operator(String btnText){
        Math_Operator = btnText.charAt(0);
        Quantity1 = Quantity1 + Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText("");
    }
    public void disable(){ // Set rdOFF
        TextDisplay.setEnabled(false);
        btnBack.setEnabled(false);
        btnClear.setEnabled(false);

        btnDivine.setEnabled(false);
        btnPlus.setEnabled(false);
        btnMinus.setEnabled(false);
        btnMultiply.setEnabled(false);

        btnPoint.setEnabled(false);
        btnEqual.setEnabled(false);

        btnZero.setEnabled(false);
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        btnFive.setEnabled(false);
        btnSix.setEnabled(false);
        btnSeven.setEnabled(false);
        btnEight.setEnabled(false);
        btnNine.setEnabled(false);

        rdON.setEnabled(true);
        rdOFF.setEnabled(false);
    }
    public void enable(){ // Set rdON
        TextDisplay.setEnabled(true);
        btnBack.setEnabled(true);
        btnClear.setEnabled(true);

        btnDivine.setEnabled(true);
        btnPlus.setEnabled(true);
        btnMinus.setEnabled(true);
        btnMultiply.setEnabled(true);

        btnPoint.setEnabled(true);
        btnEqual.setEnabled(true);

        btnZero.setEnabled(true);
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);

        rdON.setEnabled(false);
        rdOFF.setEnabled(true);
    }
    public FrmCalculator(){
        rdON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
                btnGroup.add(rdON); // Group เรียกใช้งาน rdON & rdOFF ให้ทำงานปุ่มใดปุ่มหนึ่ง
                btnGroup.add(rdOFF);
            }
        });
        rdOFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = TextDisplay.getText() + btnOne.getText();
                TextDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = TextDisplay.getText() + btnTwo.getText();
                TextDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = TextDisplay.getText() + btnThree.getText();
                TextDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = TextDisplay.getText() + btnFour.getText();
                TextDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = TextDisplay.getText() + btnFive.getText();
                TextDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = TextDisplay.getText() + btnSix.getText();
                TextDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = TextDisplay.getText() + btnSeven.getText();
                TextDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = TextDisplay.getText() + btnEight.getText();
                TextDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = TextDisplay.getText() + btnNine.getText();
                TextDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = TextDisplay.getText() + btnZero.getText();
                TextDisplay.setText(btnZeroText);
            }
        });

        // Switch-Case ใช้ในการตรวจสอบค่าของ ตัวแปร(Math_Operator) ซึ่งอยู่ในรูปของสัญลักษณ์ + - * / และดำเนินการคำนวณตามสัญลักษณ์ที่ได้รับเข้ามา
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (Math_Operator) {
                    case '+':
                        Quantity2 = Quantity1 + Double.parseDouble(TextDisplay.getText());
                        break;
                    case '-':
                        Quantity2 = Quantity1 + Double.parseDouble(TextDisplay.getText());
                        break;
                    case '*':
                        Quantity2 = Quantity1 + Double.parseDouble(TextDisplay.getText());
                        break;
                    case'/':
                        Quantity2 = Quantity1 + Double.parseDouble(TextDisplay.getText());
                        // Switch-Case ตรวจสอบตัวแปร Math_Operator สัญลักษณ์ + - * / และทำการคำนวณ
                }
                // Double.toString(Quantity2) แปลงค่าตัวแปร QT2 จากตัวเลขเป็นข้อความ(String) และนำไปแสดงผลเป็นข้อความบนหน้าจอ TxtDis
                // กำหนด QT1 เป็น 0 เพื่อให้สามารถทำการคำนวณต่อได้จากค่าใหม่ที่รับเข้ามาใหม่ โดยล้างค่า QT1 เพื่อให้เริ่มการคำนวณใหม่
                TextDisplay.setText(Double.toString(Quantity2));
                Quantity1 = 0;
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String Button_Text = btnPlus.getText();
                // เป็นการดึงข้อความที่อยู่ใน btnPlus และเก็บไว้ในตัวแปร Button_Text(เป็นข้อมูลประเภท String)
                String Button_Text = btnPlus.getText();
                Get_Operator(Button_Text);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String Button_Text = btnMinus.getText();
                // เป็นการดึงข้อความที่อยู่ใน btnMinus และเก็บไว้ในตัวแปร Button_Text(เป็นข้อมูลประเภท String)
                String Button_Text = btnMinus.getText();
                Get_Operator(Button_Text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String Button_Text = btnMultiply.getText();
                // เป็นการดึงข้อความที่อยู่ใน btnMultiply และเก็บไว้ในตัวแปร Button_Text(เป็นข้อมูลประเภท String)
                String Button_Text = btnMultiply.getText();
                Get_Operator(Button_Text);
            }
        });
        btnDivine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String Button_Text = btnDivine.getText();
                // เป็นการดึงข้อความที่อยู่ใน btnDivine และเก็บไว้ในตัวแปร Button_Text(เป็นข้อมูลประเภท String)
                String Button_Text = btnDivine.getText();
                Get_Operator(Button_Text);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int TextLength = TextDisplay.getText().length(); // ดึงข้อมูลจำนวนตัวอักษร(หรือความยาว) ของข้อความที่ปรากฎบน TextDisplay และเก็บค่าไว้ในตัวแปร int ที่ชื่อ Textlength
                int Number = TextDisplay.getText().length()-1; // ตัวแปร int ชื่อ Number กำหนดค่าให้เท่ากับความยาวของข้อความที่ได้รับจาก TextDisplay ลบด้วย 1 ()
                String Store; // ตัวแปร String ชื่อว่า Store เอาไว้เก็บข้อมูล
                if (TextLength > 0)
                {
                    StringBuilder Back = new StringBuilder(TextDisplay.getText()); // StringBuilder คือ Class ไว้สำหรับการจัดการกับ String โดยสามารถแก้ไข String ได้โดยตรง โดยไม่ต้องสร้าง String ใหม่ขึ้นมา
                    Back.deleteCharAt(Number); // .deleteCharAt เป็นการลบอักขระหรือตัวอักษรในลำดับของ Number โดยลดลงทีละ 1
                    Store = Back.toString(); // Back.toString ให้เอาข้อความที่เก็บไว้ใน Store โดยที่ยังไม่ลบทั้งหมด
                    TextDisplay.setText(Store); // ให้ Store โชว์ใน TextDisplay
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quantity2 = 0;
                TextDisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextDisplay.getText().equals("")) // ถ้า TextDisplay ไม่มีข้อความ(คือค่าว่าง)
                {
                    TextDisplay.setText("0."); // ให้ TextDisplay แสดง 0.
                }
                else if (TextDisplay.getText().contains(".")) // ถ้า TextDisplay มีตัวอักษร "." อยู่แล้ว
                {
                    btnPoint.setEnabled(false); // ให้ปุ่ม "." หรือ btnPoint ไม่สามารถกดได้
                }
                else {
                    String btnPointText = TextDisplay.getText() + btnPoint.getText(); // ถ้า TextDisplay ไม่มี "."
                    TextDisplay.setText(btnPointText); // ให้เพิ่ม "." เข้าไปที่ TextDisplay
                }
                btnPoint.setEnabled(true); // ถ้าเงื่อนไขทั้ง 3 เงื่อนไขด้านบน ไม่มี "." อยู่แล้วก็จะไม่เพิ่ม "." มาอีก
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new FrmCalculator().MainJPCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 250);
        frame.pack();
        frame.setVisible(true);
    }
}
