import java.util.Scanner;

public class UsernameLogin {
    public static void main(String[] args) {
        String userName = "Metehan", loginUsername, loginPassword, password = "asdf";
        int reset,reLogin;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        loginUsername = input.next();
        System.out.print("Şifrenizi Giriniz: ");
        loginPassword = input.next();

        if (userName.equals(loginUsername) && password.equals(loginPassword)) {
            System.out.println("Başarıyla Giriş Yaptınız! ");
        } else {
            System.out.println("Kullanıcı Adınız Veya Parolanız Hatalı!\nŞifrenizi Sıfırlamak İstiyorsanız 1'e Basınız, Çıkmak İçin 0'a Basınız: ");
            reset = input.nextInt();
            if (reset == 1 ){
                    System.out.print("Kullanıcı Adınızı Giriniz: ");
                    userName = input.next();
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    password = input.next();
                    if (loginPassword.equals(password) && loginUsername.equals(userName)){
                        System.out.println("Yeni Şifreniz Eskisi İle Aynı Olamaz!");
                        System.out.println("Program Bitti");
                    }else{
                        System.out.println("Başarıyla Şifreniz Değiştirildi");
                        System.out.print("Yeniden Giriş Yapmak İçin 1'e, Çıkış Yapmak İçin 0'a Basınız: ");
                        reLogin = input.nextInt();
                        if (reLogin == 1){
                            System.out.print("Kullanıcı Adınızı Giriniz:");
                            loginUsername = input.next();
                            System.out.print("Şifrenizi Giriniz: ");
                            loginPassword = input.next();

                            if (password.equals(loginPassword) && userName.equals(loginUsername)){
                                System.out.println("Başarıyla Giriş Yapıldı!");
                                System.out.println("Program Bitti.");
                            }else{
                                System.out.println("Kullanıcı Adınız Veya Parolanız Hatalı!");
                                System.out.println("Program Bitti.");
                            }
                        }else{
                            System.out.println("Program Bitti.");
                        }
                        }
                    }else{
                System.out.println("Program Bitti.");
            }
        }

    }
}










