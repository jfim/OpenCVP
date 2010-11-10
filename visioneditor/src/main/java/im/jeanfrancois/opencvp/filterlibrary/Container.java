package im.jeanfrancois.opencvp.filterlibrary;

import java.util.List;
import java.util.Vector;


/*
 * A container for objects.
 */
/*
template <class T> class Container {
	protected:
		Container() {}

	public:
		~Container() {}
	
	private:
		friend T;

		void registerObject(T* object) {
			objects.push_back(object);
		}

		std::vector<T*> objects;

	protected:
		/**
		 * Returns all objects contained in this container.
		 
		std::vector<T*> getObjects() {
			return objects;
		}
}
*/

public class Container<T> implements IContainer<T> {
	private List<T> objects = new Vector<T>();
	
	Container()
	{}
	
	void registerObject(T object)
	{
		objects.add(object);
	}
	
	protected List<T> getObjects()
	{
		// TODO may be return a unmodifiable collection
		return objects;
	}
}
