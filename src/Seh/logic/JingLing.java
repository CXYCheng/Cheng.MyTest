package Seh.logic;

/*
 * 	精灵类
 */

public class JingLing {

	String name; // 名称
	String type; // 系别

	int[] effect = new int[5];

	int TL; // 体力
	int WG; // 物攻
	int WF; // 物防
	int TG; // 特攻
	int TF; // 特防
	int SD; // 速度
	int BJ; // 暴击
	int SB; // 闪避

	int WGup; // 物攻加成
	int WFup; // 物防加成
	int TGup; // 特攻加成
	int TFup; // 特防加成
	int SDup; // 速度加成
	int BJup; // 暴击加成
	int SBup; // 闪避加成

	protected JingLing() {
		System.out.println("\t一只精灵诞生了！");
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
		System.out.println("\t\t ——————————————————————");
		System.out.println("\t\t|     精灵："+getName()+"     \t系："+getType());
		System.out.println("\t\t|     属性：体力："+getTL()+"\t物攻："+(getWG() + getWGup())+"\t物防："+(getWF() + getWFup()));
		System.out.println("\t\t|\t         速度："+(getSD() + getSDup())+"\t特攻："+(getTG() + getTGup())+"\t特防："+(getTF() + getTFup()));
		System.out.println("\t\t ——————————————————————");
	}
}
