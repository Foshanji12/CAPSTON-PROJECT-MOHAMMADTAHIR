package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private SignInPage signinpage;
	private Accountpage accountoption;

	public POMFactory() {
		this.signinpage = new SignInPage();
	}

	public SignInPage signinpage() {
		return this.signinpage;
	}

	public homepage homepage() {

		return this.homepage();
	}

	public Accountpage accountpage() {
		return this.accountpage();
	}
}
