package practica;

import java.util.List;

public final class Pair<FirstType, SecondType> {
    final private FirstType first;
    final private SecondType second;

    public Pair(FirstType first, SecondType second) {
        this.first  = first;
        this.second = second;
    }

    public FirstType first() {
        return first;
    }

    public SecondType second() {
        return second;
    }

    public int getGradesWeightSum(List<Pair<Integer, Float>> examsStudents) {
        int gradesWeightSum = 0;
        for (Pair<Integer, Float> examGrade : examsStudents) {
            gradesWeightSum += examGrade.first();
        }
        return gradesWeightSum;
    }

    public  float getGradesSum(List<Pair<Integer, Float>> examsStudents) {
        float gradesSum = 0f;
        for (Pair<Integer, Float> examGrade : examsStudents) {
            gradesSum += (examGrade.first() * examGrade.second() / 100);
        }
        return gradesSum;
    }

}
