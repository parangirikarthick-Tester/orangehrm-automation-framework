package config;

public class TestConfigReader {

	public static void main(String[] args) {
		
		System.out.println(ConfigReader.getInstance().getUrl());
        System.out.println(ConfigReader.getInstance().getBrowser());

	}

}
