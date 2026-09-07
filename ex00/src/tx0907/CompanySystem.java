package tx0907;

import java.util.ArrayList;

public class CompanySystem {

	public static void main(String[] args) {
		ArrayList<FullStaff> fs = new ArrayList<>();
		ArrayList<NonStaff> ns = new ArrayList<>();
		
		// 정규직 사원들의 정보 출력
		fs.add(new FullStaff("Dans", "M10_SAU", "1", 4952222, 30000));
		fs.add(new FullStaff("Daeial", "M10_SAU", "2", 5000000, 30000));
		fs.add(new FullStaff("DOAS", "M14_FO", "3", 4000000, 30000));
		fs.add(new FullStaff("NPPAS", "M14_FO", "4", 6000000, 30000));
		fs.add(new FullStaff("COANS", "M16_ROAB", "5", 3000000, 30000));

		// 비정규직 사원들 정보 출력
		ns.add(new NonStaff("NON1", "M10", "X", 1800000, 10000));
		ns.add(new NonStaff("NON4", "M10", "X", 1800000, 10000));
		ns.add(new NonStaff("NON2", "M14", "X", 2000000, 10000));
		ns.add(new NonStaff("NON3", "M15", "X", 1600000, 10000));

		// 기능 한줄로 정리
		CompanyManagement companyManagement =  new CompanyManagement(fs, ns);
	}

}
