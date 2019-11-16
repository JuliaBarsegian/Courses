package HW_08_11_19.Task4;

public class DifferentTypes<T> {
    T[] difTypes;

    public DifferentTypes(T[] difTypes) {
        this.difTypes = difTypes;
    }

    public T[] getDifTypes() {
        return difTypes;
    }

    public void index(T[] arr, int ind) {
        System.out.println(arr[ind]);
    }
}
