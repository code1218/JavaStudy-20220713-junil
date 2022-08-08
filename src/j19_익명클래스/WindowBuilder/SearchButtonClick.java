package j19_익명클래스.WindowBuilder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SearchButtonClick extends MouseAdapter{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("검색 버튼을 클릭했습니다.");
	}

}
