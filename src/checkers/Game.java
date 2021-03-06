package checkers;

public class Game {
    
    static Board board;
    
    Game()
    {
        this.Initialize(UserInteractions.GameChoice().charAt(0));
    }
    
    public void PlayGame()
    {   
        while(!Game.board.CheckGameComplete())
        {  
            if(Game.board.CheckGameDraw(Player.white)){
                break;
            }
            
            White.Move();
            if(Game.board.CheckGameComplete()){
                UserInteractions.DisplayGreetings(Player.white);
                Game.board.Display();
                break;
            }

            if(Game.board.CheckGameDraw(Player.black)){
                break;
            }
            
            Game.board.Display();
            
            Black.Move();
            if(Game.board.CheckGameComplete()){
                UserInteractions.DisplayGreetings(Player.black);                
                Game.board.Display();
                break;
            }
        }
    }
    
   
    private void Initialize(char human)
    {        
        assert(human=='w' || human=='b' || human == 'a' || human == 'n');
        
        board  = new Board();
        switch(human)
        {            
            case 'w':
                White.owner = Owner.HUMAN;
                Black.owner = Owner.ROBOT;
                break;
            case 'b':            
                White.owner = Owner.ROBOT;
                Black.owner = Owner.HUMAN;
                break;
            case 'a':            
                White.owner = Owner.HUMAN;
                Black.owner = Owner.HUMAN;
                break;
            case 'n':            
                White.owner = Owner.ROBOT;
                Black.owner = Owner.ROBOT;
                break;
        }
    }
}