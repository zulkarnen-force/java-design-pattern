package structural.decorators;

import java.util.Base64;


public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encoded(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encoded(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }

        return Base64.getEncoder().encodeToString(result);
    }


    private String decode(String encodedData) {
        byte[] result = Base64.getDecoder().decode(encodedData);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }

        return new String(result);
    }
    
}
 