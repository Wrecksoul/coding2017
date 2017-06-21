package com.coderising.ood.srp.refact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现商品变动接口，商品降价
 * @author Administrator
 *
 */
public class ProductPriceCutListener implements ProductChangeListener {

	//这里可以做成读取配置文件的形式，抽象一个config类
	private File file;
	public ProductPriceCutListener(){
		this.file = new File(
				"D:\\workProgram\\GitRepo\\second-season\\coding2017\\students\\82427129\\ood-design\\src\\main\\java\\com\\coderising\\ood\\srp\\product_promotion.txt");
	}
	public ProductPriceCutListener(File file){
		this.file = file;
	}
	private SubscribeManager subscribeManager;
	@Override
	public List<Product> getChangedProducts() {
		try {
			return readFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EmailObj getChangedInfomation() {
		List<User> users = subscribeManager.getSubUserByProduct(getChangedProducts());
		EmailObj email = new EmailObj();
		email.setSubject("您关注的产品降价了");
		email.setContent("尊敬的  ? , 您关注的产品 ? 降价了，欢迎购买!");
		return email;
	}
	
	private List<Product> readFile(File file) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String temp = null;
			List<Product> list = new ArrayList<>();
			while ((temp = br.readLine())!= null) {
				String[] data = temp.split(" ");
				list.add(new Product(data[0], data[1]));
				temp = null;
			}
			return list;

		} catch (IOException e) {
			throw new IOException(e.getMessage());
		} finally {
			br.close();
		}
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}

}
