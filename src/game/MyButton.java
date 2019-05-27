
package game;

import javax.swing.JButton;


public class MyButton extends JButton{
    
    private int number;
    private String text;
    private boolean covered;
    public MyButton(){}
    public MyButton(int number){
    super("");
    this.number = number;
    covered = true;

}
    public void uncover() {
        if (this.covered){
            this.covered = false;
            this.setText(Integer.toString(number));
           // this.setEnabled(false);
        }
        else{
            this.covered = true;
            this.setText("");
          //  this.setEnabled(true);
        }
    }
    public boolean match(MyButton button){
        if(this.number == button.number) return true;
        else return false;
    }
    public boolean sameButton(MyButton button){
        return this == button;
    }

    
    
}
