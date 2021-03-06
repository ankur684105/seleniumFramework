package utilPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.apache.commons.io.FileUtils;

public class ExtensionInstaller extends PropertiesReader {

	public String file = System.getProperty("user.dir") + "//ExtensionResouces//CRX";
	public String directory = System.getProperty("user.dir") + "//ExtensionResouces//";
	File extensionResources = new File(directory);
	public String filePlayer = System.getProperty("user.dir") + "//ExtensionResouces//letznav_player.crx";
	public String editorUrl = PropertiesReader.getValue("editorurl");
	public String playerUrl = PropertiesReader.getValue("playerurl");
	public String downloadUrl;
	public String filePath;

	public void downloadExtension(String extensionName) {
		if (extensionName.equalsIgnoreCase("player")) {
			downloadUrl = playerUrl;
			filePath = file.replace("CRX", "letznav_player.crx");
		} else if (extensionName.equalsIgnoreCase("editor")) {
			downloadUrl = editorUrl;
			filePath = file.replace("CRX", "letznav_editor.crx");
		}
		try {
			URL url = new URL(downloadUrl);
			ReadableByteChannel rbc = Channels.newChannel(url.openStream());
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			rbc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearExtensionResources() throws IOException {
		FileUtils.cleanDirectory(extensionResources);
	}

}
