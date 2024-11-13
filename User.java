public class User {
	
	private String fName1;
	private String sName1;
	static String noD="7989886685";
	
	private String fName2;
	private String sName2;
	static String noM="6301018604";
    private String email1;
    private String password1;
	
    private String email2;
    private String password2;
	
	/*double bal1=10000;
	double bal2=10000;
	double bal3;*/
	
	//Mobile 
	public void setMN(String s){
		noM=s;
	}
	public String getMM(){
		return noM;
	}
	public void setDN(String s){
		noD=s;
	}
	public String getMD(){
		return noD;
	}




	// Getters and Setters Names //user1
    public String getFName1() {
        return fName1;
    }

    public void setFName1(String fName1) {
        this.fName1 = fName1;
    }
	
	public String getSName1() {
        return sName1;
    }

    public void setSName1(String sName1) {
        this.sName1 = sName1;
    }
	//user2
	public String getFName2() {
        return fName2;
    }

    public void setFName2(String fName2) {
        this.fName2 = fName2;
    }
	
	public String getSName2() {
        return sName2;
    }

    public void setSName2(String sName2) {
        this.sName2 = sName2;
    }




	
    // Getters and Setters username or email
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
	
	
	
	
	
	
	
	
}
