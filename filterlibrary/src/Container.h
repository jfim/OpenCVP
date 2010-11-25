#ifndef CONTAINER_H_34908129048132094809123849012384098123094812
#define CONTAINER_H_34908129048132094809123849012384098123094812

#include <vector>

/**
 * A container for objects.
 */
template <class T> class Container {
	protected:
		Container() {}

	public:
		~Container() {}
	
	public:
		// TODO Figure out how to have a template friend declaration with g++ so that we can make this protected again
		void registerObject(T* object) {
			objects.push_back(object);
		}

	private:
		std::vector<T*> objects;

	protected:
		/**
		 * Returns all objects contained in this container.
		 */
		std::vector<T*> getObjects() {
			return objects;
		}
};

#endif
