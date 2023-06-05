package practice7.Front;

public class ComputerActivation {
    public static void pressingStartButton(){
        System.out.println("Включение...");
        BIOSLoading.startLoading();
        BIOSLoading.endLoading();
        OSCoreProcessing.programsLoading();
        UserAuthorization.enterPassword("suser.password");
    }
}
