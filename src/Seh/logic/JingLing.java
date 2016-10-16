package Seh.logic;

/*
 * 	������
 */

public class JingLing {

	String name; // ����
	String type; // ϵ��

	int[] effect = new int[5];

	int TL; // ����
	int WG; // �﹥
	int WF; // ���
	int TG; // �ع�
	int TF; // �ط�
	int SD; // �ٶ�
	int BJ; // ����
	int SB; // ����

	int WGup; // �﹥�ӳ�
	int WFup; // ����ӳ�
	int TGup; // �ع��ӳ�
	int TFup; // �ط��ӳ�
	int SDup; // �ٶȼӳ�
	int BJup; // �����ӳ�
	int SBup; // ���ܼӳ�

	protected JingLing() {
		System.out.println("\tһֻ���鵮���ˣ�");
	}

	protected JingLing(String name, String type, int TL, int WG, int WF, int TG, int TF, int SD, int BJ, int SB) {

		this.name = name;
		this.type = type;
		this.TL = TL;
		this.WG = WG;
		this.WF = WF;
		this.TG =TG;
		this.TF = TF;
		this.SD = SD;
		this.BJ = BJ;
		this.SB = SB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int[] getEffect() {
		return effect;
	}

	public void setEffect(int i,int go) {
		this.effect[i] = go;
	}

	public int getTL() {
		return TL;
	}

	public void setTL(int tL) {
		TL = tL;
	}

	public int getWG() {
		return WG;
	}

	public void setWG(int wG) {
		WG = wG;
	}

	public int getWF() {
		return WF;
	}

	public void setWF(int wF) {
		WF = wF;
	}

	public int getTG() {
		return TG;
	}

	public void setTG(int tG) {
		TG = tG;
	}

	public int getTF() {
		return TF;
	}

	public void setTF(int tF) {
		TF = tF;
	}

	public int getSD() {
		return SD;
	}

	public void setSD(int sD) {
		SD = sD;
	}

	public int getBJ() {
		return BJ;
	}

	public void setBJ(int bJ) {
		BJ = bJ;
	}

	public int getSB() {
		return SB;
	}

	public void setSB(int sB) {
		SB = sB;
	}

	public int getWGup() {
		return WGup;
	}

	public void setWGup(int wGup) {
		WGup = wGup;
	}

	public int getWFup() {
		return WFup;
	}

	public void setWFup(int wFup) {
		WFup = wFup;
	}

	public int getTGup() {
		return TGup;
	}

	public void setTGup(int tGup) {
		TGup = tGup;
	}

	public int getTFup() {
		return TFup;
	}

	public void setTFup(int tFup) {
		TFup = tFup;
	}

	public int getSDup() {
		return SDup;
	}

	public void setSDup(int sDup) {
		SDup = sDup;
	}

	public int getBJup() {
		return BJup;
	}

	public void setBJup(int bJup) {
		BJup = bJup;
	}

	public int getSBup() {
		return SBup;
	}

	public void setSBup(int sBup) {
		SBup = sBup;
	}

	public  void print() {
		
		System.out.println();
		System.out.println("\t\t ��������������������������������������������");
		System.out.println("\t\t|     ���飺"+getName()+"     \tϵ��"+getType());
		System.out.println("\t\t|     ���ԣ�������"+getTL()+"\t�﹥��"+(getWG() + getWGup())+"\t�����"+(getWF() + getWFup()));
		System.out.println("\t\t|\t         �ٶȣ�"+(getSD() + getSDup())+"\t�ع���"+(getTG() + getTGup())+"\t�ط���"+(getTF() + getTFup()));
		System.out.println("\t\t ��������������������������������������������");
	}
}
