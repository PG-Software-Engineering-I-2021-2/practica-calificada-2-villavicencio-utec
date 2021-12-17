import java.util.AbstractMap;
import java.util.List;
import java.util.Map;


public class Principal {
    final private Map<Integer, List<Pair<Teacher, Boolean>>> allYearsTeachers = Map.ofEntries(
            new AbstractMap.SimpleImmutableEntry<>(
                    2020,
                    List.of(
                            new Pair<>( new ProfesorTP("Josefina"), true),
                            new Pair<>( new ProfesorTP("Edonisio"), true),
                            new Pair<>( new ProfesorTP("Edufasio"), false)
                    )
            ),
            new AbstractMap.SimpleImmutableEntry<>(
                    2019,
                    List.of(
                            new Pair<>( new ProfesorTP("Eduarda"), false),
                            new Pair<>( new ProfesorTP("Abelardo"), false),
                            new Pair<>( new ProfesorTP("Francisca"), false)
                    )
            )
    );
    private final int yearToCalculate;

    public Principal(int yearToCalculate) {
        this.yearToCalculate = yearToCalculate;
    }

    public float calculateGrades(final List<Pair<Integer, Float>> examsStudents, final boolean hasReachedMinimumClasses) {
        if (!examsStudents.isEmpty()) {
            Pair lPair = new Pair(1,1);

            float gradesSum       = lPair.getGradesSum(examsStudents);
            int   gradesWeightSum = lPair.getGradesWeightSum(examsStudents);

            return formatFloat(hasReachedMinimumClasses, gradesSum, gradesWeightSum);

        } else {
            return 0f;
        }
    }

    private float formatFloat(boolean hasReachedMinimumClasses, float gradesSum, int gradesWeightSum) {
        if (gradesWeightSum == 100) {
            if (hasReachedMinimumClasses) {
                if (isHasToIncreaseOneExtraPoint()) {
                    return Float.min(10f, gradesSum + 1);
                } else {
                    return gradesSum;
                }
            } else {
                return 0f;
            }
        } else if (gradesWeightSum > 100) {
            return -1f;
        } else {
            return -2f;
        }
    }

    private boolean isHasToIncreaseOneExtraPoint() {
        boolean hasToIncreaseOneExtraPoint = false;
        for (Map.Entry<Integer, List<Pair<Teacher, Boolean>>> yearlyTeachers : allYearsTeachers.entrySet()) {
            if (!(yearToCalculate != yearlyTeachers.getKey())) {
                List<Pair<Teacher, Boolean>> teachers = yearlyTeachers.getValue();
                for (Pair<Teacher, Boolean> teacher : teachers) {
                    if (teacher.second() != true && isProfesorTC(teacher.first())) {
                        continue;
                    }
                    hasToIncreaseOneExtraPoint = true;
                    System.out.printf(teacher.first().nombre);
                }
            } else {
                continue;
            }
        }
        return hasToIncreaseOneExtraPoint;
    }
    public boolean isProfesorTC(Teacher prTeacher){
        return prTeacher.getClass() == ProfesorTC.class ? true: false;
    }

    public static void main(String[] args) {
        System.out.println("Hola");
    }
}