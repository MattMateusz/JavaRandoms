package org.algorythms;

public class HanoiTower {
    public static void display(int [][] tower) {
        for(int i = 0; i < tower.length; i++) {
            for(int j = 0; j < tower[i].length; j++) {
                System.out.print(tower[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void algorithmStart() {
        int[][] tower = {{1, 0, 0}, {2, 0, 0}, {3, 0, 0}};
        for(int i = 0; i < 7; i++) {
            HanoiTower.display(tower);
            System.out.println(" ");
            if(tower[0][0] > tower[2][1] && tower[0][0] > tower[2][2]) {
                tower[2][2] = tower[0][0];
                tower[0][0] = 0;
            }
            else if(tower[1][0] < tower[2][0] && tower[2][0] > tower[2][2] && i == 1) {
                tower[2][1] = 2;
                tower[1][0] = 0;
            }
            else if(tower[2][2] < tower[2][1] && tower[1][1] < tower[2][2] && tower[2][0] > tower[2][1]) {
                tower[1][1] = 1;
                tower[2][2] = 0;
            }
            else if(tower[2][1] < tower[2][0] && tower[1][1] < tower[2][0] && i == 3) {
                tower[2][2] = 3;
                tower[2][0] = 0;
            }
            else if(tower[2][2] > tower[2][1] && tower[1][1] < tower[2][1] && i == 4) {
                tower[2][0] = 1;
                tower[1][1] = 0;
            }
            else if(tower[2][0] < tower[2][1] && tower[2][2] > tower[2][1]) {
                tower[1][2] = tower[2][1];
                tower[2][1] = 0;
            }
            else if(tower[2][2] > tower[2][0] && tower[1][2] > tower[2][0]) {
                tower[0][2] = tower[2][0];
                tower[2][0] = 0;
            }
        }
        display(tower);
    }
}
