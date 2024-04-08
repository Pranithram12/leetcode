class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circlesandwitch = 0;
        int squaresandwitch = 0;

        for ( int i=0;i<students.length;i++){    //first find no.of circular and sqaure sandwitches
            if(students[i] == 0){
                circlesandwitch++;
            }
            else{
                squaresandwitch++;
            }
        }

        for(int i=0;i<sandwiches.length;i++){                  
            if(sandwiches[i] == 0 && circlesandwitch == 0){     //if sandwiches are 0 and circlesandwitch are 0 return squaresandwitches.
                return squaresandwitch;
            }
            if(sandwiches[i] == 1 && squaresandwitch == 0){    //if sandwiches are 1 and squaresandwitch are 0 return circlesandwitches.
                return circlesandwitch;
            }

            if(sandwiches[i] == 0){       // sandwitch is 0 minus circlesandwitch.
                circlesandwitch--;
            }
            else{                        // sandwitch is 0 minus sqauresandwitch.
                squaresandwitch--;
            }
        }

        return 0;
    }
}