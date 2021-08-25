package spring06di;
//人是主体   主要的类  他需要依赖手机
public class Person {
    public Person(){
        System.out.println("人在容器中诞生了");
    }
    //接口都是抽象的
    private PlayGame playGame;

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }

    /* //私有的  别人不知道有手机  无法给你
        private Phone phone;//人 依赖了手机  所有人拥有了手机

        private Psp psp;

        public void setPsp(Psp psp) {
            this.psp = psp;
        }

        public Phone getPhone() {
            return phone;
        }

        public void setPhone(Phone phone) {//set是暴露给别人看的，让别人看的
            this.phone = phone;
        }
    */
    public void play(){
        System.out.println("人玩手机的方法");
        //phone.game();
        //psp.game();
        playGame.game();
    }
}
