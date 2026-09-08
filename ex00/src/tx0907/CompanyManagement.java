package tx0907;

import java.util.ArrayList;

public class CompanyManagement {
	
	
	public CompanyManagement(ArrayList<FullStaff> fs ,ArrayList<NonStaff> ns) {
		System.out.println("========================정규직=======================");
		int list1 = 0;
		int list2 = 0;
		int list3 = 0;
		String listtag1 = null;
		String listtag2 = null;
		String listtag3 = null;
		for (FullStaff f : fs) {
			System.out.println(f);

			if (f.getDepartment().equals("M10_SAU")) {
				list1 += f.getSalary();
			}
			else if (f.getDepartment().equals("M14_FO")) {
				list2 += f.getSalary();
			}
			else if (f.getDepartment().equals("M16_ROAB")) {
				list3 += f.getSalary();
			}
		}
		System.out.println("M10_SAU 부서의 총 급여: " + list1 + "원");
		System.out.println("M14_FO 부서의 총 급여: " + list2 + "원");
		System.out.println("M16_ROAB 부서의 총 급여:" + list3 + "원");
		
		System.out.println("========================[계약직]*=========================================");

		// 비정규직중 급여가 제일 높은사람
		int highSalary = 0;
		String hightname = "";
		int total10 = 0;
		int total14 = 0;
		int total15 = 0;

		for (NonStaff n : ns) {
			System.out.println(n);
			if (n.getSalary() > highSalary) {
				highSalary = n.getSalary();
				hightname = n.getName();
			}
			if (n.getDepartment().equals("M10")) {
				total10 += n.getSalary();
			}
			else if (n.getDepartment().equals("M14")) {
				total14 += n.getSalary();
			}
			else if (n.getDepartment().equals("M15")) {
				total15 += n.getSalary();
			}
		}
		System.out.println("M10 부서의 총급여는:" + total10 + "원");
		System.out.println("M14 부서의 총급여는:" + total14 + "원");
		System.out.println("M15 부서의 총급여는:" + total15 + "원");
		System.out.println("가장 급여가 높은 \n비정규직 직원은\n" + hightname + "이며" + " \n" + "금액" + highSalary + "원 입니다 ");
	}

	public void CreateManagment() {
	
	}
	
	public void UpdateManagment() {
		
	}
	
	public void delete() {
		
	}
}
