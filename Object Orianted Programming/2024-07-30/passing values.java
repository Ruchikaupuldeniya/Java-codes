class PassingValues {
    int a;
    String game;

    PassingValues(int x, String y){
        a = x;
        game = y;
    }

    public static void main(String args[]){
        PassingValues pass = new PassingValues(10,"Cod");
        System.out.println(pass.a + "\n" + pass.game);
    }
}
