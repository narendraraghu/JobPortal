package src.com.app.POJO;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name = "TBL_IMAGES")
public class ImageWapperPojo implements Serializable {
     
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
     
    @Column(name = "IMAGE_NAME", unique = false, nullable = false, length = 100)
    private String imageName;
     
    @Column(name = "DATA", unique = false, nullable = false, length = 100000)
    private byte[] data;
    
    public ImageWapperPojo() {
		// TODO Auto-generated constructor stub
	}

	public ImageWapperPojo(String imageName, byte[] data) {
		super();
		this.imageName = imageName;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ImageWapperPojo [id=" + id + ", imageName=" + imageName
				+ ", data=" + Arrays.toString(data) + "]";
	}
     
    
    //Getters and Setters
}