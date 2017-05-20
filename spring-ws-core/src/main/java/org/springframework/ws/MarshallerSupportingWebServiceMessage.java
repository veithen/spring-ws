package org.springframework.ws;

import java.io.IOException;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public interface MarshallerSupportingWebServiceMessage extends WebServiceMessage {
	Object unmarshal(Unmarshaller unmarshaller) throws IOException;
	void marshal(Marshaller marshaller, Object graph) throws IOException;
}
