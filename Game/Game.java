package Game;

public class Game {
    // 게임의 전체적인 부분을 담은 클래스
    public Field field;
    public Player player;
    // public Map map // 스테이지의 지도, 만들예정

    // 싱글톤 기법
    private static Game instance = new Game();

    public static Game getInstance() {
        return instance;
    }

    private Game() {
        field = Field.getInstance();
        player = Player.getInstance();

    }

    public void turnEnd() {
        player.cards.turnEnd();
        for (int i = 0; i < 5; i++) {
            if (field.enemies[i] != null) {
                field.enemies[i].continuePattern();
            }
        }
    }

}
