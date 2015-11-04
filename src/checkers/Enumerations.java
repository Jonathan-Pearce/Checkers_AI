package checkers;

enum CellEntry{ 
    inValid,
    empty,
    white,
    whiteKing,
    black,
    blackKing
}

enum Player{
    white,
    black    
}

enum Owner{
    HUMAN,
    ROBOT
}

enum MoveDir{
    forwardLeft,
    forwardRight,
    backwardLeft,
    backwardRight
}