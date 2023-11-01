package pack02.abcsqlplus;

import java.util.Scanner;

public class AbcSqlMain {
	public static void main(String[] args) {
		AbcSqlDAO dao = new AbcSqlDAO();
		Scanner sc = new Scanner(System.in);
		
		
		//dao.sendSql("select * from member ");
		int checkCount = 1 ;
		while(checkCount <=3 ) {
			System.out.println("사용자명 입력: ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력: ");
			String pw = sc.nextLine();
			if(dao.checkConnection(id,pw)) {
				while(true) {
					System.out.println("SQL 입력");
					String sql = sc.nextLine();
					if(sql.equals("exit")) {
						break;
					}
					dao.sendSql(sql);
				}
			}
		}
	}
}