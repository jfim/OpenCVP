package im.jeanfrancois.openvp.filterlibrary;


/*
 * 
 * class Property {
	protected:
  Constructs and registers a property.

Property(PropertyContainer* container, std::string name);

	public:
		virtual ~Property();

	private:
		std::string name;

	public:
		/**
		 * Returns the property name.
		std::string getName() {
			return name;
		}
};

 */
public class Property {
	private final String name;
	
	Property(PropertyContainer<Property> propertyContainer, String name)
	{
		this.name = name;
		propertyContainer.registerObject(this);
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
