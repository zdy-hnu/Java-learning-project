/*
һ���򵥵ļ������
*/

class Account
{
	public static void main(String[] args) 
	{
		boolean isFlag = true;
		
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
					System.out.println("                   1 ��֧��ϸ");
					break;
				case '2':
					System.out.println("                   2 ��֧��ϸ");
					break;
				case '3':
					System.out.println("                   3 ��֧��ϸ");
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
