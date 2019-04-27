package edu.uscd.cs;

public class StepsForDays {
    int steps;
    int goal;

    StepsForDays(int goal) {
        this.goal = goal;
        this.steps = 0;
    }
    void inputSteps(int steps) {
        this.steps = steps;
    }
    void addSteps(int steps) {
        this.steps += steps;
    }
    void clearSteps(){
        this.steps = 0;
    }
    int get() { return steps; }
    boolean metGoal(){
        return steps >= goal;
    }
}
