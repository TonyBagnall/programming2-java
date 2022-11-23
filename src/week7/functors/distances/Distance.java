package week7.functors.distances;

/**
 * Functional interface for the operation of measuring the distance between two double arrays
 */
public interface Distance {
    double distance(double[] ar1, double[] ar2);
}
