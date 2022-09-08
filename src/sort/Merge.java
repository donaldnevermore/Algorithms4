package sort;

public class Merge {
  private static Comparable[] aux;

  public static void merge(Comparable[] a, int low, int mid, int high) {
    for (int k = low; k <= high; k++) {
      aux[k] = a[k];
    }

    int i = low;
    int j = mid + 1;
    for (int k = low; k <= high; k++) {
      // Run out of the left array, take the right.
      if (i > mid) {
        a[k] = aux[j];
        j++;
      }
      // Run out of the right array, take the left.
      else if (j > high) {
        a[k] = aux[i];
        i++;
      }
      else if (Example.less(aux[j], aux[i])) {
        a[k] = aux[j];
        j++;
      }
      else {
        a[k] = aux[i];
        i++;
      }
    }
  }

  public static void sortTopDown(Comparable[] a) {
    aux = new Comparable[a.length];
    sort(a, 0, a.length - 1);
  }

  public static void sortBottomUp(Comparable[] a) {
    int n = a.length;
    aux = new Comparable[n];

    for (int size = 1; size < n; size += size) {
      for (int low = 0; low < n - size; low += size + size) {
        merge(a, low, low + size - 1, Math.min(low + size + size - 1, n - 1));
      }
    }
  }

  private static void sort(Comparable[] a, int low, int high) {
    if (low > high) {
      return;
    }

    int mid = low + (high - low) / 2;

    sort(a, low, mid);
    sort(a, mid + 1, high);
    merge(a, low, mid, high);
  }
}
