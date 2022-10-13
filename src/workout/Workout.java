package workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    public List<Exercise> exercises;
    public String type;
    public int exerciseCount;

    public Workout(String type, int exerciseCount){
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise){
        if (this.exercises.size() < this.exerciseCount){
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle){
        for (Exercise exercise : this.exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)){
                exercises.remove(exercise);
                return true;
            }
        }
        return false;
    }

    public  Exercise getExercise(String name, String muscle){
        for (Exercise exercise : this.exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)){
                return exercise;
            }
        }
        return null;
    }

    public  Exercise getMostBurnedCaloriesExercise(){
        Exercise exerciseWithMostBurnedCalories = null;
        int mostBurnedCalories = Integer.MIN_VALUE;

        for (Exercise exercise : this.exercises) {
            if (exercise.getBurnedCalories() > mostBurnedCalories){
                mostBurnedCalories = exercise.getBurnedCalories();
                exerciseWithMostBurnedCalories = exercise;
            }
        }
        return exerciseWithMostBurnedCalories;
    }

    public int getExerciseCount(){
        return this.exercises.size();
    }

    public String getStatistics(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Workout type: %s%n", this.type));
        for (Exercise exercise : this.exercises) {
            stringBuilder.append(exercise.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

}
