package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType) {
        int erg = 0;

        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                if (environment[i][j] == enemyType) {
                    erg = erg + 1;

                }
            }

        }
        return erg;
    }

    public int[] countObstaclesPerRow(int row) {

        int[] erg = new int[2];
        int sumH = 0;
        int sumL = 0;

        for (int j = 0; j < environment[row].length; j++) {
            if (environment[row][j] == 'H') {
                sumH = sumH + 1;
            } else if (environment[row][j] == 'L') {
                sumL = sumL + 1;
            }

        }
        erg[0] = sumH;
        erg[1] = sumL;
        return erg;
    }

    public int energyNeededInRow(int row) {
        int erg = 0;

        for (int j = 0; j < environment[row].length; j++) {
            if (environment[row][j] == 'L') {
                erg = -1;

            } else if (environment[row][j] == 'H') {
                erg = erg + 2;
            }

        }
        return erg;
    }


    public int ableToFinishHiking(int points) {
        int erg = 0;

        for (int i = 0; i < environment.length; i++) {
            boolean hasHole=false;
            for(int j=0; j<environment[i].length; j++)
            {
                if(environment[i][j] == 'L') {
                    hasHole=true;
                    break;
                }
            }

            if(!hasHole) {
                int energy = energyNeededInRow(i);
                if (points >= energy) {
                    erg++;
                }
            }
        }
        return erg;
    }
}

