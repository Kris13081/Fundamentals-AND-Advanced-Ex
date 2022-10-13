package workout;

public class Main {
    public static void main(String[] args) {

        Exercise legPress = new Exercise("Leg Press", "legs", 65);
        Exercise preacher = new Exercise("preacher", "abs", 30);
        Exercise curl = new Exercise("curl", "arms", 20);

        Workout workout = new Workout("legs", 3);
        workout.addExercise(legPress);
        workout.addExercise(preacher);
        workout.addExercise(curl);

        System.out.println(workout.getStatistics());
        System.out.println();

    }
}
