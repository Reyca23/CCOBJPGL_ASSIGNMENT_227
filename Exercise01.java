public class App {
    static boolean IWillReview = true;
    static boolean IWillNotFail = true;

    public static void main(String[]args) throws Exception{

        App MakakapasaAko = new App();

        //pre Condition
        assert IWillReview == true: "ASAR TALO!!!";


        MakakapasaAko.Study();

        
        assert IWillNotFail == true: "nakakainis kasi bumagsak ako!!!!!-,-";
        System.out.println(IWillNotFail);
        System.out.println(IWillReview);



    }
    void Study(){
        IWillReview = false;
        IWillNotFail = false;
    }
}
