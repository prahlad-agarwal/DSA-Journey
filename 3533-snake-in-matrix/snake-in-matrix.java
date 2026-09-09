class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;

        for (String word : commands) {
            if(word.equals("UP")) x--;
            else if(word.equals("RIGHT")) y++;
            else if(word.equals("DOWN")) x++;
            else if(word.equals("LEFT")) y--;
        }

        return (x * n) + y;
    }
}