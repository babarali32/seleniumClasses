//package D.TestPackage;
//
//import A.TestBasePackage.BaseClass;
//import B.pagesPackage.PrintWelcome;
//
//public class TesterPageFactory {
//    public static void main(String[] args) {
//
//        BaseClass.OpenBrowser("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
//        PrintWelcome obj2=new PrintWelcome();
//        LoginWithPageFactory obj=new LoginWithPageFactory();
//        obj.userName.sendKeys("Admin");
//        obj.password.sendKeys("Hum@nhrm123");
//        obj.login.click();
//
////        TakesScreenshot tss=(TakesScreenshot)driver;
////        File copy=tss.getScreenshotAs(OutputType.FILE);
////        try {
////            FileUtils.copyFile(copy,new File("utils/first/second.png"));
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//
//        String printval=obj2.wlme.getText();
//        System.out.println(printval);
//
//        BaseClass.closeBrowser();
//    }
//}
