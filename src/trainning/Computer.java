package trainning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 电脑爱好者会自己去电脑城组装电脑，我们用代码完成一台电脑的配置：
1）必须的配件（接口）：有机箱（包括所有内部组件）——ComputerCase、显示器——Monitor、键盘鼠标——Keyboard；
2）机箱品牌（实现类）：金和田——GoldenField、大水牛——Bubalus；
3）显示器品牌（实现类）：明基——BenQ、宏基——Acer；
4）键盘鼠标品牌（实现类）：雷柏——Rapoo、罗技——Logitech；
 * 电脑实体类
* <p>Title: Computer</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年6月21日
 */
@Component
public class Computer {

	@Autowired @Qualifier("goldenField")//此处的值默认为首字母小写 
	private ComputerCase jixiang;
	@Autowired
	private Monitor xianshiqi;
	@Autowired
	private Keyboard jianpan;
	@Override
	public String toString() {
		return "Computer [jixiang=" + jixiang + ", xianshiqi=" + xianshiqi + ", jianpan=" + jianpan + "]";
	}
}
