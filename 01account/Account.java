/*
һ���򵥵ļ������
*/

class Account
{
	public static void main(String[] args) 
	{
		boolean isFlag = true;//����ѭ������

		int money = 0;//��ǰ���

		String info = "";//��֧˵��
		
		while(isFlag)
		{
			System.out.println("-----------------һ���������-----------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��    ��\n");
			System.out.print("                   ��ѡ��(1-4)��");

			char selection = Utility.readMenuSelection();//��ȡUtility�����Զ�ȡ����ѡ��'1' '2' '3' '4'

			switch(selection)
			{
				case '1':
					System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
					System.out.println("��֧\t�˻����\t��֧���\t˵    ��");
					System.out.println(info);
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.print("���������");
					int income = Utility.readNumber();

					if(income > 0){
						money += income;
					}

					System.out.print("��������˵����");
					String inDescription = Utility.readString();

					info += "����\t" + money + "\t\t" + income + "\t\t" + inDescription + "\n";

					System.out.println("---------------------�Ǽ����---------------------");
					break;
				case '3':
					System.out.print("����֧����");
					int outcome = Utility.readNumber();

					if(outcome > 0 && money >= outcome){
						money -= outcome;
					}

					System.out.print("����֧��˵����");
					String outDescription = Utility.readString();

					info += "�ճ�\t" + money + "\t\t" + outcome + "\t\t" + outDescription + "\n";

					System.out.println("---------------------�Ǽ����---------------------");
					break;
				case '4':
					System.out.println("ȷ���Ƿ��˳�(Y/N)��");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y'){
						isFlag = false;
					}
					break;
			}
		}
	}
}
