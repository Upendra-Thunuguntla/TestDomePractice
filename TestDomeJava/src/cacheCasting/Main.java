package cacheCasting;

public class Main {

	public static void main(String[] args) {
		OptionA();
//		OptionB();
//		OptionC();
		OptionD();
//		OptionE();
		OptionF();
	}
	
	/**
	 * Option A : This will not give any error as the casting is properly done to SuperClass
	 */
	public static void OptionA() {
	
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;
	}
	
	/**
	 * Error as casting to subclass from parent class
	 */
	public static void OptionB() {
		MemoryCache memoryCache = new MemoryCache();
		Cache cache = (Cache) memoryCache;
		DiskCache diskCache = (DiskCache) cache;
	}
	
	/**
	 * Error as casting to subclass from parent class
	 */
	public static void OptionC() {
		DiskCache diskCache = new DiskCache();
		OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;
	}
	public static void OptionD() {
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		DiskCache diskCache = (DiskCache) optimizedDiskCache;
	}
	
	/**
	 * Error as casting to subclass from parent class
	 */
	public static void OptionE() {
		Cache cache = new Cache();
		MemoryCache memoryCache = (MemoryCache) cache;
	}
	
	
	public static void OptionF() {
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;
		DiskCache diskCache = (DiskCache) cache;
	}
	
}
