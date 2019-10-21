import java.net.*;
import java.io.*;

public interface Encoder {
	void encodeRequest(DataOutputStream out, Request request) throws Exception;
	void encodeResponse(DataOutputStream out, Response response) throws Exception;
}
