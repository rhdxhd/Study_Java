package test01.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {
	Scanner sc = new Scanner(System.in);
	List<BoardDAO> list;
	
	
	
	public BoardDAO ( ) {
		
	}
	
	
	public void post(String write) {
		ArrayList<String> iList = new ArrayList<>();
		iList.add(write);
		
	}
	
	public void delete(int number) {
		ArrayList<String> iList = new ArrayList<>();
		iList.remove(number);
	}
	
	public void find(String find) {
		ArrayList<BoardDTO> dto = new ArrayList<>();
		ArrayList<String> iList = new ArrayList<>();
		for(int i=0; i<iList.size(); i++) {
			if(iList.get(i).equals(find)) {
				System.out.println(dto.get(i).getContent());
			}
		}
	
	
}
}