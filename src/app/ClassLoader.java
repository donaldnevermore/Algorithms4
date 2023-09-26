package app;

public abstract class ClassLoader {
  /*
  // The parent class loader for delegation
  private final ClassLoader parent;

  public Class<?> loadClass(String name) throws ClassNotFoundException {
    return loadClass(name, false);
  }

  protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
    synchronized (getClassLoadingLock(name)) {
      // First, check if the class has already been loaded
      Class<?> c = findLoadedClass(name);
      if (c == null) {
        try {
          if (parent != null) {
            c = parent.loadClass(name, false);
          } else {
            c = findBootstrapClassOrNull(name);
          }
        } catch (ClassNotFoundException e) {
          // ClassNotFoundException thrown if class not found
          // from the non-null parent class loader
        }

        if (c == null) {
          // If still not found, then invoke findClass in order
          // to find the class.
          c = findClass(name);
        }
      }
      if (resolve) {
        resolveClass(c);
      }
      return c;
    }
  }*/

  protected Class<?> findClass(String name) throws ClassNotFoundException {
    throw new ClassNotFoundException(name);
  }
}
