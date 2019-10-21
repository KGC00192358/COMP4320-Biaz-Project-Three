import java.io.*;

public class EncoderBin implements Encoder, EncoderDecoderConst {
	private String encoding;

	public EncoderBin() {
		encoding = DEFAULT_ENCODING;
	}

	public void encodeRequest(DataOutputStream out, Request request) throws Exception {
		
		out.writeByte(request.TML);
		out.writeByte(request.RequestID);
		out.writeByte(request.Operation);
		out.writeByte(request.NumberofOperands);
		out.writeShort(request.Operand1);
		out.writeShort(request.Operand2);


	}


	public void encodeResponse(DataOutputStream out, Response response) throws Exception {
		

		out.writeByte(response.TML);
		out.writeByte(response.RequestID);
		out.writeByte(response.ErrorCode);
		out.writeInt(response.Result);


	}



}
