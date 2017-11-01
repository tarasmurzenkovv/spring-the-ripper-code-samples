package solutions;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularReferenceSolutionsTests {

    @BeforeClass
    public static void problemSpecification() {
        try {
            System.out.println("\n Problem statement: try to inject circular dependency \n " +
                    "serviceA.setServiceB(serviceB) \n " +
                    "serviceB.setServiceA(serviceA) \n");
            final String packageWithProblem = "com.taras.murzenkov.circular.reference.problem";
            setUp(packageWithProblem);
        } catch (UnsatisfiedDependencyException e) {
            System.out.println("Problem occurred: " + e.getMessage());
        }
    }

    @Test
    public void solution1UseSetterInjection() {
        System.out.println("\nSolution 1: use setter based injection");
        final String packageWithSolution = "com.taras.murzenkov.circular.reference.solution.setterbased_injection";
        setUp(packageWithSolution);
    }

    @Test
    public void solution2UsePostConstructAnnotation() {
        System.out.println("\nSolution 2: use postconstruct annotation");
        final String packageWithSolution = "com.taras.murzenkov.circular.reference.solution.postconstruct";
        setUp(packageWithSolution);
    }

    @Test
    public void solution3DirectlyAccessSpringContext() {
        System.out.println("\nSolution 3: directly access spring context");
        final String packageWithSolution = "com.taras.murzenkov.circular.reference.solution.access_to_spring_context";
        setUp(packageWithSolution);
    }

    @Test
    public void solution4UseLazyAnnotation() {
        System.out.println("\nSolution 4: use lazy annotation");
        final String packageWithSolution = "com.taras.murzenkov.circular.reference.solution.access_to_spring_context";
        setUp(packageWithSolution);
    }

    private static void setUp(String packageWithProblem) {
        new AnnotationConfigApplicationContext(packageWithProblem);
    }
}
