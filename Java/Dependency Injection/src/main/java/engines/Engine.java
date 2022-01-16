package engines;

import com.google.inject.ImplementedBy;

/**
 * This interface uses the @ImplementedBy annotation, which specifies a default binding if there is no binding
 * specified for the Engine in a Guice Module. In the case below, we are going to inject the V6Engine by default.
 * 
 * @author pravatbhusal
 *
 */
@ImplementedBy(V6Engine.class)
public interface Engine {
	
	String getModel();
}
