import javax.swing.JFrame;

public class app{
    public static void main(String[] args) throws Exception{
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("SNAKE");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Snake snakegame = new Snake(boardWidth,boardHeight);
        frame.add(snakegame);
        frame.pack();
        snakegame.requestFocus();

    }
}