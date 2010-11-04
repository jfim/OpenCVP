#ifndef CONTAINER_H_34908129048132094809123849012384098123094812
#define CONTAINER_H_34908129048132094809123849012384098123094812

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
		 */
		std::vector<T*> getObjects() {
			return objects;
		}
};

#endif
