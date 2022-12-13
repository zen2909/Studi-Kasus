package Admin;
import javax.swing.*;
import java.util.Scanner;
public class login extends Staff {
    String username;
    int pin,i;
    boolean ulang = false;
    private JPanel login;
    private JTextField TfUsername;
    private JTextField TfPin;
    private JButton loginButton;

    public login() {
        for( i=0;i<1000;i++){
        this.proses();
        super.setUsername("zainul");
        super.setPin(1234);
            if (!this.username.equals(super.getUsername())) {
                System.out.println("username salah");
                System.out.println("====================");
                this.ulang = true;
                if (this.pin!=super.getPin()){
                    System.out.println("Pin salah");
                    System.out.println("====================");
                }
            } else if (this.pin != super.getPin()) {
                    System.out.println("Pin Salah");
                    System.out.println("====================");
                    this.ulang = true;
                }else{
                    System.out.println("====================");
                    this.ulang = false;
                }

            if (this.ulang ==  true){
                i++;
            }else{
                i=1000;
            }


        }
}

    void proses(){
        Scanner input = new Scanner(System.in);
        String nama;
        int kode;
        System.out.print("Masukkan Username: ");
        nama = input.nextLine();
        System.out.print("Masukkan Pin: ");
        kode = input.nextInt();

        this.username = nama;
        this.pin = kode;
    }
}

