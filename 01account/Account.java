/*
一个简单的记账软件
*/

class Account
{
	public static void main(String[] args) 
	{
		boolean isFlag = true;//控制循环结束

		int money = 0;//当前金额

		String info = "";//收支说明
		
		while(isFlag)
		{
			System.out.println("-----------------一个记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出\n");
			System.out.print("                   请选择(1-4)：");

			char selection = Utility.readMenuSelection();//读取Utility方法以读取输入选项'1' '2' '3' '4'

			switch(selection)
			{
				case '1':
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println("收支\t账户金额\t收支金额\t说    明");
					System.out.println(info);
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.print("本次收入金额：");
					int income = Utility.readNumber();

					if(income > 0){
						money += income;
					}

					System.out.print("本次收入说明：");
					String inDescription = Utility.readString();

					info += "收入\t" + money + "\t\t" + income + "\t\t" + inDescription + "\n";

					System.out.println("---------------------登记完成---------------------");
					break;
				case '3':
					System.out.print("本次支出金额：");
					int outcome = Utility.readNumber();

					if(outcome > 0 && money >= outcome){
						money -= outcome;
					}

					System.out.print("本次支出说明：");
					String outDescription = Utility.readString();

					info += "收出\t" + money + "\t\t" + outcome + "\t\t" + outDescription + "\n";

					System.out.println("---------------------登记完成---------------------");
					break;
				case '4':
					System.out.println("确认是否退出(Y/N)：");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y'){
						isFlag = false;
					}
					break;
			}
		}
	}
}
